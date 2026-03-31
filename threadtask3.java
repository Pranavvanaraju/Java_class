public class threadtask3  extends Thread{
    public static int amount=0;
    public static void main(String[] args) {
        threadtask3 thread =new threadtask3();
        thread.start();

        while(thread.isAlive()){
            System.out.println("Waiting..");
        }
        System.out.println("Main:" +amount);
        amount++;
        System.out.println("Main:" +amount);
        
    }
    public void run(){
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }
        amount++;
    }
}
