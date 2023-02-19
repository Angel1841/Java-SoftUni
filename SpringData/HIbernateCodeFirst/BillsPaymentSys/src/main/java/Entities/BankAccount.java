package Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "bank_account")
public class BankAccount extends BillingDetail {

    @Column(name = "bank", length = 30)
    private String name;

    @Column(name = "swift", length = 30)
    private String swiftCode;

}

