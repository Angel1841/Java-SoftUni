package com.softuni.jsonexercise.Services.SeedService;

import com.softuni.jsonexercise.Domain.DTOS.Categories.CategoryImportDTO;
import com.softuni.jsonexercise.Domain.DTOS.Products.ProductImportDTO;
import com.softuni.jsonexercise.Domain.DTOS.Users.UserImportDTO;
import com.softuni.jsonexercise.Domain.Entities.Category;
import com.softuni.jsonexercise.Domain.Entities.Product;
import com.softuni.jsonexercise.Domain.Entities.User;
import com.softuni.jsonexercise.Repos.CategoryRepository;
import com.softuni.jsonexercise.Repos.ProductRepository;
import com.softuni.jsonexercise.Repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static com.softuni.jsonexercise.Constants.Paths.*;
import static com.softuni.jsonexercise.Constants.UTILS.GSON;
import static com.softuni.jsonexercise.Constants.UTILS.MODEL_MAPPER;

@Service
public class SeedServiceImpl implements SeedService{

    private final UserRepository userRepository;
    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;

    @Autowired
    public SeedServiceImpl(UserRepository userRepository, CategoryRepository categoryRepository, ProductRepository productRepository) {
        this.userRepository = userRepository;
        this.categoryRepository = categoryRepository;
        this.productRepository = productRepository;
    }


    @Override
    public void seedUsers() throws IOException {
        if(this.userRepository.count() == 0){
            final FileReader fileReader = new FileReader(USER_JSON_PATH.toFile());
            final List<User> users = Arrays.stream(GSON.fromJson(fileReader, UserImportDTO[].class))
                    .map(uiDTO -> MODEL_MAPPER.map(uiDTO, User.class)).collect(Collectors.toList());

            this.userRepository.saveAllAndFlush(users);
            fileReader.close();
        }


    }

    @Override
    public void seedCategories() throws IOException {

        if(this.categoryRepository.count() == 0){
            final FileReader fileReader = new FileReader(CATEGORY_JSON_PATH.toFile());
            final List<Category> categories = Arrays.stream(GSON.fromJson(fileReader, CategoryImportDTO[].class))
                    .map(categoryImportDTO -> MODEL_MAPPER.map(categoryImportDTO, Category.class)).collect(Collectors.toList());

            this.categoryRepository.saveAllAndFlush(categories);
            fileReader.close();
        }



    }

    @Override
    public void seedProducts() throws IOException {

        if(this.productRepository.count() == 0){
            final FileReader fileReader = new FileReader(PRODUCTS_JSON_PATH.toFile());

            final List<Product> products = Arrays.stream(GSON.fromJson(fileReader, ProductImportDTO[].class))
             .map(productImportDto -> MODEL_MAPPER.map(productImportDto, Product.class))
                   .map(this::setRandomSeller)
                   .map(this::setRandomBuyer)
                    .map(this::setRandomCategories)
                  .toList();

            this.productRepository.saveAll(products);


        }

    }

    private Product setRandomCategories(Product product) {
        final Random random = new Random();
        final int numberOfCategories = random.nextInt((int) this.categoryRepository.count());

        Set<Category> categories = new HashSet<>();
        IntStream.range(0, numberOfCategories)
                .forEach(number ->{
                    Category category =
                            this.categoryRepository
                                    .getRandomEntity()
                                    .orElseThrow(NoSuchElementException::new);
                    categories.add(category);
                });

        product.setCategories(categories);

        return product;
    }

    private Product setRandomBuyer(Product product) {

        if (product.getPrice().compareTo(BigDecimal.valueOf(700L)) > 0 ){
            User buyer = this.userRepository.getRandomEntity().orElseThrow(NoSuchElementException::new);

            while (buyer.equals(product.getSeller())){
                buyer = this.userRepository.getRandomEntity().orElseThrow(NoSuchElementException::new);
            }

            product.setBuyer(buyer);
        }

        return product;
    }

    private Product setRandomSeller(Product product) {
        final User seller = this.userRepository.getRandomEntity().orElseThrow(NoSuchElementException::new);

        product.setSeller(seller);

        return product;
    }
}
