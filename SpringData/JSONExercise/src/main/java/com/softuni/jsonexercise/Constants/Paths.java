package com.softuni.jsonexercise.Constants;

import java.nio.file.Path;

public enum Paths {
    ;
    public static final Path USER_JSON_PATH = Path.of("src","main", "resources", "content", "users.json");

    public static final Path CATEGORY_JSON_PATH = Path.of("src", "main", "resources", "content", "categories.json");

    public static final Path PRODUCTS_JSON_PATH = Path.of("src", "main", "resources", "content", "products.json");

    public static final Path PRODUCTS_WITH_NO_BUYERS_IN_RANGE_PATH = Path.of("src", "main", "resources", "outputs", "products-in-range.json");
    public static final Path USERS_SOLD_PRODUCTS_PATH = Path.of("src", "main", "resources", "outputs", "users-sold-products.json");

    public static final Path CATEGORIES_BY_PRODUCTS_JSON_PATH = Path.of("src", "main", "resources", "outputs", "jsons", "categories-by-products.json");

    public static final Path USERS_AND_PRODUCTS_JSON_PATH = Path.of("src", "main", "resources", "outputs", "jsons", "users-and-products.json");

}
