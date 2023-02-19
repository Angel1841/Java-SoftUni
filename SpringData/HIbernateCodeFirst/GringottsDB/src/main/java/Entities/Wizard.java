package Entities;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity

public class Wizard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String firstName;

    @NotNull
    @Column(length = 60)
    private String lastName;

    @Column(length = 1000)
    private long notes;

    @Column
    private long age;

    @OneToOne
    @JoinColumn
    private MagicWand magicWand;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(name = "wizard_deposit")
    private List<Deposit> deposits;


}
