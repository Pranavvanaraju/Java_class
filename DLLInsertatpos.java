class Node {
    int data;
    Node next;
    Node prev;
}

public class DLLInsertatpos {
    public static void main(String[] args) {

        Node head = new Node();
        Node second = new Node();
        Node third = new Node();

        head.data = 10;
        second.data = 20;
        third.data = 30;

        head.next = second;
        second.next = third;
        third.next = null;

        head.prev = null;
        second.prev = head;
        third.prev = second;

        int data=25;
        int pos =3;

        Node newNode = new Node();
        newNode.data = data;
        
        if (pos == 1) {
            newNode.next = head;
            newNode.prev = null;
            head.prev = newNode;
            head = newNode;
        } else {
            Node temp = head;

            // Move to (pos-1)
            for (int i = 1; i < pos - 1 && temp != null; i++) {
                temp = temp.next;
            }

            if (temp == null) {
                System.out.println("Invalid position");
            } else {
                newNode.next = temp.next;
                newNode.prev = temp;

                if (temp.next != null) {
                    temp.next.prev = newNode;
                }

                temp.next = newNode;
            }
        }


        System.out.println("Forward traversal");
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;  // FIXED
        }
        System.out.println("Backward traversal");
        temp = third;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }
}