import java.util.*;

abstract class person{
    String name;
    int age;

    person(String name, int age){
        this.name=name;
        this.age=age;
    }
    abstract void displaydetails();
}

interface universitymember{
    String getmembertype();
}

class student extends person implements universitymember{
    int rollno;
    String course;

    public student(int rollno, String course, String name, int age) {
        super(name, age);
        this.rollno = rollno;
        this.course = course;
    }
    
    void displaydetails(){
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollno);
        System.out.println("Course: " + course);
    }

    public String getmembertype(){
        return "student";
    }
}

class faculty extends person implements universitymember{
    int facultyid;
    String depart;

    public faculty(int facultyid, String depart, String name, int age) {
        super(name, age);
        this.facultyid = facultyid;
        this.depart = depart;
    }
    void displaydetails(){
        System.out.println("Faculty Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Faculty ID: " + facultyid);
        System.out.println("Department: " + depart);
    }

    public String getmembertype(){
        return "faculty";
    }

}
class University {
    ArrayList<person> members = new ArrayList<>();

    // Add member
    void addMember(person p) {
        members.add(p);
        System.out.println("Member added successfully.");
    }

    // Remove member
    void removeMember(person p) {
        members.remove(p);
        System.out.println("Member removed successfully.");
    }

    // Display all members
    void displayMembers() {
        for (person p : members) {
            p.displaydetails();

            // Type checking using interface
            if (p instanceof universitymember) {
                universitymember u = (universitymember) p;
                System.out.println("Member Type: " + u.getmembertype());
            }

            System.out.println("----------------------");
        }
    }
}

// Main Class
public class UniversitySystem {
    public static void main(String[] args) {
        University u = new University();

        student s1 = new student(101, "Computer Science", "Pranav", 20);
        faculty f1 = new faculty(5001, "IT", "Dr. Kumar", 45);

        u.addMember(s1);
        u.addMember(f1);

        System.out.println("\n--- University Members ---");
        u.displayMembers();

        u.removeMember(s1);

        System.out.println("\n--- After Removal ---");
        u.displayMembers();
    }
}

