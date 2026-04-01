import java.util.*;

public class maximumstreams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 25, 5, 40, 15);
        int max = list.stream()
                      .max(Integer::compare)
                      .get();

        System.out.println("Maximum number: " + max);
    }
}