# spark-jdbc-mssql
Connect to SQL Server using Apache Spark


Microsoft JDBC Drivers 6.0, 4.2, 4.1, and 4.0 for SQL Server
[link] <https://www.microsoft.com/en-us/download/details.aspx?displaylang=en&id=11774>


Start Spark shell and make the SQL Server driver available 

```
bin/spark-shell --driver-class-path /opt/sqljdbc_4.2/enu/sqljdbc42.jar
```