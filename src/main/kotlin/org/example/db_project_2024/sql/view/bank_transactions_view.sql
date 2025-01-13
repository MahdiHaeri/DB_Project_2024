-- 2. ویوی bank_transactions برای نمایش اطلاعات تراکنش‌ها
CREATE VIEW bank_transactions AS
SELECT
    T.TransactionID,
    A1.AccountNumber AS SourceAccount,
    A2.AccountNumber AS DestinationAccount,
    T.Amount,
    T.TransactionDate
FROM Transactions T
         LEFT JOIN Accounts A1 ON T.SourceAccountID = A1.AccountID
         LEFT JOIN Accounts A2 ON T.DestinationAccountID = A2.AccountID;