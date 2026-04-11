import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class BinaryTreeInsertionTraversal {
    Node root;

    public void insert(int value) {
        Node newNode = new Node(value);

        if (root == null) {
            root = newNode;
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();

            if (temp.left == null) {
                temp.left = newNode;
                return;
            } else {
                queue.add(temp.left);
            }

            if (temp.right == null) {
                temp.right = newNode;
                return;
            } else {
                queue.add(temp.right);
            }
        }
    }

    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    public void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");

        }
    }

    public static void main(String[] args) {
        BinaryTreeInsertionTraversal tree = new BinaryTreeInsertionTraversal();

        tree.insert(11);
        tree.insert(22);
        tree.insert(30);
        tree.insert(33);
        tree.insert(44);
        tree.insert(55);
        tree.insert(60);
        tree.insert(70);

        System.out.println("Inorder Traversal:");
        tree.inorder(tree.root);
        System.out.println("\nPreorder Traversal:");
        tree.preorder(tree.root);
        System.out.println("\nPostorder Traversal:");
        tree.postorder(tree.root);
    }
}