-- 3. ویوی bank_member برای نمایش اطلاعات کارکنان و مشتریان بانک
CREATE VIEW bank_member AS
SELECT
    P.FullName AS MemberName,
    P.PersonID AS MemberID,
    CASE
        WHEN C.CustomerID IS NOT NULL THEN 'Customer'
        WHEN E.EmployeeID IS NOT NULL THEN 'Employee'
        END AS Role,
    P.Email AS ContactEmail,
    P.PhoneNumber AS ContactNumber
FROM Persons P
         LEFT JOIN Customers C ON P.PersonID = C.PersonID
         LEFT JOIN Employees E ON P.PersonID = E.PersonID;
