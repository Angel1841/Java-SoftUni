package com.softuni.jsonexercise.Services.ProductService;

import com.softuni.jsonexercise.Domain.DTOS.Products.ProductInRangeWithNoBuyerDTO;
import com.softuni.jsonexercise.Domain.Entities.Product;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

public interface ProductService {

    List<ProductInRangeWithNoBuyerDTO> findAllByPriceBetweenAndBuyerIsNullOrderByPrice(BigDecimal low, BigDecimal high) throws IOException;

}
