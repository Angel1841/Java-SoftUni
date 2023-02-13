package com.softuni.jsonexercise.Domain.DTOS.Users;

import com.softuni.jsonexercise.Domain.DTOS.Products.ProductsSoldWithCountDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserWithProductDTO {



    private String firstName;

    private String lastName;

    private Integer age;

    private ProductsSoldWithCountDTO products;

}
