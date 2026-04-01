import java.util.*;
import java.util.stream.Stream;
public class stream_even_numbers {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(4,8,7,5,2,10);
        Stream<Integer>dataStream=ls.stream();
        long evenum=dataStream.filter(n->n%2==0).count();
        System.out.println("Evenum number count--"+evenum);
    }
}
