import java.util.*;
public class sort_stream {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(4,8,7,5,2,10);
        System.out.println("Sorted list ");
        ls.stream().sorted().forEach(n-> System.out.println(n));

    }}