import java.util.Scanner;
public class metro_ticket {

    static void tickets()
    {
        String stations []={"MGR Central","Egmore","Nehru park","Kilpauk","Pachaiyappa college","Shenoy nagar","Anna nagar east","Anna nagar tower",
            "Thirumanagalam","koyambedu","cmbt","arumbakkam","vadapalani","ashok nagar","ekkattuthangal","arignar anna alandhur","St thomas mount"};
            Scanner get_data =new Scanner(System.in);
            System.out.println("Enter your name");
            String name=get_data.nextLine();
            System.out.println("Enter your starting point");
            String start=get_data.nextLine();
            System.out.println("Enter your stopping point");
            String stop=get_data.nextLine();
            int start_point=-1;
            int stop_point =-1;
            for(int i=0;i<stations.length;i++)
            {
                if(stations[i].equalsIgnoreCase(start))
                {
                    start_point=i;
                }
                else if(stations[i].equalsIgnoreCase(stop))
                {
                    stop_point=i;
                }
            }
            int no_of_stops=0;
            int fare;
            if(start_point > stop_point) {
            no_of_stops = start_point - stop_point;}
            else {
            no_of_stops = stop_point - start_point;}

            if(no_of_stops==1 || no_of_stops==2)
            {
                fare=10;
            }
            else if(no_of_stops ==3||no_of_stops==4)
            {
                fare=20;
            }
            else if(no_of_stops==5||no_of_stops==6)
            {
                fare =30;
            }
            else{
                fare=40;
            }
            System.out.println("METRO TICKET");
            System.out.println("Passenger Name : " + name);
            System.out.println("From           : " + start);
            System.out.println("To             : " + stop);
            System.out.println("Stops          : " + no_of_stops);
            System.out.println("Fare           : " + fare);
            System.out.println("-------------------------");

            System.out.println("Book another ticket (Y/n)");
            Scanner sc =new Scanner(System.in);
            char ch = sc.next().charAt(0);

            if(ch == 'y' || ch == 'Y')
            {
                tickets();
            }
            else{
                System.out.println("Thanks you");
            }
    }
    public static void main(String[] args) 
    {
        tickets();
    }
}
