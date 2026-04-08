    import java.util.Scanner;

    class Stack {
        int maxSize;
        int[] arr;
        int top;

        Stack(int size) {
            maxSize = size;
            arr = new int[maxSize];
            top = -1;
        }

        void push(int value) {
            if (top == maxSize - 1) {
                System.out.println("Stack Overflow");
            } else {
                arr[++top] = value;
                System.out.println(value + " inserted");
            }
        }

        void pop() {
            if (top == -1) {
                System.out.println("Stack Underflow");
            } else {
                System.out.println(arr[top--] + " deleted");
            }
        }

        void peek() {
            if (top == -1) {
                System.out.println("Stack is empty");
            } else {
                System.out.println("Top element: " + arr[top]);
            }
        }

        void display() {
            if (top == -1) {
                System.out.println("Stack is empty");
            } else {
                System.out.println("Stack elements:");
                for (int i = top; i >= 0; i--) {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    public class stackarrayexample {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter stack size: ");
            int size = sc.nextInt();

            Stack s = new Stack(size);

            int choice;

            do {
                System.out.println("\n--- STACK MENU ---");
                System.out.println("1. Push");
                System.out.println("2. Pop");
                System.out.println("3. Peek");
                System.out.println("4. Display");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter value: ");
                        int val = sc.nextInt();
                        s.push(val);
                        break;

                    case 2:
                        s.pop();
                        break;

                    case 3:
                        s.peek();
                        break;

                    case 4:
                        s.display();
                        break;

                    case 5:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice");
                }

            } while (choice != 5);

            sc.close();
        }
    }