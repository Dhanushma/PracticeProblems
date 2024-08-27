/*
package dhanu.study.easy;

public class BinarySearchTreeImpl {

    Node root;

    public BinarySearchTreeImpl() {
        this.root = null;
    }

    public void insert(int data) {
        Node node = new Node(data);
        if (root == null) {
            root = node;
            return;
        }

        Node current = root;
        if (data > current.getData()) {
            current.right = node;
        }

        if (data < current.getData()) {
            current.left = node;
        }
    }

    public Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value < root.data) {
            root.left = insertRec(root.left, value);
        }

        if (value > root.data) {
            root.left = insertRec(root.right, value);
        }
        return root;
    }
}


    public class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public int getData() {
            return data;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }

        public void setData(int data) {
            this.data = data;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }
}

*/
