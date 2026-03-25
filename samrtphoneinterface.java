interface wifi{
    void connectwifi();
}
interface bluetooth{
    void connectbluetooth();
}

interface camera{
    void capture();
}

class smartphone implements wifi,bluetooth,camera{
    public void connectwifi(){
        System.out.println("Wifi is connected");
    }
    public void connectbluetooth(){
        System.out.println("Bluetooth is connected");
    }
    public void capture(){
        System.out.println("phot is captured");
    }
}

public class samrtphoneinterface {
    public static void main(String[] args) {
        wifi w=new smartphone();
        w.connectwifi();

        bluetooth b=new smartphone();
        b.connectbluetooth();

        camera c=new smartphone();
        c.capture();
    }
}
