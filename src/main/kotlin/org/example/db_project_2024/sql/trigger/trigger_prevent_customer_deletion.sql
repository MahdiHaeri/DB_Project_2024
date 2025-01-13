-- 2. تریگر: جلوگیری از حذف مشتری با وام فعال
CREATE TRIGGER prevent_customer_deletion
    BEFORE DELETE ON Customers
    FOR EACH ROW
BEGIN
    IF (EXISTS (SELECT 1 FROM Loans WHERE CustomerID = OLD.CustomerID AND Status = 'Approved')) THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Cannot delete customer with active loans';
END IF;
END;