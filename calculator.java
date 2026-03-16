
import java.util.Scanner;

public class calculator{
     static void calculate() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        System.out.print("Enter the operation (+ - * /)");
        char op =sc.next().charAt(0);

        int res;
        
        switch(op){
            case '+':
                res=num1+num2;
                System.out.println(res);
                break;
            case '-':
                res=num1-num2;
                System.out.println(res);
                break;
            case '*':
                res=num1*num2;
                System.out.println(res);
                break;
            case '/':
                if(num2!=0){
                    res=num1/num2;
                    System.out.println(res);
                    break;}
                else 
                    System.out.println("Invalid numbers");
            default:
                System.out.println("operation failed");

        }
        System.out.println("Do you want to contine (y/n)");
        char ch =sc.next().charAt(0);
        if (ch=='y'|| ch=='Y')
            calculate();
        else
            System.out.println("Calculator is stopped");
        
    }
    public static void main(String[] args) {
        calculate();
    }
}