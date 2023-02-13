package com.softuni.jsonexercise.Domain.DTOS.Categories.wrappers;

import com.softuni.jsonexercise.Domain.DTOS.Categories.CategoryProductSummaryDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoriesProductSummaryWrapperDto {

    private List<CategoryProductSummaryDTO> categories;

}
