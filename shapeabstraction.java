abstract  class shape{
    abstract void area();

    void display(){
        System.out.println("calculating area");
    }
}

class square extends shape{
    int a=5;
    void area(){
        System.out.println("area of the square: "+(a*a));
    }
}

class rectangle extends shape{
    int b=3;
    int c=3;
    void area(){
        System.out.println("Area of the rectangle:" +(b*c));
    }
}

public class shapeabstraction {
    public static void main(String[] args) {
        shape s;
        s=new square();
        s.display();
        s.area();

        s=new rectangle();
        s.display();
        s.area();
        
    }
}
