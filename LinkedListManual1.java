

class Node{
    int data;
    Node next;
}
class LinkedListManual1 {
    public static void main(String[] args) {
        Node node1= new Node();
        Node node2=new Node();
        Node node3=new Node();
        node1.data=23;
        node2.data=43;
        node3.data=53;
        node1.next=node2;
        node2.next=node3;
        Node temp =node1;

        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println(node1.data);

    }
}
