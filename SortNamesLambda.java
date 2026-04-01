import java.util.*;

public class SortNamesLambda {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Arun");
        names.add("Zara");
        names.add("Bala");
        names.add("Kiran");

        Collections.sort(names, (a, b) -> a.compareTo(b));

        System.out.println("Sorted Names:");
        for(String name : names) {
            System.out.println(name);
        }
    }
}