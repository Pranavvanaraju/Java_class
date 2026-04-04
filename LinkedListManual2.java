class Node{
    int data;
    Node next;
}
class LinkedListManual2 {
    public static void main(String[] args) {
        Node head =new Node();
        head.next=new Node();
        head.next.next=new Node();
        head.data=10;
        head.next.data=20;
        head.next.next.data=30;
        Node temp = head;

        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println(head.data);
    }
}
