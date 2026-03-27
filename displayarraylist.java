import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class displayarraylist {
    public static void main(String[] args) {

        List<String> items = new ArrayList<>();

        // Adding elements
        items.add("BMW");
        items.add("volvo");
        items.add("Audi");
        items.add("mercedes");
        items.add("ferrari");

        // Display original list
        System.out.println("Original List:");
        for(String item : items){
            System.out.println(item);
        }

        // Size
        System.out.println("\nSize of list: " + items.size());

        // Contains check
        if(items.contains("BMW"))
            System.out.println("BMW is present");
        else
            System.out.println("BMW is not present");

        // Remove element at index 1
        System.out.println("\nRemoved element: " + items.remove(1));

        // Display after removal
        System.out.println("\nList after removal:");
        for(String item : items){
            System.out.println(item);
        }

        // Sorting
        Collections.sort(items);

        // Display sorted list
        System.out.println("\nSorted List:");
        for(String item : items){
            System.out.println(item);
        }
        Collections.sort(items, Collections.reverseOrder());
        for(String item:items){
            System.out.println(item);
        }
    }
}