

public class LLInsertusingmethod {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head;
    static void fun(int val,int pos){
        if(head==null){
            System.out.println(val);
            return;
        }
        Node newNode=new Node(val);
        Node temp=head;
        if(pos==0){
            newNode.next=head;
            head=newNode;
        }
        else{
            for(int i=0;i<pos-1 && temp!=null;i++){
                temp=temp.next;
            }
            if(temp==null){
                System.out.println("Invalid position");
            }
            else{
                newNode.next=temp.next;
                temp.next=newNode;
            }
        }
    }
    public static void main(String[] args) {
        Node head =new Node(11);
        head.next=new Node(22);
        head.next.next=new  Node(33);
        head.next.next.next=new Node(44);
        head.next.next.next.next=new Node(55);
        int val=10;
        int pos=3;
        fun(val, pos);
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data +" ");
        }


    }

}