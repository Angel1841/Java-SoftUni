
-- 10

DELIMITER $$;
CREATE FUNCTION udf_customer_products_count(name VARCHAR(30))
RETURNS INT
DETERMINISTIC
BEGIN
	DECLARE total_products INT;
    SET total_products := (
		SELECT COUNT(op.`product_id`)
        FROM `orders_products` AS op
        JOIN `orders` AS o
        ON op.`order_id` = o.`id`
        JOIN `customers` AS c
        ON o.`customer_id` = c.`id`
        WHERE c.`first_name` = `name`
    );
    RETURN total_products;
END$$;

-- 11
DELIMITER $$;
CREATE PROCEDURE udp_reduce_price(category_name VARCHAR(50))
BEGIN
	UPDATE categories as c
    JOIN products as p
    ON c.id = p.category_id
    JOIN reviews as r
    ON r.id = p.review_id
    SET p.price = TRUNCATE(p.price * 0.7, 4)
    WHERE r.rating < 4.00 AND c.name = category_name;
    
END$$;

