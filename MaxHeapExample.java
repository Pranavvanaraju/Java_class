import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeapExample {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(30);
        pq.add(10);
        pq.add(50);
        pq.add(20);
        System.out.println("Priority Queue (Max-Heap): " + pq);
        System.out.println("Elements removed in order:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}