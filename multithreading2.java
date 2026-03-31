class sample extends Thread{
    public void run(){
        System.out.println("Even Numbers:");
        for(int i=1;i<=10;i++){
            if(i%2==0){
            System.out.println(i);
            }
        }
    }
}
class v extends Thread{
    public void run(){
        System.out.println("Odd Numbers:");
        for(int i=1;i<=10;i++){
            if(i%2!=0){
            System.out.println(i);
            }
        }
    }
}
public class multithreading2 {
    public static void main(String[] args) {
        sample k = new sample();
        v z = new v();
        k.start();
        z.start();
    }
}