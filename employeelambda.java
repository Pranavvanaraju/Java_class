import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}

@FunctionalInterface
interface EmployeeFilter {
    boolean test(Employee e);
}

public class employeelambda {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Arun", 45000));
        employees.add(new Employee(102, "Bala", 60000));
        employees.add(new Employee(103, "Charan", 75000));
        employees.add(new Employee(104, "Divya", 50000));
        employees.add(new Employee(105, "Esha", 90000));

        EmployeeFilter filter = e -> e.salary > 50000;

        System.out.println("Employees whose salary is greater than 50000:");
        for (Employee e : employees) {
            if (filter.test(e)) {
                e.display();
            }
        }

        employees.sort((e1, e2) -> {
            if (e1.salary < e2.salary) return 1;
            if (e1.salary > e2.salary) return -1;
            return 0;
        });

        System.out.println("\nEmployees sorted in descending order of salary:");
        for (Employee e : employees) {
            e.display();
        }

        System.out.println("\nNames of all employees:");
        employees.forEach(e -> System.out.println(e.name));

        double sum = 0;
        for (Employee e : employees) {
            sum += e.salary;
        }
        double avg = sum / employees.size();

        System.out.println("\nAverage Salary: " + avg);
    }
}