class student{
    void cal(int a,int b){
        System.out.println("total mark for 2 subkects : "+(a+b));
    }
    void cal(int a,int b,int c){
        System.out.println("Total mark for 3 subjects : "+(a+b+c));
    }
}

public class taskfour {
    public static void main(String[] args) {
        student s=new student();
        s.cal(80,75);
        s.cal(67, 85,95);
    }
}
