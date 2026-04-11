import java.util.Scanner;

public class queuelinkedlistexample {
   static class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Queue using Linked List
static class QueueLinkedList {
    Node front, rear;

    // Check empty
    boolean isEmpty() {
        return front == null;
    }

    // Enqueue (Insert)
    void enqueue(int value) {
        Node newNode = new Node(value);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println(value + " inserted");
    }

    // Dequeue (Delete)
    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println(front.data + " deleted");
        front = front.next;

        // If queue becomes empty
        if (front == null) {
            rear = null;
        }
    }

    // Peek
    void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front element: " + front.data);
        }
    }

    // Display
    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        Node temp = front;
        System.out.print("Queue elements: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList q = new QueueLinkedList();

        int choice;
        do {
            System.out.println("\n1.Enqueue \n2.Dequeue \n3.Peek \n4.Display \n5.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    q.enqueue(sc.nextInt());
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
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid");
            }
        } while (choice != 5);

        sc.close();
    }
}