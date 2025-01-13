-- قسمت سوم: کوئری‌های SQL

-- 1. اضافه کردن فرد جدید به جدول Persons
INSERT INTO Persons (PersonID, FullName, DateOfBirth, PhoneNumber, Email, Address)
VALUES (10, 'Ali Rezaei', '1990-05-15', '09123456789', 'ali.rezaei@gmail.com', 'Tehran, Iran');

INSERT INTO Customers (CustomerID, CustomerType, PersonID)
VALUES (10, 'Individual', 10);

-- 2. ایجاد حساب جدید برای فرد موجود در جدول Accounts
INSERT INTO Accounts (AccountID, CustomerID, AccountNumber, AccountType, Balance, Status, OpenDate)
VALUES (10, 10, '1234567890', 'Savings', 1000000.00, 'Active', CURDATE());

-- 3. نمایش تمام تراکنش‌های مرتبط با یک حساب خاص
SELECT *
FROM Transactions
WHERE SourceAccountID = 1 OR DestinationAccountID = 1;

-- 4. نمایش تمام وام‌های فعال
SELECT *
FROM Loans
WHERE Status = 'Approved';

-- 5. نمایش تمام حساب‌هایی که موجودی آنها از یک مقدار مشخص بیشتر است
SELECT *
FROM Accounts
WHERE Balance > 500000;

-- 6. محاسبه و نمایش کل موجودی حساب‌ها برای هر فرد
SELECT P.FullName, SUM(A.Balance) AS TotalBalance
FROM Persons P
         JOIN Customers C ON P.PersonID = C.PersonID
         JOIN Accounts A ON C.CustomerID = A.CustomerID
GROUP BY P.FullName;

-- 7. انتخاب کارکنانی که وام‌های فعال دارند
SELECT P.FullName, L.LoanAmount
FROM Employees E
         INNER JOIN Persons P ON E.PersonID = P.PersonID
         JOIN Loans L ON E.EmployeeID = L.CustomerID
WHERE L.Status = 'Approved';

-- 8. نمایش مشتریانی که بیش از یک حساب دارند
SELECT P.FullName, COUNT(A.AccountID) AS AccountCount
FROM Persons P
         JOIN Customers C ON P.PersonID = C.PersonID
         JOIN Accounts A ON C.CustomerID = A.CustomerID
GROUP BY P.FullName
HAVING COUNT(A.AccountID) > 1;

-- بخش امتیازی

-- 1. نمایش مشتریانی که بیشترین تعداد وام‌های فعال را دارند
SELECT P.FullName, COUNT(L.LoanID) AS ActiveLoans
FROM Persons P
         JOIN Customers C ON P.PersonID = C.PersonID
         JOIN Loans L ON C.CustomerID = L.CustomerID
WHERE L.Status = 'Approved'
GROUP BY P.FullName
ORDER BY ActiveLoans DESC
    LIMIT 5;

-- 2. انتخاب 5 وامی که کمترین تعداد اقساط پرداخت شده را دارند
SELECT L.LoanID, COUNT(I.PaymentDate) AS PaidInstallments
FROM Loans L
         JOIN Installments I ON L.LoanID = I.LoanID
WHERE I.PaymentDate IS NOT NULL
GROUP BY L.LoanID
ORDER BY PaidInstallments ASC
    LIMIT 5;

-- 3. نمایش مشتریانی که اقساط وام خود را به موقع پرداخت نکرده‌اند
SELECT P.FullName, L.LoanID, L.LoanAmount
FROM Persons P
         JOIN Customers C ON P.PersonID = C.PersonID
         JOIN Loans L ON C.CustomerID = L.CustomerID
         JOIN Installments I ON L.LoanID = I.LoanID
WHERE I.PaymentDate > I.DueDate OR I.PaymentDate IS NULL;

-- 4. نمایش 5 مشتری که بالاترین موجودی را در حساب‌های خود دارند
SELECT P.FullName, SUM(A.Balance) AS TotalBalance
FROM Persons P
         JOIN Customers C ON P.PersonID = C.PersonID
         JOIN Accounts A ON C.CustomerID = A.CustomerID
GROUP BY P.FullName
ORDER BY TotalBalance DESC
    LIMIT 5;
