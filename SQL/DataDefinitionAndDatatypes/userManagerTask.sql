CREATE DATABASE `exercise`;

USE `exercise`;
CREATE TABLE `people`(
	`id` INT PRIMARY KEY AUTO_INCREMENT,
    `name` VARCHAR(200) NOT NULL,
    `picture` BLOB,
    `height` DOUBLE,
    `weight` DOUBLE,
    `gender` CHAR(1) NOT NULL,
    `birthdate` DATE NOT NULL, 
    `biography` TEXT
);

INSERT INTO `people` (`name`, `gender`, `birthdate`)
VALUES ("Boris", "m", DATE(NOW())),
		("Aleksandar", "m", DATE(NOW())),
        ("Dancho", "m", DATE(NOW())),
        ("Petar", "m", DATE(NOW())),
        ("Desi", "m", DATE(NOW()));
        
USE `exercise`;
CREATE TABLE `users`(
	`id` INT PRIMARY KEY AUTO_INCREMENT ,
    `username` VARCHAR(30) NOT NULL,
    `password` VARCHAR(26) NOT NULL,
	`profile_picture` BLOB, 
    `last_login_time` TIME,
    `is_deleted` BOOLEAN
);

INSERT INTO `users`(`username`, `password`)
VALUES ("pesho1", "parola123"),
		("ivan2", "gotinsam"),
        ("test1", "test213"),
        ("test4", "test2"),
        ("test3", "test89");
        
USE `exercise`;
ALTER TABLE `users`
DROP PRIMARY KEY,
ADD PRIMARY KEY pk_users(`id`, `username`);

USE `exercise`;
ALTER TABLE `users`
MODIFY COLUMN `last_login_time` DATETIME DEFAULT NOW();

USE `exercise`;
ALTER TABLE `users`
DROP PRIMARY KEY,
ADD CONSTRAINT pk_users
PRIMARY KEY `users` (`id`),
MODIFY COLUMN `username` VARCHAR(30) UNIQUE;

