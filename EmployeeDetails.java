abstract class Employee{
    abstract void calculateSalary();

    void display(){
    System.out.println("Employee Details: ");
   }
}
class FullTime extends Employee{
    void calculateSalary(){
        System.out.println("FullTime Salary : 50000");
    }
}
class PartTime extends Employee{
    void calculateSalary(){
        System.out.println("PartTime Salary : 20000");
    }
}
public class EmployeeDetails {
    public static void main(String[] args) {
        Employee e;
         
        e = new FullTime();
        e.display();
        e.calculateSalary();

        e = new PartTime();
        e.calculateSalary();
    }
    
}