public class Armstrong {
    public static void main(String[] args) {
        int n=173;
        int temp=n;
        int sum=0;
        while(n>0)
        {
            int r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        if(sum==temp)
            System.out.print("It is armstrong number");
        else
            System.out.print("it is not an armstrong number");
    }
}
