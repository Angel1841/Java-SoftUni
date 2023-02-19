package softuni.exam.models.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "mechanics")
public class Mechanic extends BaseEntity {

    @Column(name = "first_name", unique = true, nullable = false)
    @Size(min = 2)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    @Size(min = 2)
    private String lastName;

    @Column(nullable = false)
    private String email;

    @Column(nullable = true, unique = true)
    @Size(min = 2)
    private String phone;
}
