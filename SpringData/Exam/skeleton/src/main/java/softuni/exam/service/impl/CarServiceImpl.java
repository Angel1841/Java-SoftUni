package softuni.exam.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import softuni.exam.models.dto.CarImportDTO;
import softuni.exam.models.dto.CarWrapperDTO;
import softuni.exam.models.entity.Car;
import softuni.exam.repository.CarRepository;
import softuni.exam.service.CarService;
import softuni.exam.util.ValidationUtils;
import softuni.exam.util.XmlParser;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import static softuni.exam.config.Paths.CARS_PATH;

@Service
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    private final XmlParser xmlParser;

    private final ValidationUtils validator;

    private final ModelMapper modelMapper;

    @Autowired
    public CarServiceImpl(CarRepository carRepository, XmlParser xmlParser, ValidationUtils validator, ModelMapper modelMapper) {
        this.carRepository = carRepository;
        this.xmlParser = xmlParser;
        this.validator = validator;
        this.modelMapper = modelMapper;
    }


    @Override
    public boolean areImported() {
        return this.carRepository.count() > 0;
    }

    @Override
    public String readCarsFromFile() throws IOException {
        return Files.readString(CARS_PATH);
    }

    @Override
    public String importCars() throws IOException, JAXBException {

        File file = CARS_PATH.toFile();

        CarWrapperDTO carWrapperDTO = xmlParser.fromFile(file, CarWrapperDTO.class);

        final List<CarImportDTO> carList = carWrapperDTO.getCarList();

        final StringBuilder sb = new StringBuilder();

        for (var dto: carList) {

            boolean isValid = validator.isValid(dto);

            if(this.carRepository.findFirstByPlateNumber(dto.getPlateNumber()).isPresent()){
                isValid = false;
            }

            if(isValid){

                    Car car = modelMapper.map(dto, Car.class);

                    this.carRepository.saveAndFlush(car);

                    sb.append(String.format("Successfully imported car %s - %s", car.getCarMake(), car.getCarModel()));

            } else {
                sb.append("Invalid car");
            }

        }

        return sb.toString();
    }
}
