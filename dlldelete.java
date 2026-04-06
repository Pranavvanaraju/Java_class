public class dlldelete {
    static class Node{
        int data;
        Node prev, next;

        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(11);
        Node second = new Node(22);
        Node third = new Node(33);
        Node fourth = new Node(44);
        Node fifth = new Node(55);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        third.next = fourth;
        fourth.prev = third;
        fourth.next = fifth;
        fifth.prev = fourth;
        int val = 44;
        Node temp = head;

        while(temp != null && temp.data != val){
            temp = temp.next;
        }
        if(temp != null){
            if(temp == head){
                head = head.next;
                if(head != null) head.prev = null;
            } else {
                if(temp.next != null)
                    temp.next.prev = temp.prev;
                if(temp.prev != null)
                    temp.prev.next = temp.next;
            }
        }
        temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
}