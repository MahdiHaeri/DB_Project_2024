-- 7. تابع: محاسبه تعداد وام‌های فعال یک مشتری
CREATE FUNCTION count_active_loans(customerID INT)
    RETURNS INT
    DETERMINISTIC
BEGIN
    DECLARE active_loans INT;
SELECT COUNT(*) INTO active_loans
FROM Loans
WHERE CustomerID = customerID AND Status = 'Approved';
RETURN active_loans;
END;