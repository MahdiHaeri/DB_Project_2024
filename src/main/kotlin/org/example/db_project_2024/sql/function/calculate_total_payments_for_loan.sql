-- 8. تابع: محاسبه مجموع پرداخت‌های انجام‌شده برای یک وام
CREATE FUNCTION calculate_total_payments(loanID INT)
    RETURNS DECIMAL(18, 2)
    DETERMINISTIC
BEGIN
    DECLARE total_payments DECIMAL(18, 2);
SELECT SUM(AmountPaid) INTO total_payments
FROM Installments
WHERE LoanID = loanID AND AmountPaid IS NOT NULL;
RETURN total_payments;
END;