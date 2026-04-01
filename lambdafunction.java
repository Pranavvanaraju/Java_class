@FunctionalInterface
interface MyFunction {
    void display(int  i ,int j);
}

public class lambdafunction {
    public static void main(String[] args) {

        MyFunction obj = (i,j) -> {
            System.out.println("Hello with Lambda:"+i*j);
        };

        obj.display(12,3);
    }
}