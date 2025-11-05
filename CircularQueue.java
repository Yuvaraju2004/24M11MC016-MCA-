class CircularQueue {
    int[] queue;
    int front, rear, size;
    // Constructor to initialize queue
    public CircularQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }
    // Check if the queue is full
    public boolean isFull() {
        return (rear + 1) % size == front;
    }
    // Check if the queue is empty
    public boolean isEmpty() {
        return front == -1;
    }
    // Enqueue operation (Insertion)
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full! Cannot insert " + value);
            return;
        }
        if (isEmpty()) {
            front = 0; // Initialize front if first element
        }
        rear = (rear + 1) % size; // Circular increment
        queue[rear] = value;
        System.out.println("Inserted: " + value);
    }
    // Dequeue operation (Deletion)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Nothing to delete.");
            return -1;
        }
        int removed = queue[front];
        if (front == rear) { // If last element is removed
            front = rear = -1;
        } else {
            front = (front + 1) % size; // Circular increment
        }
        System.out.println("Deleted: " + removed);
        return removed;
    }
    // Peek operation (Front element)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return queue[front];
    }

    // Display queue elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Circular Queue: ");
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear) break; // Stop when we reach rear
            i = (i + 1) % size;
        }
        System.out.println();
    }

    // Main method to test Circular Queue
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.display(); // Display queue elements
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(6);
        queue.enqueue(7);
        queue.dequeue();
        queue.enqueue(8);
        queue.display();
    }
}