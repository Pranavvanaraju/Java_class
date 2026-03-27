import java.util.*;
public class linkedlistfunc{
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.addFirst(5);
        list.addLast(40);

        System.out.println("Elements = " + list);    
        
        if (list.contains(20)){
            System.out.println("It exist");
        }
        else
            System.out.println("It does not exist");
}
}