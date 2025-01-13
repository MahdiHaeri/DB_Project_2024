-- 1. تریگر: ثبت تاریخ ایجاد حساب جدید
CREATE TRIGGER set_open_date
    BEFORE INSERT ON Accounts
    FOR EACH ROW
    SET NEW.OpenDate = CURDATE();