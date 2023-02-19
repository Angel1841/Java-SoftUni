package Entities;

import com.sun.istack.NotNull;

import javax.persistence.Column;

public abstract class BasePerson extends BaseEntity {

    @NotNull
    @Column(name = "first_name", length = 25)
    private String name;

    @NotNull
    @Column(length = 25)
    private String lastName;

    @Column(name = "phone_number", length = 10)
    private String phoneNumber;

}
