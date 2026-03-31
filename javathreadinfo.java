
class sample extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Pranav");
        }
    }
}

class sam extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("vanaraju");
    }}
}

public class javathreadinfo {
    public static void main(String[] args) {
        sample a=new sample();
        sam b=new sam();
        a.start();
        b.start();
    }
}
