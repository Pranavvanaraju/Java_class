public class LLdeletenode {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        Node head =new Node(11);
        head.next=new Node(22);
        head.next.next=new  Node(33);
        head.next.next.next=new Node(44);
        head.next.next.next.next=new Node(55);
        int val=33;
        Node temp=head;
        while(temp.next!=null&&temp.next.data!=val){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        temp=head;
        while(temp!=null){
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
    }
}
