import java.sql.*;

public class step1db {
    public static void main(String[] args) {
        Connection con = null;
        Statement stmt=null;
        ResultSet res=null;
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root1234");
            System.out.println("connected");
            stmt=con.createStatement();
            res=stmt.executeQuery("Select * from students");
            while(res.next()){
                int id=res.getInt("id");
                String name=res.getString("name");
                String subject=res.getString("sub");

                System.out.println(id+" "+name+" "+subject+" ");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
