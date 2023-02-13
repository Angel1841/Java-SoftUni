package com.softuni.jsonexercise.Services.CategoryService;

import com.softuni.jsonexercise.Domain.DTOS.Categories.CategoryProductSummaryDTO;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.List;

public interface CategoryService {

    List<CategoryProductSummaryDTO> getCategorySummary() throws IOException;

}
