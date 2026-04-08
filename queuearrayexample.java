import java.util.Scanner;

class QueueArray {
    int front, rear, size;
    int arr[];

    // Constructor
    QueueArray(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }
    boolean isFull() {
        return rear == size - 1;
    }
    boolean isEmpty() {
        return front == -1 || front > rear;
    }

    // Enqueue operation
    void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue Overflow");
        } else {
            if (front == -1) front = 0;
            arr[++rear] = value;
            System.out.println(value + " inserted");
        }
    }

    // Dequeue operation
    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println(arr[front] + " deleted");
            front++;
        }
    }

    // Peek operation
    void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front element: " + arr[front]);
        }
    }

    // Display queue
    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

public class queuearrayexample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter queue size: ");
        int size = sc.nextInt();

        QueueArray q = new QueueArray(size);

        int choice;
        do {
            System.out.println("\n1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    q.enqueue(val);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.peek();
                    break;
                case 4:
                    q.display();
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