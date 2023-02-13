package com.softuni.jsonexercise.Domain.DTOS.Products;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductInRangeWithNoBuyerDTO {

    private String name;

    private BigDecimal price;

    private String seller;

}
