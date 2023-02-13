package com.softuni.jsonexercise.Repos;


import com.softuni.jsonexercise.Domain.Entities.Category;
import com.softuni.jsonexercise.Domain.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query(value = "select * from `product-shop`.users order by RAND () LIMIT 1", nativeQuery = true)
    Optional<User> getRandomEntity();

    Optional<List<User>> findAllBySellingProductsBuyerIsNotNullOrderBySellingProductsBuyerFirstName();
}
