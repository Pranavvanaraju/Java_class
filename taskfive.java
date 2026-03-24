class example{
    void ex(int a,String b){
        System.out.println("Parameters are:" +a +" "+b);
    }
    void ex(String c , int d){
        System.out.println("Parameters are:" +c+" "+d);
    }
}

public class taskfive {
    public static void main(String[] args) {
        example e=new example();
        e.ex(8,"Apple");
        e.ex("orange", 5);
    }
}
