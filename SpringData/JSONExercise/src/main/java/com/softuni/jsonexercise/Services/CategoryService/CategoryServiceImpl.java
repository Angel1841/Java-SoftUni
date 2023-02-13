package com.softuni.jsonexercise.Services.CategoryService;


import com.softuni.jsonexercise.Domain.DTOS.Categories.CategoryProductSummaryDTO;
import com.softuni.jsonexercise.Domain.DTOS.Categories.wrappers.CategoriesProductSummaryWrapperDto;
import com.softuni.jsonexercise.Repos.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

import static com.softuni.jsonexercise.Constants.Paths.CATEGORIES_BY_PRODUCTS_JSON_PATH;
import static com.softuni.jsonexercise.Constants.UTILS.writeJsonIntoFile;


public class CategoryServiceImpl implements CategoryService{

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<CategoryProductSummaryDTO> getCategorySummary() throws IOException {
        final List<CategoryProductSummaryDTO> categories = this.categoryRepository
                .getCategorySummary()
                .orElseThrow(NoSuchElementException::new);

        final CategoriesProductSummaryWrapperDto categoriesWrapper =
                new CategoriesProductSummaryWrapperDto(categories);

        writeJsonIntoFile(categories, CATEGORIES_BY_PRODUCTS_JSON_PATH);

        return categories;
    }

}
