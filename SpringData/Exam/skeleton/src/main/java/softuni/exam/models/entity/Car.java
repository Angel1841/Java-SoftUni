package softuni.exam.models.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import softuni.exam.models.entity.enums.CarType;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "cars")
public class Car extends BaseEntity{

    @Enumerated(EnumType.STRING)
    @Column(name = "car_type", nullable = false)
    private CarType carType;

    @Size(min = 2, max = 30)
    @Column(name = "car_make", nullable = false)
    private String carMake;

    @Size(min = 2, max = 30)
    @Column(name = "car_model", nullable = false)
    private String carModel;

    //should be positive
    @Column(nullable = false)
    private int year;

    @Size(min = 2, max = 30)
    @Column(name = "plate_number", unique = true, nullable = false)
    private String plateNumber;

    //should be positive
    @Column(nullable = false)
    private int kilometers;

    @Column(nullable = false)
    private Double engine;

}
