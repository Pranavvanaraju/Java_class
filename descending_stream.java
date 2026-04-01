import java.util.*;

public class descending_stream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 2, 8, 1, 9, 3);
        list.stream()
            .sorted((a, b) -> b - a)
            .forEach(System.out::println);
    }
}