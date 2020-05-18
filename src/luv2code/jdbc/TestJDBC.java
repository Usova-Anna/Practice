package luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {
    public static void main(String[] args) {
String jdbcURL = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=Europe/London";
String user = "hbstudent";
String pass = "hbstudent";

        try {
            System.out.println("Connecting to database..."+jdbcURL);
        //    Class.forName("com.mysql.jdbc.Driver");
            Connection myConn = DriverManager.getConnection(jdbcURL,user,pass);
            System.out.println("Connection successful");

        } catch (Exception exc){
exc.printStackTrace();
        }
    }
}
