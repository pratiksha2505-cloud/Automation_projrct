package JDBC_source_programs;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DatabaseTesting {
	private Connection connection;
	private Statement statement;
	private ResultSet resultset;
	@BeforeClass
	public void EstablishedConnection() throws ClassNotFoundException, SQLException
	{
		String databaseURL = "jdbc:mysql://localhost:3306/colledge-database";
        String user = "root";
        String password = "Pmshah@&2505";
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Connectiong to database.");
        
        connection = DriverManager.getConnection(databaseURL, user, password);
        
        // Check if the connection is successful
           if (connection == null) {
                  System.out.println("Database Connection Failed");
              }else {
                  System.out.println("Database Connection Successful");
              }
	}
	@Test
	public void viewData()
	{
		try {
            
            // SQL query to retrieve worker from the database
            String query = "select * from student";
            statement =  connection.createStatement();
            resultset =  statement.executeQuery("select s.Student_id,s.name,c.course_name from student s inner join course c on s.course_id=c.course_id;");
           // System.out.println("Data Printed 1");
            System.out.println(resultset.getFetchSize());
         // Iterate through the result set and print worker details
            while (resultset.next()) {
            //	System.out.println("data 2");
                int studentid = resultset.getInt("s.Student_id");
                String studentName = resultset.getString("s.name");
                String coursename = resultset.getString("c.course_name");
                
                
             // Print worker details
                System.out.println("Student ID: " + studentid + ",  Name: " + studentName + ", Courser Name :" + coursename);

            }
            System.out.println("Data Printed");
        	} catch (Exception error) {
        		System.out.println(error.getLocalizedMessage());
        	}
	}
	
	@AfterClass
public void closeDatabaseConnection() {
        
        // Close the database connection
        if (connection != null) {
            try {
                System.out.println("Closing Database Connection...");
                connection.close();
            } catch (Exception error) {
                error.printStackTrace();
            }
        }
    }
}
