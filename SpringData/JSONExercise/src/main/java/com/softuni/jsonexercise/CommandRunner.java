package com.softuni.jsonexercise;

import com.softuni.jsonexercise.Services.ProductService.ProductService;
import com.softuni.jsonexercise.Services.SeedService.SeedService;
import com.softuni.jsonexercise.Services.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class CommandRunner implements CommandLineRunner {

    private final SeedService seedService;
    private final ProductService productService;
    private final UserService userService;

    @Autowired
    public CommandRunner(SeedService seedService, ProductService productService, UserService userService) {
        this.seedService = seedService;
        this.productService = productService;
        this.userService = userService;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        this.seedService.seedAll();
        //this.productService.findAllByPriceBetweenAndBuyerIsNullOrderByPrice(BigDecimal.valueOf(500), BigDecimal.valueOf(1000));
        this.userService.findAllBySellingProductsBuyerIsNotNullOrderBySellingProductsBuyerFirstName();
    }

}
