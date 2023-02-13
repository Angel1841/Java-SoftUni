package com.softuni.jsonexercise.Domain.DTOS.Users;


import com.softuni.jsonexercise.Domain.DTOS.Products.ProductsSoldDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsersWithSoldProductsDTO {

    private String firstName;
    private String lastName;
    private List<ProductsSoldDTO> boughtProducts;

}
