

class Node {
    int data;
    Node next;
    Node prev;
}

public class circularLLdeletion{
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
        Node head=node1;
        int val=11;
        Node temp=head;
        Node prev=null;
        do { 
            if(temp.data==val){
                if(temp==head){
                    Node last=head;
                    while(last.next!=head){
                        last=last.next;
                    }
                    head=head.next;
                    last.next=head;
                }else{
                    prev.next=temp.next;
                }
                break;
            }
            prev=temp;
            temp=temp.next;
        } while (temp!=head);
        temp=head;
        do { 
            System.out.println(temp.data );
            temp=temp.next;
        } while (temp!=head);  
    }
}
