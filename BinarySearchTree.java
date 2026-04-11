class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class BinarySearchTree {

    // Insert into BST
    Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }

        return root;
    }

    // Inorder Traversal (Left -> Root -> Right)
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();
        Node root = null;

        int[] values = {20, 10, 11, 5, 4, 6, 7, 15, 17, 25, 79, 100, 77, 78};

        // Insert values into BST
        for (int val : values) {
            root = tree.insert(root, val);
        }

        // Print inorder traversal
        System.out.println("Inorder Traversal:");
        tree.inorder(root);
    }
}