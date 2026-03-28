import java.util.HashSet;

public class hashprob1 {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(20);
        set.add(30);

        System.out.println("Unique Elements: " + set);
        System.out.println("Count of unique elements: " + set.size());

        set.remove(10);
        System.out.println("After removing 10: " + set);

        if (set.contains(30)) {
            System.out.println("30 is present in the set");
        } else {
            System.out.println("30 is not present in the set");
        }
    }
}