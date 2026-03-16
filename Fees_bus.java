public class Fees_bus {
    public static void main(String[] args) {
        int num =15;
        if(num%3==0 && num%5==0)
        {
            System.out.println(num+"Fizzbuzz");
        }
        else if(num%3==0)
        {
            System.out.println(num+"fizz");
        }
        else if(num%5==0)
        {
            System.out.println(num+ "Buzz");
        }
        else {
            System.out.println(num+ "Neither fizz nor buzz");
        }
    }
}
