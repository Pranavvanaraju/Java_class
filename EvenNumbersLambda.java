import java.util.*;

public class EvenNumbersLambda {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 15, 20, 25, 30, 35, 40);
        list.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });
    }
}