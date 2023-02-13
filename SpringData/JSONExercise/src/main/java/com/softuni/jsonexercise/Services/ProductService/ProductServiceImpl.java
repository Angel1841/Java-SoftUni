package com.softuni.jsonexercise.Services.ProductService;

import com.softuni.jsonexercise.Domain.DTOS.Products.ProductDTO;
import com.softuni.jsonexercise.Domain.DTOS.Products.ProductInRangeWithNoBuyerDTO;
import com.softuni.jsonexercise.Domain.Entities.Product;
import com.softuni.jsonexercise.Repos.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import static com.softuni.jsonexercise.Constants.Paths.PRODUCTS_WITH_NO_BUYERS_IN_RANGE_PATH;
import static com.softuni.jsonexercise.Constants.UTILS.MODEL_MAPPER;
import static com.softuni.jsonexercise.Constants.UTILS.writeJsonIntoFile;

@Service
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    @Transactional
    public List<ProductInRangeWithNoBuyerDTO> findAllByPriceBetweenAndBuyerIsNullOrderByPrice(BigDecimal low, BigDecimal high) throws IOException {
        List<ProductInRangeWithNoBuyerDTO> products = this.productRepository.findAllByPriceBetweenAndBuyerIsNullOrderByPrice(low, high)
                .orElseThrow(NoSuchElementException::new)
                .stream()
                .map(product -> MODEL_MAPPER.map(product, ProductDTO.class))
                .map(ProductDTO::toProductInRangeWithNoBuyerDTO)
                .collect(Collectors.toList());

        writeJsonIntoFile(products, PRODUCTS_WITH_NO_BUYERS_IN_RANGE_PATH);

        return products;
    }

}
