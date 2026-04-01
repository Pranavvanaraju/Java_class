import java.util.*;

public class unique_elements_stream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 6);
        list.stream()
            .distinct()
            .forEach(System.out::println);
    }
}