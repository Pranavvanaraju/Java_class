
public class happy_numbers {
    public boolean ishappy(int n){
        while(n!=1 && n!=4){
            int sum =0;
            while(n>0){
                int digit =n%10;
                sum+=digit*digit;
                n=n/10;
            }
            n=sum;
        }
        return n==1;
    }
    public static void main(String[] args) {
        happy_numbers obj=new happy_numbers();
        int num=20;
        if(obj.ishappy(num)){
            System.out.println("It is a happy number");
        }
        else
            System.out.println("It is not a happy number");
    }
}
