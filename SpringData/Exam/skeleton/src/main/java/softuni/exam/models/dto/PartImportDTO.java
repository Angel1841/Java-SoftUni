package softuni.exam.models.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PartImportDTO {

    @Size(min = 2, max = 19)
    private String partName;

    @DecimalMax(value = "2000")
    @DecimalMin(value = "10")
    private Double price;

    @Positive
    private int quantity;
}
