import java.util.*;

public class duplicateremoval {
    public static void main(String[] args) {
        int a[] = {5, 2, 3, 2, 5, 1};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1 || a[i] != a[i + 1]) {
                System.out.print(a[i] + " ");
            }
        }
    }
}