package com.softuni.jsonexercise.Repos;

import com.softuni.jsonexercise.Domain.DTOS.Categories.CategoryProductSummaryDTO;
import com.softuni.jsonexercise.Domain.Entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    @Query(value = "select * from `product-shop`.categories order by RAND () LIMIT 1", nativeQuery = true)
    Optional<Category> getRandomEntity();

    @Query("select new com.softuni.jsonexercise.Domain.DTOS.Categories.CategoryProductSummaryDTO" +
            "(c.name, count(p.id), avg(p.price), sum(p.price)) " +
            "from Product p " +
            "join p.categories c " +
            "group by c.id " +
            "order by count(p.id)")
    Optional<List<CategoryProductSummaryDTO>> getCategorySummary();
}
