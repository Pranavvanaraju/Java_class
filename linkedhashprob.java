import java.util.LinkedHashSet;

public class linkedhashprob {
    public static void main(String[] args) {

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(50);
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(40);

        System.out.println("Elements in insertion order: " + set);

        set.remove(30);
        System.out.println("After removing 30: " + set);

        System.out.println("Traversing using for-each loop:");
        for (Integer num : set) {
            System.out.println(num);
        }

        LinkedHashSet<Integer> newSet = new LinkedHashSet<>();

        for (Integer num : set) {
            newSet.add(num);
        }

        System.out.println("Elements in new LinkedHashSet:");
        for (Integer num : newSet) {
            System.out.println(num);
        }
    }
}