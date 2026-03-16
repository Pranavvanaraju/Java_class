import java.util.Scanner;
public class booking_tickets
{
    static int rows =5;
    static int columns=10;
    static String seats[][]=new String[rows][columns];
    static void Ticket()
    {
        for (int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                seats[i][j]="Available";
            }
        }
    }
    static void display()
    {
        for (int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print(seats[i][j]+"    ");
            }
            System.out.println("\n");
        }
    }
    static void book_ticket()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Select your row:");
        int seat_rows =sc.nextInt();
        System.out.print("Select your seat:");
        int seat_column=sc.nextInt(); 
        if(seats[seat_rows-1][seat_column-1]=="Available")
        {
            seats[seat_rows-1][seat_column-1]="Booked";
        }
        sc.nextLine();
        System.out.print("Need another seats:");
        String ans=sc.next();
        if(ans.equals("Yes"))
            {
                display();
                book_ticket();
            }
        else
        {
            display();
        }
    }
    public static void main(String args[])
    {
        Ticket();
        display();
        book_ticket();
    }
}