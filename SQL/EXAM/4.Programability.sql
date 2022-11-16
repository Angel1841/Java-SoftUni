-- 10
DELIMITER $$;
CREATE FUNCTION udf_client_bill (full_name VARCHAR (50))
RETURNS VARCHAR(255)
DETERMINISTIC
BEGIN
	DECLARE total_price DECIMAL(19, 2);
    SET total_price := (
    
		SELECT SUM(pr.price) AS 'bill'
        FROM products AS pr
            JOIN `orders_products` AS op ON pr.`id` = op.`product_id`
            JOIN `orders` AS o ON o.`id` = op.`order_id`
            JOIN `orders_clients` AS oc ON o.`id` = oc.`order_id`
            JOIN `clients` AS c ON c.`id` = oc.`client_id`
			WHERE concat(c.first_name, ' ', c.last_name) = full_name);
        
        RETURN total_price;
END$$;

-- 11

CREATE PROCEDURE udp_happy_hour(type VARCHAR(50))
BEGIN
UPDATE `products` as pr
SET pr.`price` = pr.`price` - (pr.`price` * 0.20)
WHERE pr.`price` >= 10.00 AND type = pr.`type`;
END


