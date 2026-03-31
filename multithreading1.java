class sample extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }
    }
}
class v extends Thread{
    public void run(){
        for(int i=6;i<=10;i++){
            System.out.println(i);
        }
    }
}
public class multithreading1 {
    public static void main(String[] args) {
        sample k = new sample();
        v z = new v();
        k.start();
        z.start();
    }
}