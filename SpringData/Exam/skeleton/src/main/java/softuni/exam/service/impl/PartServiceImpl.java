package softuni.exam.service.impl;

import com.google.gson.Gson;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import softuni.exam.models.dto.PartImportDTO;
import softuni.exam.models.entity.Part;
import softuni.exam.repository.PartRepository;
import softuni.exam.service.PartService;
import softuni.exam.util.ValidationUtils;

import java.io.IOException;
import java.nio.file.Files;

import static softuni.exam.config.Paths.PARTS_PATH;

@Service
public class PartServiceImpl implements PartService {

    private final PartRepository partRepository;

    private final Gson gson;

    private final ValidationUtils validator;

    private final ModelMapper modelMapper;


    @Autowired
    public PartServiceImpl(PartRepository partRepository, Gson gson, ValidationUtils validator, ModelMapper modelMapper) {
        this.partRepository = partRepository;
        this.gson = gson;
        this.validator = validator;
        this.modelMapper = modelMapper;
    }


    @Override
    public boolean areImported() {
        return this.partRepository.count() > 0;
    }

    @Override
    public String readPartsFileContent() throws IOException {
        return Files.readString(PARTS_PATH);
    }

    @Override
    public String importParts() throws IOException {
        PartImportDTO[] partImport = gson.fromJson(readPartsFileContent(), PartImportDTO[].class);

        final StringBuilder sb = new StringBuilder();

        for (var partDTO: partImport ) {

            boolean isValid = validator.isValid(partDTO);

            if(this.partRepository.findFirstByPartName(partDTO.getPartName()).isPresent()){
                isValid = false;
            }

            if(isValid){

                Part part = modelMapper.map(partDTO, Part.class);

                this.partRepository.saveAndFlush(part);

                sb.append(String.format("Successfully imported part %s - %.2f", part.getPartName(), part.getPrice()));

            } else {
                sb.append("Invalid part%n");
            }

        }

        return sb.toString();
    }
}
