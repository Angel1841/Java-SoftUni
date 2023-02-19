package Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table
public class User extends BaseEntity {

    @Column(name = "first_name", nullable = false, length = 30)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 30)
    private String lastName;

    @Column(unique = true, nullable = false, length = 30)
    private String email;

    @Column(nullable = false, length = 30)
    private String password;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private Set<BillingDetail> billingDetails;

}
