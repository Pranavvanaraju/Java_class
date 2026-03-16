import java.util.Scanner;

public class mark_project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];
        int op;

        while(true){

            System.out.println("\n1. Enter Marks");
            System.out.println("2. Display Marks");
            System.out.println("3. Total Marks");
            System.out.println("4. Average Marks");
            System.out.println("5. Highest Mark");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            op = sc.nextInt();

            switch (op) {

                case 1:
                    System.out.println("Enter the five student marks:");
                    for(int i=0;i<5;i++)
                    {
                        marks[i]=sc.nextInt();
                    }
                    break;

                case 2:
                    System.out.println("Student Marks:");
                    for(int i = 0; i < 5; i++) {
                        System.out.println("Student " + (i+1) + ": " + marks[i]);
                    }
                    break;
                 case 3:
                    int total = 0;
                    for(int i = 0; i < 5; i++) {
                        total += marks[i];
                    }
                    System.out.println("Total Marks = " + total);
                    break;

                case 4:
                    int sum = 0;
                    for(int i = 0; i < 5; i++) {
                        sum += marks[i];
                    }
                    double avg = sum / 5.0;
                    System.out.println("Average Marks = " + avg);
                    break;

                case 5:
                    int max = marks[0];
                    for(int i = 1; i < 5; i++) {
                        if(marks[i] > max) {
                            max = marks[i];
                        }
                    }
                    System.out.println("Highest Mark = " + max);
                    break;

                case 6:
                    System.out.println("Program Ended");
                    return;

                default:
                    System.out.println("Invalid choice");
            }

        }
    }
}