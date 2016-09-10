# spark-jdbc-mssql
**Connect to SQL Server using Apache Spark**


You need to download and install the JDBC Drivers for SQL Server:  
Microsoft JDBC Drivers 6.0, 4.2, 4.1, and 4.0 for SQL Server  
<https://www.microsoft.com/en-us/download/details.aspx?displaylang=en&id=11774>


Start a Spark shell and make the JDBC SQL Server driver available 

```
bin/spark-shell --driver-class-path /opt/sqljdbc_4.2/enu/sqljdbc42.jar
```

Then explore and modify the spark-jdbc-mssql.scala accordingly which containing Spark SQL commands...
