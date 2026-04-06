import java.util.Scanner;

public class project_student{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int choice;
        boolean isEntered = false;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Enter Marks");
            System.out.println("2. Display Marks");
            System.out.println("3. Find Total Marks");
            System.out.println("4. Find Average Marks");
            System.out.println("5. Find Highest Mark");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter marks for 5 students:");
                    for (int i = 0; i < 5; i++) {
                        marks[i] = sc.nextInt();
                    }
                    isEntered = true;
                    break;

                case 2:
                    if (!isEntered) {
                        System.out.println("Please enter marks first.");
                    } else {
                        System.out.println("Student Marks:");
                        for (int i = 0; i < 5; i++) {
                            System.out.print(marks[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    if (!isEntered) {
                        System.out.println("Please enter marks first.");
                    } else {
                        int total = 0;
                        for (int i = 0; i < 5; i++) {
                            total += marks[i];
                        }
                        System.out.println("Total Marks = " + total);
                    }
                    break;

                case 4:
                    if (!isEntered) {
                        System.out.println("Please enter marks first.");
                    } else {
                        int total = 0;
                        for (int i = 0; i < 5; i++) {
                            total += marks[i];
                        }
                        double avg = total / 5.0;
                        System.out.println("Average Marks = " + avg);
                    }
                    break;

                case 5:
                    if (!isEntered) {
                        System.out.println("Please enter marks first.");
                    } else {
                        int max = marks[0];
                        for (int i = 1; i < 5; i++) {
                            if (marks[i] > max) {
                                max = marks[i];
                            }
                        }
                        System.out.println("Highest Mark = " + max);
                    }
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}