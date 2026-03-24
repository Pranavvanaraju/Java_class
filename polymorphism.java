
interface payment{
    void pay(int amount);
}

class ccp implements payment{
    public void pay(int amount){
        System.out.println("Paid Rs " + amount + " using Credit Card: 8529-7458-8541");
    }
}
class upi implements payment{
    public void pay(int amount){
        System.out.println("Paid Rs " + amount + " using UPI: user@upi");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        payment p;

        p=new ccp();
        p.pay(5222);

        p=new upi();
        p.pay(4587);
        
    }
}
