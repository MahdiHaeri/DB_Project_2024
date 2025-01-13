-- 9. تابع: دریافت نام مشتری بر اساس شناسه
CREATE FUNCTION get_customer_name(customerID INT)
    RETURNS VARCHAR(255)
    DETERMINISTIC
BEGIN
    DECLARE customer_name VARCHAR(255);
SELECT FullName INTO customer_name
FROM Persons
         JOIN Customers ON Persons.PersonID = Customers.PersonID
WHERE CustomerID = customerID;
RETURN customer_name;
END;