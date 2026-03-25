class Student{
    private String name;
    private int marks;

    //Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        if(marks >= 0 && marks <= 100){
            this.marks = marks;
        } else {
            System.out.println("Invalid Number");
        }
    }

    //Getter Methods
    public String getName(){
        return name;
    }
    public int getMarks(){
        return marks;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("maara");
        s.setMarks(95);

        System.out.println("Name : " + s.getName());
        System.out.println("Marks : " + s.getMarks());
    
    }
    
}