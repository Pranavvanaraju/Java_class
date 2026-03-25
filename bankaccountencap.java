class ba{
    private double balance;

    public void deposit(double amount){
        balance+=amount;
    }

    public void withdraw(double amount){
        if(amount<=balance)
            balance-=amount;
        else
            System.out.println("insufficient balance");

    }
    public double getbalance(){
        return balance;
    }
}
public class bankaccountencap {
    public static void main(String[] args) {
        ba b=new ba();
        b.deposit(5000);
        b.withdraw(2500);
        System.out.println("bank balance"+b.getbalance());
        
    }
}
