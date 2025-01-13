-- 3. تریگر: بروزرسانی موجودی حساب پس از تراکنش
CREATE TRIGGER update_account_balance
    AFTER INSERT ON Transactions
    FOR EACH ROW
BEGIN
    IF (NEW.SourceAccountID IS NOT NULL) THEN
    UPDATE Accounts
    SET Balance = Balance - NEW.Amount
    WHERE AccountID = NEW.SourceAccountID;
END IF;
IF (NEW.DestinationAccountID IS NOT NULL) THEN
UPDATE Accounts
SET Balance = Balance + NEW.Amount
WHERE AccountID = NEW.DestinationAccountID;
END IF;
END;