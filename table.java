//creating table
import java.sql.*;
public class table
{
Connection conn = null;
Statement stmt = null;
static final String JDBC_DRIVER ="sun.jdbc.odbc.JdbcOdbcDriver";
static final String DB_URL ="jdbc:odbc:manisha";
static final String USER = "username";
static final String PASS = "password";
table()
{
try
{
      //STEP 2: Register JDBC driver
      Class.forName(JDBC_DRIVER);
      //STEP 3: Open a connection
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      stmt = conn.createStatement();
String sql = "CREATE TABLE REGISTRATION " + "(Name VARCHAR(255) not NULL, " +       
                 " Age VARCHAR(255) not NULL, " + 
                   " Gender VARCHAR(255) not NULL, " + 
                   " E-mail VARCHAR(255) not NULL, " + 
                   " Occupation VARCHAR(255) not NULL, " + 
                   " Username VARCHAR(255) not NULL, " + 
                   " Password VARCHAR(255) not NULL, " +                   
                   " PRIMARY KEY ( Username ) )"; 
  stmt.executeUpdate(sql);
System.out.println("Table Created Successfully");
}
catch(Exception e)
{
      //Handle errors for Class.forName
      e.printStackTrace();
}
}
public static void main(String args[])
{
table obj=new table();
}
}