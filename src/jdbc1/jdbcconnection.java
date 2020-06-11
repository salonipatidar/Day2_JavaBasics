package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class jdbcconnection {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "");
        System.out.println("login success");
         System.out.println("Creating database...");
      Statement statement = (Statement) connection.createStatement();
      
      String sql = "CREATE DATABASE EMPLOYEE";
      statement.executeUpdate(sql);
      System.out.println("Database created successfully...");
      System.out.println("Creating table in given database...");
      statement = (Statement) connection.createStatement();
      
      String table_sql = "CREATE TABLE JOINING " +"(id INTEGER not NULL, " +" first VARCHAR(25), " + " last VARCHAR(25), " + " age INTEGER, " +" PRIMARY KEY ( id ))"; 

      statement.executeUpdate(table_sql);
      System.out.println("Table created in database");
      
      System.out.println("Inserting records into the table...");
      statement = (Statement) connection.createStatement();
      
      String insert_sql = "INSERT INTO JOINING " +
                   "VALUES (101, 'Zara', 'Ali', 18)";
      statement.executeUpdate(insert_sql);
      insert_sql = "INSERT INTO JOINING " +
                   "VALUES (102, 'Mahnaz', 'Fatma', 25)";
      statement.executeUpdate(insert_sql);
      insert_sql = "INSERT INTO JOINING " +
                   "VALUES (103, 'Zaid', 'Khan', 30)";
      statement.executeUpdate(insert_sql);
      insert_sql = "INSERT INTO JOINING " +
                   "VALUES(104, 'Sumit', 'Mittal', 28)";
      statement.executeUpdate(insert_sql);
      System.out.println("Inserted records into the table...");
    }
    
    
}

