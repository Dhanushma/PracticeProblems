package dhanu.study.medium;

public class DequeImpl {
    Node front;
    Node rear;
    int size;

    public DequeImpl() {
        size = 0;
        front = null;
        rear = null;
    }

    public static class Node {
        String data;
        Node next;
        Node prev;

        public Node(String data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }


    public void enqueueFront(String data) {

        Node node = new Node(data);

        if (front == null) {
            front = rear = node;
        }

        else {
            front.prev = node;
            node.next = front;
            front = node;
        }
        size ++;
    }

    public void enqueueRear(String data) {

        Node node = new Node(data);
        if (rear == null) {
            rear = front = node;
        }

        else {
            rear.next = node;
            node.prev = rear;
            rear = node;
        }
        size ++;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void dequeueFront() {

        if (isEmpty()) {
            System.out.println("Queue is empty");
        }

        else {
            front = front.next;
            if (front == null) {
                rear = null;
            }
            else {
                front.prev = null;
            }
        }
        size --;
    }

    public void dequeueRear () {
        if (isEmpty()) {
            System.out.println("Empty q");
        }
        else {
            rear = rear.prev;

            if (rear == null) {
                front = null;
            }
            else  {
                rear.next = null;
            }
        }
        size --;
    }

    public String getFront(){
        return front.data;
    }

    public String getRear() {
        return rear.data;
    }


    public static void main(String[] args) {
        DequeImpl dq = new DequeImpl();

        System.out.print(
                "Insert element '5' at rear end\n");
        dq.enqueueRear("5");

        System.out.print(
                "Insert element '10' at rear end\n");
        dq.enqueueRear("10");
        System.out.print("Rear end element: " + dq.getRear()
                + "\n");
        dq.dequeueRear();
        System.out.print(
                "After deleting rear element new rear"
                        + " is: " + dq.getRear() + "\n");
        System.out.print(
                "Inserting element '15' at front end \n");
        dq.enqueueFront("15");
        System.out.print(
                "Front end element: " + dq.getFront() + "\n");

        System.out.print("Number of elements in Deque: "
                + dq.size + "\n");
        dq.dequeueFront();
        System.out.print("After deleting front element new "
                + "front is: " + dq.getFront()
                + "\n");
    }
}
