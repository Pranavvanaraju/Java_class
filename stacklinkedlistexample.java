import java.util.Scanner;
public class stacklinkedlistexample{
    static class Stack{
        static class Node{
            int data;
            Node next;
            Node(int data){
                this.data = data;
                this.next = null;
            }
        }
        Node top;
        Stack(){
            top=null;
        }

        void push(int value){
            Node newNode= new Node(value);
            newNode.next=top;
            top=newNode;
            System.out.println(value+"pushed");
        }

        void pop(){
            if(top==null){
                System.out.println("stack is empty ");
            }else{
                System.out.println("top elemet"+top.data);
                top=top.next;
            }

        }

        void peek(){
            if(top==null){
                System.out.println("Stak is empty");
            }else{
                System.out.println("Removed element:"+top.data);
            }
        }

        void display(){
            if(top==null){
                System.out.println("stack is empty");
            }else{
                Node temp=top;
                System.out.println("Stack elements");
                while(temp!=null){
                    System.out.println(temp.data);
                    temp=temp.next;
                }
            }
        }
    }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Stack stack=new Stack();
       int choice;
       do {
                System.out.println("\n--- STACK MENU ---");
                System.out.println("1. Push");
                System.out.println("2. Pop");
                System.out.println("3. Peek");
                System.out.println("4. Display");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter value: ");
                        int val = sc.nextInt();
                        stack.push(val);
                        break;

                    case 2:
                        stack.pop();
                        break;

                    case 3:
                        stack.peek();
                        break;

                    case 4:
                        stack.display();
                        break;

                    case 5:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice");
                }

            } while (choice != 5);

            sc.close();
        }
    }