

class Node {
    int data;
    Node next;
    Node prev;
}

public class CircularSingleLL {
    public static void main(String[] args) {
        Node node1=new Node();
        Node node2=new Node();
        Node node3=new Node();
        node1.data=23;
        node2.data=11;
        node3.data=43;
        node1.next=node2;
        node2.next=node3;
        node3.next=node1;
        Node temp=node1;
        System.out.println(node1.data);
        temp=temp.next;
        while(temp!=node1){
            System.out.println(temp.data);
            temp=temp.next;
        }
      
    }
}
