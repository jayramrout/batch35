package jrout.tutorial.db;

/*
    JDBC: Java Database Connectivity
    // Import the requred package.

 */
import org.postgresql.Driver;

import java.sql.*;

public class JDBCProgram {
    public static void main(String[] args) {
        String connectionURL = "jdbc:postgresql://localhost:5432/postgres";
        Driver driver = new Driver();
        try {
            DriverManager.registerDriver(driver);
            System.out.println("Driver is loaded...");
//            Class.forName("org.postgresql.Driver");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Connection connection = null;
        try {
             connection = DriverManager.getConnection
                    (connectionURL, "postgres", "postgres");
             System.out.println("Connection is established..");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from actor where actor_id = 3");
            //select first_name, last_name from actor where first_name like 'G%';
            // create the pojo class
            while(resultSet.next()) {
                // and create new object for each iteration and set it to a list..and at the end print it..
                System.out.println(resultSet.getString("first_name") + " "+ resultSet.getString("last_name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
