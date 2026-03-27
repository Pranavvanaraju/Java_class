import java.util.ArrayList;
import java.util.List;

class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Pranav", 85));
        students.add(new Student(2, "Rahul", 78));
        students.add(new Student(3, "Anjali", 92));

        System.out.println("All Students:");
        for(Student s : students){
            System.out.println(s);
        }

        int searchId = 2;
        boolean found = false;

        System.out.println("\nSearching for ID: " + searchId);
        for(Student s : students){
            if(s.id == searchId){
                System.out.println("Student Found: " + s);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Student not found");
        }

        int updateId = 1;
        System.out.println("\nUpdating marks for ID: " + updateId);

        for(Student s : students){
            if(s.id == updateId){
                s.marks = 95;
                System.out.println("Updated Student: " + s);
            }
        }

        int removeId = 3;
        System.out.println("\nRemoving student with ID: " + removeId);

        students.removeIf(s -> s.id == removeId);

        System.out.println("\nFinal Student List:");
        for(Student s : students){
            System.out.println(s);
        }
    }
}