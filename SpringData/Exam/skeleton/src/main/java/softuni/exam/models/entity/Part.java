package softuni.exam.models.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "parts")
public class Part extends BaseEntity{

    @Column(name = "part_name", unique = true)
    @Size(min = 2, max = 19)
    private String partName;

    @Column
    @Min(value = 10)
    @Max(value = 2000)
    private Double price;

    //must be positive
    @Column
    private int quantity;

}
