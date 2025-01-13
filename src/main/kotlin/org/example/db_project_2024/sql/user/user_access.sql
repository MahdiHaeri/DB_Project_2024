-- قسمت پنجم: محدودیت دسترسی

-- 1. ایجاد کاربر جدید با نام کاربری Blazkowicz و رمز عبور William1939
CREATE USER 'Blazkowicz'@'%' IDENTIFIED BY 'William1939';

-- 2. اعطای دسترسی فقط خواندنی به تمام جداول و ویوها
GRANT SELECT ON dp_project.* TO 'Blazkowicz'@'%';

-- 3. اطمینان از عدم دسترسی نوشتن به جداول
REVOKE INSERT, UPDATE, DELETE ON db_project.* FROM 'Blazkowicz'@'%';

-- 4. بررسی دسترسی‌های کاربر
SHOW GRANTS FOR 'Blazkowicz'@'%';
