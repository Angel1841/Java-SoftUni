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
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @NotNull
    @Column(length = 50)
    private String name;

    @NotNull
    @Column(length = 50, unique = true)
    private String email;

    @Column(length = 30)
    private String creditCardNumber;

    @OneToMany(mappedBy = "customer")
    private Set<Sale> sales;

}
