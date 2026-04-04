import java.util.Scanner;

public class LLInsertfromhead {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node head = null;
        Node tail=null;
        int n=sc.nextInt();
        while(n>0){
            Node newNode=new Node();
            newNode.data=sc.nextInt();
            newNode.next=head;
            head =newNode;
            n--;
        }
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        
    }
}