package dhanu.study.easy;

public class BTSImpl {

    Node root;

    private static class Node {

        int data;
        Node right;
        Node left;

        public Node(int data) {
            this.data = data;
            right = null;
            left = null;
        }

    }

    public void insert(int input) {
        root = insertRec(root, input);
    }

    private Node insertRec(Node root, int input) {

        if (root == null) {
            root = new Node(input);
            return root;
        }
        if (input < root.data) {
            root.left = insertRec(root.left, input);

        }
        else if (input > root.data) {
            root.right = insertRec(root.right, input);
        }

        return root;
    }

    public void inOrderTraverse(Node root) {

        if (root == null) {
            return;
        }

        else {
            inOrderTraverse(root.left);
            System.out.println(root.data);
            inOrderTraverse(root.right);
        }
    }

    public void preOrderTraverse(Node root) {
        if (root == null) {
            return;
        }

        else {
            System.out.println(root.data);
            preOrderTraverse(root.left);
            preOrderTraverse(root.right);
        }
    }

    public void postOderTraverse(Node root) {
        if (root == null) {
            return;
        }

        else {
            postOderTraverse(root.left);
            System.out.println(root.data);
            postOderTraverse(root.left);
        }
    }
}
