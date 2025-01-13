-- 5. تابع: محاسبه موجودی کل حساب‌های یک مشتری
CREATE FUNCTION calculate_total_balance(customerID INT)
    RETURNS DECIMAL(18, 2)
    DETERMINISTIC
BEGIN
    DECLARE total_balance DECIMAL(18, 2);
SELECT SUM(Balance) INTO total_balance
FROM Accounts
WHERE CustomerID = customerID;
RETURN total_balance;
END;