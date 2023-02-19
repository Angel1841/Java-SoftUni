package Entities;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table
public class Medicament extends BaseEntity {

    @NotNull
    @Column( length = 40)
    private String name;

    @ManyToMany(mappedBy = "prescriptions")
    private Set<Patient> patients;

}
