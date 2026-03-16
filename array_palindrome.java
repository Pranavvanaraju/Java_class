public class array_palindrome {
    public static void main(String[] args) {
        int a[]={1,2,3,4,2,1};
        int n=a.length;
        for(int i=0;i<n/2;i++)
        {
            if(a[i]!=a[n-1-i]){
                System.out.println("Not a plaindrome");
                return; 
            }
        }
        System.out.println("It is a palindrome");
    }
}
