package dhanu.study;

public class ReverseDoublyLinkedList {

    static class Node {
        int data;
        Node prev;
        Node next;

        public Node(int input) {
            data = input;
            prev = null;
            next = null;
        }
    }

    static Node add(Node head, Node newNode) {
        newNode.prev = null;
        newNode.next = head;

        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
        return head;
    }

    static Node reverse(Node node) {
        if (node == null){
            return null;
        }
        Node temp = node.next;
        node.next = node.prev;
        node.prev = temp;

        if(node.prev == null){
            return node;
        }
        return reverse(node.prev);

    }

    static void printList(Node node){
        while (node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Node head = null;

        head = add(head, new Node(8));
        head = add(head, new Node(6));
        head = add(head, new Node(4));
        head = add(head, new Node(2));

        System.out.println("printing before reversing");
        printList(head);

        head = reverse(head);
        System.out.println("Printing after reversing");
        printList(head);
    }
}
