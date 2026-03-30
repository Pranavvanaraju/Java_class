import java.util.*;

public class queuerevresekelemets{
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        int k = 3;

        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < k; i++) {
            s.push(q.poll());
        }

        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        for (int i = 0; i < q.size() - k; i++) {
            q.add(q.poll());
        }

        System.out.println(q);
    }
}