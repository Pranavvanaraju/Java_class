interface Calculator{
    void add(int a, int b);
    void subtract(int a, int b);
    void multiply(int a, int b);
}
class SimpleCalculator implements Calculator{
    public void add(int a , int b){
        System.out.println("ADD : "+ (a + b));
    }
    public void subtract(int a,int b){
        System.out.println("Subtract : " + (a - b));
    }
    public void multiply(int a ,int b){
        System.out.println("Multiply : " + (a * b));
    }
}

public class interfaceCalculator {
    
    public static void main(String[] args) {
        Calculator c1 = new SimpleCalculator();

        c1.add(8, 8);
        c1.subtract(6, 3);
        c1.multiply(5, 2);
    }
}