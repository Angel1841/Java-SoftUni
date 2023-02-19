package softuni.exam.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import softuni.exam.models.dto.TaskImportDTO;
import softuni.exam.models.dto.TaskWrapperDTO;
import softuni.exam.models.entity.Car;
import softuni.exam.models.entity.Mechanic;
import softuni.exam.models.entity.Part;
import softuni.exam.models.entity.Task;
import softuni.exam.models.entity.enums.CarType;
import softuni.exam.repository.CarRepository;
import softuni.exam.repository.MechanicRepository;
import softuni.exam.repository.PartRepository;
import softuni.exam.repository.TaskRepository;
import softuni.exam.service.TaskService;
import softuni.exam.util.ValidationUtils;
import softuni.exam.util.XmlParser;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import static softuni.exam.config.Paths.TASKS_PATH;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    private final MechanicRepository mechanicRepository;

    private final PartRepository partRepository;

    private final CarRepository carRepository;

    private final XmlParser xmlParser;

    private final ValidationUtils validator;

    private final ModelMapper modelMapper;



    @Autowired
    public TaskServiceImpl(TaskRepository taskRepository, MechanicRepository mechanicRepository, PartRepository partRepository, CarRepository carRepository, XmlParser xmlParser, ValidationUtils validator, ModelMapper modelMapper) {
        this.taskRepository = taskRepository;
        this.mechanicRepository = mechanicRepository;
        this.partRepository = partRepository;
        this.carRepository = carRepository;
        this.xmlParser = xmlParser;
        this.validator = validator;
        this.modelMapper = modelMapper;
    }

    @Override
    public boolean areImported() {
        return this.taskRepository.count() > 0;
    }

    @Override
    public String readTasksFileContent() throws IOException {
        return Files.readString(TASKS_PATH);
    }

    @Override
    public String importTasks() throws IOException, JAXBException {

        File file = TASKS_PATH.toFile();

        TaskWrapperDTO taskWrapperDTO = xmlParser.fromFile(file, TaskWrapperDTO.class);

        final List<TaskImportDTO> taskList = taskWrapperDTO.getTaskList();

        final StringBuilder sb = new StringBuilder();

        for (var dto: taskList) {

            boolean isValid = validator.isValid(dto);

            if(this.taskRepository.findFirstByCar_Id(dto.getCarId().getId()).isPresent()){
                isValid = false;
            }

            if(isValid){

                Task task = modelMapper.map(dto, Task.class);

                if(this.mechanicRepository.findFirstByFirstName(dto.getFirstName().getFirstName()).isPresent()){

                    Car car = this.carRepository.findFirstById(dto.getCarId().getId())
                            .orElseThrow(NoSuchElementException::new);

                    task.setCar(car);

                    Mechanic mechanic = this.mechanicRepository.findFirstByFirstName(dto.getFirstName().getFirstName())
                            .orElseThrow(NoSuchElementException::new);

                    task.setMechanic(mechanic);

                    Part part = this.partRepository.findFirstById(dto.getPart().getId())
                            .orElseThrow(NoSuchElementException::new);

                    task.setPart(part);

                    this.taskRepository.saveAndFlush(task);

                    sb.append(String.format("Successfully imported task %.2f", task.getPrice()));

                }
                else {
                    sb.append("Invalid task%n");
                }

            } else {
                sb.append("Invalid task%n");
            }

        }

        return sb.toString();
    }

    @Override
    public String getCoupeCarTasksOrderByPrice() {
        return this.taskRepository.findAllByCar_CarTypeOrderByPriceDesc(CarType.coupe)
                .orElseThrow(NoSuchElementException::new)
                .stream()
                .map(Task::toString)
                .collect(Collectors.joining(System.lineSeparator()));
    }
}
