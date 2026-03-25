abstract class vehicle{
    abstract void start();
    void fuel(){
        System.out.println("Fuel usage");
    }
}

class car extends vehicle{
    int cf=90;
    void start(){
        System.out.println("car fuel usage is:"+cf);

    }
}

class bike extends vehicle{
    int bf=70;
    void start(){
        System.out.println("bike  fuel usgae is:"+bf);
    }
}

public class vehicleabstract {
    public static void main(String[] args) {
    vehicle vh;
    
    vh = new bike();
    vh.fuel();
    vh.start();

    vh=new car();
    vh.fuel();
    vh.start();

    
    }
}
