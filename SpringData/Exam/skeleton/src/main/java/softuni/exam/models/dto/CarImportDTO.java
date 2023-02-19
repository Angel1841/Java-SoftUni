package softuni.exam.models.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import softuni.exam.models.entity.enums.CarType;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name = "car")
@XmlAccessorType(XmlAccessType.FIELD)
public class CarImportDTO {

    @Size(min = 2, max = 30)
    @NotNull
    @XmlElement
    private String carMake;

    @Size(min = 2, max = 30)
    @NotNull
    @XmlElement
    private String carModel;

    @Positive
    @NotNull
    @XmlElement
    private int year;

    @Size(min = 2, max = 30)
    @NotNull
    @XmlElement
    private String plateNumber;

    @Positive
    @NotNull
    @XmlElement
    private int kilometers;

    @DecimalMin(value = "1.00")
    @NotNull
    @XmlElement
    private Double engine;

    @NotNull
    @XmlElement
    private CarType carType;


}
