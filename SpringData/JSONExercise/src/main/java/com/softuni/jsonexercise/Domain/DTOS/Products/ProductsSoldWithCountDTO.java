package com.softuni.jsonexercise.Domain.DTOS.Products;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductsSoldWithCountDTO {

    private Integer count;

    private List<ProductBasicInfo> products;

    public ProductsSoldWithCountDTO(List<ProductBasicInfo> products) {
        this.products = products;
        this.count = products.size();
    }

}
