import java.util.ArrayList;
import java.util.List;

public class ShopingList {
    public static void main(String[] args) {

        List<String> items = new ArrayList<>();

        // Adding items
        System.out.println("Adding items...");
        items.add("Milk");
        items.add("Bread");
        items.add("Eggs");
        items.add("Rice");
        items.add("Milk"); // duplicate

        System.out.println("Shopping List after adding:");
        System.out.println(items);

        // Removing item
        System.out.println("\nRemoving item: Bread");
        items.remove("Bread");

        System.out.println("Shopping List after removal:");
        System.out.println(items);
    
}
 }