package softuni.exam.models.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MechanicImportDTO {

    @NotNull
    @Size(min = 2)
    private String firstName;

    @Size(min = 2)
    private String lastName;

    @Email
    @NotNull
    private String email;

    @Size(min = 2)
    private String phone;

}
