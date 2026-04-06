class Node {
    int data;
    Node next;
    Node prev;
}

public class doublelinkedlist1 {
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