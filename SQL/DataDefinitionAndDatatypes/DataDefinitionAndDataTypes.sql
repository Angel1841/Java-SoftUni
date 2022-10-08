CREATE DATABASE `gamebar`;

CREATE TABLE `employees`(

	`id` INT AUTO_INCREMENT PRIMARY KEY,
    `first_name` VARCHAR(100) NOT NULL,
	`last_name` VARCHAR(100) NOT NULL

);

CREATE TABLE `categories`(

	`id` INT AUTO_INCREMENT PRIMARY KEY,
	`name` VARCHAR(100) NOT NULL

);

CREATE TABLE `products`(

	`id` INT AUTO_INCREMENT PRIMARY KEY,
	`name` VARCHAR(100) NOT NULL,
	`category_id` INT NOT NULL
);

USE `gamebar`;

INSERT INTO `employees`(`first_name`, `last_name`) VALUES ("Pesho", "Pesho");
INSERT INTO `employees`(`first_name`, `last_name`) VALUES
 ("Gosho", "Gosho"),
 ("Gergana", "Gergana");
 
 ALTER TABLE `employees`
 ADD COLUMN `middle_name` VARCHAR(100);
 
 ALTER TABLE `employees`
 MODIFY COLUMN `middle_name` VARCHAR(100);
 
 ALTER TABLE `products`
 ADD CONSTRAINT `idx_category_id`
 INDEX(`category_id`);
 
	ALTER TABLE `categories`
 ADD CONSTRAINT `fk_categories_id_products_category_id`
 FOREIGN KEY(`id`) REFERENCES `products`(`category_id`);

 

