-- 6. تابع: بررسی وضعیت یک وام خاص
CREATE FUNCTION get_loan_status(loanID INT)
    RETURNS VARCHAR(50)
    DETERMINISTIC
BEGIN
    DECLARE loan_status VARCHAR(50);
SELECT Status INTO loan_status
FROM Loans
WHERE LoanID = loanID;
RETURN loan_status;
END;