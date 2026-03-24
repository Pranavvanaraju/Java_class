class salary{
    void cal(int amount){
        System.out.println("basic Salary = "+amount);
    }
    void cal(int sal,int bon){
        System.out.println("total pay with bonus = " +(sal+bon));
    }

}

public class taskthree {
    public static void main(String[] args) {
        salary s=new salary();
        s.cal(5000);
        s.cal(5000,3000);
    }
}
