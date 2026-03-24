class areacal{
    
    void area(int a){
        System.out.println("Area of square="+(a*a));
    }
    void area(int a,int b){
        System.out.println("Area of rectange="+(a*b));
    }
    void area(double a){
        System.out.println("Area of cirlce="+(3.14*a*a));
    }
}


public class areacalculator {
    public static void main(String[] args) {
        areacal a=new areacal();
        a.area(5);
        a.area(5,6);
        a.area(3.0);
    }
}
