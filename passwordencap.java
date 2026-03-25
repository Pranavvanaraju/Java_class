class user{
    private String username;
    private int pass;

    public void setUsername(String username){
        this.username=username;
    }

    public void setPass(int pass){
        this.pass=pass;
    }

    public String getUsername(){
        return username;
    }
}



public class passwordencap {
    public static void main(String[] args) {
        user u =new user();
        u.setUsername("Pranav");
        u.setPass(48745412);

        System.out.println("jfjjo"+u.getUsername());
    }
}
