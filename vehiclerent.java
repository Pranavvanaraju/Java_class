import java.util.Scanner;

interface vehicle{
    void rent(int km);
}
class car implements vehicle{
    public void rent(int km)
    {
        int rate=150;
        System.out.println(km*rate);
    }
}
class bike implements vehicle{
    public void rent(int km)
    {
        int rate=100;
        System.out.println(km*rate);
}}
class truck implements vehicle{
    public void rent(int km){
        int rate=500;
        System.out.println(km*rate);

    }
}


public class vehiclerent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many vehicles needed max 3");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("what type of vehicle with km");
            String veh=sc.next();
            int km=sc.nextInt();
            
            vehicle v;
             if (veh.equalsIgnoreCase("car")) {
                v = new car();
            } else if (veh.equalsIgnoreCase("bike")) {
                v = new bike();
            } else {
                v = new truck();
            }

            v.rent(km);

        }
        System.out.println("Thank You");
    }
}
