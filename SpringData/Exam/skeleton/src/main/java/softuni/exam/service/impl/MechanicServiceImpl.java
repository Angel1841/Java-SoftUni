package softuni.exam.service.impl;

import com.google.gson.Gson;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import softuni.exam.models.dto.MechanicImportDTO;
import softuni.exam.models.entity.Mechanic;
import softuni.exam.models.entity.Part;
import softuni.exam.repository.MechanicRepository;
import softuni.exam.service.MechanicService;
import softuni.exam.util.ValidationUtils;

import java.io.IOException;
import java.nio.file.Files;

import static softuni.exam.config.Paths.MECHANICS_PATH;

@Service
public class MechanicServiceImpl implements MechanicService {

    private MechanicRepository mechanicRepository;

    private final Gson gson;

    private final ValidationUtils validator;

    private final ModelMapper modelMapper;

    @Autowired
    public MechanicServiceImpl(MechanicRepository mechanicRepository, Gson gson, ValidationUtils validator, ModelMapper modelMapper) {
        this.mechanicRepository = mechanicRepository;
        this.gson = gson;
        this.validator = validator;
        this.modelMapper = modelMapper;
    }

    @Override
    public boolean areImported() {
        return this.mechanicRepository.count() > 0;
    }

    @Override
    public String readMechanicsFromFile() throws IOException {
        return Files.readString(MECHANICS_PATH);
    }

    @Override
    public String importMechanics() throws IOException {

        MechanicImportDTO[] mechanicImport = gson.fromJson(readMechanicsFromFile(), MechanicImportDTO[].class);

        StringBuilder sb = new StringBuilder();

        for (var mechanicDTO: mechanicImport ) {

            boolean isValid = validator.isValid(mechanicDTO);

            if(this.mechanicRepository.findFirstByFirstName(mechanicDTO.getFirstName()).isPresent()){
                isValid = false;
            }

            if(isValid){

                Mechanic mechanic = modelMapper.map(mechanicDTO, Mechanic.class);

                this.mechanicRepository.saveAndFlush(mechanic);

                sb.append(String.format("Successfully imported mechanic %s %s", mechanic.getFirstName(), mechanic.getLastName()));

            } else {
                sb.append("Invalid mechanic");
            }

        }

        return sb.toString();
    }
}
