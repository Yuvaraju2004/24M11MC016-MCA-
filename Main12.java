class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyQueue {
    Node front, rear;

    MyQueue() {
        front = rear = null;
    }

    boolean isEmpty() {
        return front == null && rear == null;
    }

    void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return;
        }
        front = front.next;
        if (front == null) rear = null;
    }

    int getFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        return front.data;
    }

    int getRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        return rear.data;
    }
}

public class Main {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enqueue(10);
        q.enqueue(20);
        System.out.println("Queue Front: " + q.getFront());
        System.out.println("Queue Rear: " + q.getRear());
        q.dequeue();
        q.dequeue();
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.dequeue();
        System.out.println("Queue Front: " + q.getFront());
        System.out.println("Queue Rear: " + q.getRear());
    }
}
