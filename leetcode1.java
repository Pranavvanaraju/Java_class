import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class leetcode1 {
    public static void main(String[] args) {

        int a[]={7,8,3,4,15,13,4,1};
        int c;
        ArrayList<Integer> b = new ArrayList<>();
        Arrays.sort(a);
        System.out.println("Sorted input: " + Arrays.toString(a));
        for(int i=0;i<a.length/2;i++){
            int j = a.length-1-i;
            c = (a[i] + a[j]) / 2;
            b.add(c);
        }
        Collections.sort(b);
        System.out.println("Sorted result: " + b.get(0));
    }
}