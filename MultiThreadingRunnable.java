class HelloTask implements Runnable {
    public void run() {
        System.out.println("Hello");
    }
}

class WorldTask implements Runnable {
    public void run() {
        System.out.println("World");
    }
}

public class MultiThreadingRunnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new HelloTask());
        Thread t2 = new Thread(new WorldTask());

        t1.start();
        t2.start();
    }
}