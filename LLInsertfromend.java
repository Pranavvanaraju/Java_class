import java.util.*;
public class LLInsertfromend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head=null;
        Node tail =null;
        int n=sc.nextInt();
        while(n>0){
            Node newNode=new Node();
            newNode.data=sc.nextInt();
            if(head==null){
                head=newNode;
                tail=newNode;
            }
            else{
                tail.next=newNode;
                tail=newNode;
            }
            n--;
        }
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}