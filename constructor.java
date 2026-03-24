class Area {
    Area(int height,int breadth) {
        System.out.println("The area of the rectangle is:" +(height*breadth));
    }

    Area(int side) {
        System.out.println("The area of the square is:" +(side*side));
    }
}

public class constructor {
    public static void main(String[] args) {
        Area shapes = new Area(6,3);
        Area shape = new Area(6);
    }
}