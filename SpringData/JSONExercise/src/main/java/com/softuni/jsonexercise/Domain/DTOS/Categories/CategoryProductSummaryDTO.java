package com.softuni.jsonexercise.Domain.DTOS.Categories;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryProductSummaryDTO {

    private String category;

    private Long productsCount;

    private Double averagePrice;

    private BigDecimal totalRevenue;

}
