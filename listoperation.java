import java.util.ArrayList;
import java.util.List;

public class listoperation {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();

        items.add("Apple");
        items.add("orange");
        items.add("banana");
        items.add(2, "kiwi");

        String arr[] = items.toArray(new String[0]);

        for(int i = 0; i < items.size(); i++){
            System.out.println(arr[i] + " ");
        }

        System.out.println();
        System.out.println(items);
        System.out.println(items.size());
        System.out.println(items.indexOf("banana"));
        System.out.println(items.lastIndexOf("banana"));
        System.out.println(items.isEmpty());
        System.out.println(items.remove(2));
    }
}