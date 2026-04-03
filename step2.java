import java.sql.*;
public class step2 {
    public static void main(String[] args) {
        Connection con = null;
    try {
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root1234");
        System.out.println("connected");   
        String query ="Insert into students(id,name,sub)values(?,?,?)";
        PreparedStatement ps =con.prepareCall(query);
        ps.setInt(1,111 );
        ps.setString(2,"soorya");
        ps.setString(3,"python");
        int rows=ps.executeUpdate();
        System.out.println(rows+"record insereted");       

    } catch (Exception e) {
        System.out.println(e);
    }        
}
}
