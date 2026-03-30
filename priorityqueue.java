import java.util.PriorityQueue;
public class priorityqueue {
    
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(50);
        pq.add(60);
        pq.add(70);
        pq.add(15);
        pq.add(5);
        pq.add(20);
        System.out.println("Priority Queue: " + pq);

        int removedElement = pq.poll();
        System.out.println("Removed element (smallest): " + removedElement);
        int nextElement = pq.peek();
        System.out.println("Next element (peek): " + nextElement);
    }
}
