import java.util.*;
public class hashset {
    public static void main(String[] args) {
        HashSet<String> a=new HashSet<>();
        a.add("maara");
        a.add("alex");
        a.add("raj");
        a.add("Fury");
        System.out.println(a);

        System.out.println("To check the value is present");
        if(a.contains("alex"))
            System.out.println("Alex is present");
        else
            System.out.println("alex not present");
        System.out.println("Set size:" +a.size());
        

    }
}
