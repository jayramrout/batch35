package jrout.tutorial.db;

/*
    JDBC: Java Database Connectivity
    // Import the requred package.

 */
//import org.postgresql.Driver;

import java.sql.*;

public class JDBCProgram {
    public static void main(String[] args) {
        String connectionURL = "jdbc:postgresql://localhost:5432/dvdrental";
//        Driver driver = new Driver();
        try {
//            DriverManager.registerDriver(driver);
            System.out.println("Driver is loaded...");
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //Oracle select * from actor where actor_id = 3
        // Postgrest select * from actor where actor_id = 3

        Connection connection = null;
        try {
             connection = DriverManager.getConnection
                    (connectionURL, "postgres", "postgres");
             System.out.println("Connection is established..");
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("select * from actor where actor_id = 3"); // this will compile all the time..
            PreparedStatement preparedStatement = connection.
                    prepareStatement("select * from actor where actor_id = ?");
            preparedStatement.setInt(1,3);
            ResultSet resultSet = preparedStatement.executeQuery();

            //select first_name, last_name from actor where first_name like 'G%';
            // create the pojo class
            while(resultSet.next()) {
                // and create new object for each iteration and set it to a list..and at the end print it..
                System.out.println(resultSet.getString("first_name") + " "+ resultSet.getString("last_name"));
            }
        //CRUD Create Read Update Delete

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
