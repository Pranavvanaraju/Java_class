@FunctionalInterface
interface add{
    void display(int i, int j);
}
public class addtwonumslambda{
    public static void main(String[] args) {
        add sum =(i,j)->System.out.println(i+j);
        sum.display(5, 10);
    }
}