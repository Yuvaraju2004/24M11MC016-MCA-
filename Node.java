//Write A java program to demonstrate all queue operations using doubly linked list
class Node {
    int data;
    Node prev, next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class QueueUsingDLL {
    private Node front, rear;

    public QueueUsingDLL() {
        this.front = this.rear = null;
    }

    // Enqueue operation
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
        System.out.println(data + " enqueued");
    }

    // Dequeue operation
    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        int value = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        } else {
            front.prev = null;
        }
        System.out.println(value + " dequeued");
        return value;
    }

    // Peek operation
    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Display queue elements
    public void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        System.out.print("Queue: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}class Main{
    public static void main(String[] args) {
        QueueUsingDLL queue = new QueueUsingDLL();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();
        queue.dequeue();
        queue.display();
        System.out.println("Front element: " + queue.peek());
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}