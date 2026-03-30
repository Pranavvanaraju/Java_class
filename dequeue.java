import java.util.*;

public class dequeue{
    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        // Insert at front and rear
        dq.addFirst(10);   // front
        dq.addLast(20);    // rear
        dq.addFirst(5);    // front
        dq.addLast(30);    // rear

        System.out.println("Before removal: " + dq);

        // Remove from front and rear
        dq.removeFirst();
        dq.removeLast();

        System.out.println("After removal: " + dq);
    }
}