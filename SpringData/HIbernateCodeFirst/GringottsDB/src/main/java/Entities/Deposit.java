package Entities;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "deposit")
public class Deposit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "d_group")
    private String group;

    @Column
    private Date startDate;

    @Column
    private double amount;

    @Column
    private double interest;

    @Column
    private double charge;

    @Column
    private Date expirationDate;

    @Column
    private boolean isExpired;
}
