public class leap_year {
    public static void main(String[] args) {
        int year=2021;
        if((year%4==0 && year%100!=0) || (year%400==0))
            System.out.println("It is a leap year");
        else
            System.out.println("it is not a leap year");
    }
}
