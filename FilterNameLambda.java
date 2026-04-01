import java.util.*;

public class FilterNameLambda {
    public static void main(String[] args) {

        List<String> names = Arrays.asList(
            "Arun", "John", "Amit", "Bala", "Anu", "Kiran"
        );

        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(name -> System.out.println(name));
    }
}