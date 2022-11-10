SELECT `title`
FROM `books`
WHERE SUBSTRING(`title`, 1, 3) = "The";

SELECT REPLACE(`title`, "The", "***")
FROM `books`
WHERE SUBSTRING(`title`, 1, 3) = "The";

SELECT `first_name`, LENGTH(`first_name`), CHAR_LENGTH(`first_name`)
FROM `authors`;

SELECT ROUND(SUM(`cost`), 2)
FROM `books`;

SELECT 
CONCAT_WS(' ', first_name, last_name) AS 'Full Name',
TIMESTAMPDIFF(DAY, `born`, `died`) AS 'Days Lived'
FROM authors;

SELECT `title`
FROM `books`
WHERE `title` LIKE 'harry potter%';