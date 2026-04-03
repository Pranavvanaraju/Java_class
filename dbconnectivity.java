import java.sql.Connection;
import java.sql.DriverManager;

public class dbconnectivity {
    public static void main(String[] args) {
        Connection con =null;
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root1234");
            System.out.println("Success");
        } catch (Exception e) {
            System.out.println("not connected");
        }
    }
}
