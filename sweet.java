public class sweet {
    public static void main(String[] args) {
        int a=5;
        int res=0;
        for(int i=1;i<=a;i++)
        {
            // res=(res+2)%i
            res=(i+2)/2;
            
        }
        System.out.println("The last person to get the sweet: " +(res));
    }
}
