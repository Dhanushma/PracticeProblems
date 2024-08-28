package dhanu.study.easy;

public class LinkedListLoop {

    Node head;
    // Implement a LinkedList and detect loops in it


    public LinkedListLoop() {
        head = null;
    }

    public class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public void push(int value) {
        Node node = new Node(value);

        node.next = head;
        head = node;
    }

    public boolean detectLoop() {

        Node first = head;
        Node second = head;

        while (first.next != null && second.next != null && second.next.next != null) {

            first = first.next;
            second = second.next.next;

            if (first == second) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        LinkedListLoop list = new LinkedListLoop();
        list.push(5);
        list.push(8);
        list.push(13);
        list.push(22);
        list.push(18);

        list.head.next.next.next.next = list.head.next;

        System.out.println(list.detectLoop());
    }
}
