Установка MySQL локально описана здесь: 

https://wiki.merionet.ru/servernye-resheniya/12/ustanovka-mysql-servera-na-windows-10/

Последовательность действий для импорта файла schema.sql:

1. Запустить терминал MySQL 8.0 Commamd Line Client
1. Выполнить команды
```
CREATE DATABASE db_name; --создание новой БД
use db_name;
sourse path/to/file/schema.sql
```
