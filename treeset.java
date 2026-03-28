import java.util.*;
public class treeset {
    public static void main(String[] args) {
        TreeSet<Integer> a=new TreeSet<>();
        a.add(10);
        a.add(20);
        a.add(5);
        a.add(15);
        a.add(25);
        
        System.out.println("Tree set:"+a );
        System.out.println("Contains 10?"+a.contains(10));

        a.remove(5);
        System.out.println("After removal"+a);
        System.out.println("First"+a.first());
        System.out.println("last:"+a.last());
        System.out.println("Higher than 15:"+a.higher(15));
        System.out.println("Lower than 15:"+a.lower(15));
        System.out.println("poll first:"+a.pollFirst());
        System.out.println("poll last:"+a.pollLast());
        System.out.println("After polling:"+a);
        System.out.println("Size:"+a.size());
    }
}
