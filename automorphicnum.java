import java.util.Scanner;

public class automorphicnum {
    public static boolean isAutomorphicnum(int n) {
        int square = n * n;
        int temp = n;
        int digits = 0;
     //count num of digits
        while (temp !=0){
            digits++;
            temp /= 10;
        }
        int mod = (int) Math.pow(10, digits);
        return square % mod == n;  
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        if (isAutomorphicnum(num)){
            System.out.println(num + " is an Automorphic Number");
        } else {
            System.out.println(num + " is not an Automorphic Number");
        }
        sc.close();
    }

}