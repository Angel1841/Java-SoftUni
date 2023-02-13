package com.softuni.jsonexercise.Domain.DTOS.Users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserImportDTO {

    private String firstName;

    private String lastName;

    private Integer age;

}
