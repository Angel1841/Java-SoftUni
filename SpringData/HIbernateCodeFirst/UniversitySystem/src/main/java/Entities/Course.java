package Entities;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table
public class Course extends BaseEntity {

    @NotNull
    @Column(length = 25)
    private String name;

    @NotNull
    @Column(length = 5000)
    private String description;

    @Column
    private Date startDate;

    @Column
    private Date endDate;

    @Column
    private int credits;

    @ManyToOne
    private Teacher teacher;

    @ManyToMany(mappedBy = "courses")
    private Set<Student> students;

}
