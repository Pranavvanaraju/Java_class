
class sample extends Thread{
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println("Pranav");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }
    }
}

class sam extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("vanaraju");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }
    }
}  

class v extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Pranav_vanaraju");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }
    }
}  
public class threadtask1 {
    public static void main(String[] args) {
        sample a=new sample();
        sam b=new sam();
        v c=new v();
        a.start();
        b.start();
        c.start();
    }
}
