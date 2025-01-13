
-- 1. ویوی customer_accounts برای نمایش اطلاعات مشتریان و حساب‌های آنها
CREATE VIEW customer_accounts AS
SELECT
    P.FullName AS CustomerName,
    P.PhoneNumber AS ContactNumber,
    A.AccountNumber,
    A.AccountType,
    A.Balance
FROM Persons P
         JOIN Customers C ON P.PersonID = C.PersonID
         JOIN Accounts A ON C.CustomerID = A.CustomerID;
