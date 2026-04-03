
public class TestDB {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("✅ MySQL Driver Loaded Successfully!");
        } catch (Exception e) {
            System.out.println("❌ Driver NOT loaded!");
            e.printStackTrace();
        }
    }
}
