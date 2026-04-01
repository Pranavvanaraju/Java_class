import java.util.*;

public class uppercasestreams {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("john", "arun", "zara", "bala");
        list.stream()
            .map(s -> s.toUpperCase())
            .forEach(System.out::println);
    }
}