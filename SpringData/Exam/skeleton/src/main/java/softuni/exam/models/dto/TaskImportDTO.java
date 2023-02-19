package softuni.exam.models.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import softuni.exam.models.dto.TaskNeededDTOS.CarIdDto;
import softuni.exam.models.dto.TaskNeededDTOS.MechanicNameDto;
import softuni.exam.models.dto.TaskNeededDTOS.PartIdDto;
import softuni.exam.models.entity.Car;
import softuni.exam.models.entity.Mechanic;
import softuni.exam.models.entity.Part;
import softuni.exam.util.LocalDateAdapter;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name = "task")
@XmlAccessorType(XmlAccessType.FIELD)
public class TaskImportDTO {

    @NotNull
    @XmlElement
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    private LocalDateTime date;

    @Positive
    @NotNull
    @XmlElement
    private BigDecimal price;

    @XmlElement(name = "car")
    private CarIdDto carId;

    @XmlElement(name = "mechanic")
    private MechanicNameDto firstName;

    @XmlElement
    private PartIdDto part;


}
