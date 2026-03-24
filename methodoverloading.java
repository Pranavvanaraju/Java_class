class operation{
    
    void add(int a,int b){
        System.out.println("Int sum="+(a+b));
    }

    void add(double a ,double b){
        System.out.println("Double sum="+(a+b));
    }
}



public class methodoverloading {
    public static void main(String[] args) {
        operation o=new operation();
        o.add(2,3);
        o.add(2.6,3.5); 
        
    }
}
