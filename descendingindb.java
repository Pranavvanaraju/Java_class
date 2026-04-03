   import java.sql.*; 
public class descendingindb {
 
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college",
                "root",
                "root1234"
            );

            String query = "SELECT * FROM students ORDER BY id DESC";

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String sub = rs.getString("sub");

                System.out.println(id + " " + name + " " + sub);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

