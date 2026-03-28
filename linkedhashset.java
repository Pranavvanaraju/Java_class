import java.util.*;
public class linkedhashset {
    public static void main(String[] args) {
        LinkedHashSet<Integer> a=new LinkedHashSet<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(10);

        System.out.println("after add "+a);
        LinkedHashSet<Integer> b=new LinkedHashSet<>();
        b.add(40);
        b.add(50);
        a.addAll(b);
        System.out.println("after add all:"+a);
        System.out.println("Contains 10?"+a.contains(10));
        System.out.println("Size:"+a.size());
        System.out.println("is empty? "+a.isEmpty());
        Iterator<Integer> it=a.iterator();
        while(it.hasNext()){
            System.out.println(it.next() + " ");
        }
        System.out.println();
            

    }
}
