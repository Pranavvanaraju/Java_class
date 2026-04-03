import java.sql.*;

public class step3 {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college",
                "root",
                "root1234"
            );
            String query = "DELETE FROM students WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, 111); 
            int rows = ps.executeUpdate();
            System.out.println(rows + " record deleted");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}