

abstract class bank{
    abstract void getinterestrate();
    void display(){
        System.out.println("welcome");
    }
}

class sbi extends bank{
    int ir1=8;
    void getinterestrate(){
        System.out.println("Sbi bank interest rate:" +ir1);
    }
}

class hdfc extends bank{
    int ir2=7;
    void getinterestrate(){
        System.out.println("hdfc bank interest rare: "+ir2);
    }
}
public class bankabstract {
    public static void main(String[] args) {
        bank b;
        b= new sbi();
        b.display();
        b.getinterestrate();

        b=new hdfc();
        b.display();;
        b.getinterestrate();
        
    }
}
