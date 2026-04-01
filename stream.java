import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class stream {
    public static void main(String[] args) {
        List<String> names =Arrays.asList("Adam","eve","maara");
        names.stream().forEach(System.out::println);
        System.out.println("------------------");

        int[] numbers ={2,4,56,76,9};
        IntStream numbStream=Arrays.stream(numbers);
        numbStream.forEach(System.out::println);
        System.out.println("------------------");


        Stream<String> fruitStream= Stream.of("apples","banana","blueberry");
        fruitStream.forEach(System.out::println);
        System.out.println("------------------");

        Stream<String> helloStream=Stream.generate(()->"hello");
        helloStream.limit(5).forEach(System.out::println);
        System.out.println("------------------");
        
        Stream<Integer> numStream =Stream.iterate(3,n->n+1).limit(5);
        numStream.forEach(System.out::println);
    }
}
