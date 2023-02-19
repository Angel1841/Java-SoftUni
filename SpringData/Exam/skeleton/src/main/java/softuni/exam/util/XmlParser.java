package softuni.exam.util;

import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

@Component
public class XmlParser {

    public <T> T fromFile(File filePath, Class<T> object) throws JAXBException, FileNotFoundException {
        JAXBContext context = JAXBContext.newInstance(object);
        Unmarshaller unmarshaller = context.createUnmarshaller();

        FileReader fileReader = new FileReader(filePath);

        return (T) unmarshaller.unmarshal(fileReader);
    }

}