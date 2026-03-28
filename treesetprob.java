    import java.util.*;
public class treesetprob {

    public static void main(String[] args){
        TreeSet<Integer> num= new TreeSet<>();
        num.add(10);
        num.add(20);
        num.add(10);
        num.add(15);
        num.add(9);
        num.add(40);
        System.out.println("TreeSet " +num);
        num.remove(9);
        System.out.println("AFter remov(9): "+num);
        System.out.println("first "+num.first());
        System.out.println("LAst : "+num.last());
    }
}

