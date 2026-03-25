class Recharge{
    private int mobilenum;
    private int amount;

    public void setMobnum(int mobilenum){
        this.mobilenum = mobilenum;
    }
    public void setAmount(int amount){
        if(amount > 10){
            this.amount = amount;
        } else {
            System.out.println("Amount must be greater than 10");
        }
    }
    public int getMobnum(){
        return mobilenum;
    }
    public int getAmount(){
        return amount;
    }
}

public class MobileRechargeEncap {
    public static void main(String[] args) {
        Recharge r = new Recharge();

        r.setMobnum(987654321);
        r.setAmount(100);

        System.out.println("Mobile number : " + r.getMobnum() + " "+"Recharged with amount of : " + r.getAmount());
    }
    
}