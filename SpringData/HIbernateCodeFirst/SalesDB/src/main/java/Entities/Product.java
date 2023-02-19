package Entities;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @NotNull
    @Column(length = 50, unique = true)
    private String name;

    @Column
    private Double quantity;

    @Column
    private BigDecimal price;

    @OneToMany(mappedBy = "product")
    private Set<Sale> sales;


}
