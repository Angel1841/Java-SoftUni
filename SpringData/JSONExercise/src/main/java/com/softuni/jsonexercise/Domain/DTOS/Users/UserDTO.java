package com.softuni.jsonexercise.Domain.DTOS.Users;

import com.softuni.jsonexercise.Domain.DTOS.Products.ProductDTO;
import com.softuni.jsonexercise.Domain.Entities.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

import static com.softuni.jsonexercise.Domain.DTOS.Products.ProductDTO.toProductsSoldWithCountDto;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private String firstName;

    private String lastName;

    private Integer age;

    private Set<User> friends;

    private Set<ProductDTO> sellingProducts;

    private Set<ProductDTO> boughtProducts;

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public UserWithProductDTO toUserWithProductsDto() {
        return new UserWithProductDTO(firstName, lastName, age, toProductsSoldWithCountDto(sellingProducts));
    }

}
