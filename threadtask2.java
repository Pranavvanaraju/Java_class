
class sample extends Thread{
    int j=0;
    public void run(){
        for(int i=0;i<50;i++){
            j=i;
    }
    }}

public class threadtask2 {
    public static void main(String[] args) {
        sample k=new sample();
        k.start();
        try {
            k.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(k.j);
    }
}
