package com.softuni.jsonexercise.Domain.DTOS.Products;

import com.softuni.jsonexercise.Domain.DTOS.Categories.CategoryDTO;
import com.softuni.jsonexercise.Domain.DTOS.Users.UserDTO;
import com.softuni.jsonexercise.Domain.Entities.Category;
import com.softuni.jsonexercise.Domain.Entities.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;
import java.util.Set;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

    private String name;

    private BigDecimal price;

    private UserDTO buyer;

    private UserDTO seller;

    private Set<CategoryDTO> categories;

    public ProductInRangeWithNoBuyerDTO toProductInRangeWithNoBuyerDTO(){
        return new ProductInRangeWithNoBuyerDTO(name, price, seller.getFullName());
    }

    public static ProductsSoldWithCountDTO toProductsSoldWithCountDto(Set<ProductDTO> sellingProducts) {
        return new ProductsSoldWithCountDTO(sellingProducts
                .stream()
                .map(ProductDTO::toProductBasicInfo)
                .collect(Collectors.toList()));
    }

    public static ProductBasicInfo toProductBasicInfo(ProductDTO productDto) {
        return new ProductBasicInfo(productDto.getName(), productDto.getPrice());
    }

}
