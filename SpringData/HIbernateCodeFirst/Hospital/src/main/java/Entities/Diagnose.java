package Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table
public class Diagnose extends BaseEntity {

    @Column(nullable = false, length = 30)
    private String name;

    @Column(length = 100)
    private String comments;

    @ManyToMany(mappedBy = "diagnoses")
    private Set<Patient> patients;

}
