// Create the SQLContext first from the existing Spark Context
val sqlContext = new org.apache.spark.sql.SQLContext(sc)

// Construct JDBC URL
val jdbcSqlConnStr = "jdbc:sqlserver://xxx.xxx.xxx.xxx:1433;databaseName=WideWorldImporters;user=wwiuser;password=wwiuser1234;"

// Define database table to load into DataFrame
val jdbcDbTable = "Sales.InvoiceLines"

// Load DataFrame with JDBC data-source properties
val jdbcDF = sqlContext.read.format("jdbc").options(
Map("url" -> jdbcSqlConnStr,
"dbtable" -> jdbcDbTable)).load()

// Displays the content of the DataFrame to stdout ...first 10 rows
jdbcDF.show(10)

// Register the DataFrame as a table
jdbcDF.registerTempTable("Sales")

// SQL statement can be run by using the sql methods provided by sqlContext.
val saleInvoices = sqlContext.sql("SELECT InvoiceID, Quantity, UnitPrice, TaxAmount, ExtendedPrice FROM Sales WHERE Description = 'White chocolate moon rocks 250g'")

// Displays the content of the DataFrame
saleInvoices.show()

//SQL statement - Sum of ExtendedPrice for 'White chocolate moon rocks 250g' product 
val sumInvoices = sqlContext.sql("SELECT SUM(ExtendedPrice) AS TotalSales FROM Sales WHERE Description = 'White chocolate moon rocks 250g'")

// Displays the content of the DataFrame
sumInvoices.show()
