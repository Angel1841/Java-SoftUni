package Entities;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table
public class Visitation extends BaseEntity {

    @NotNull
    @Column
    private Date date;

    @Column(length = 100)
    private String comments;

    @ManyToOne(optional = false)
    @JoinColumn(referencedColumnName = "id")
    private Patient patient;

}