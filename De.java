class Deque {
    private int[] arr;
    private int front, rear, size;
    private int capacity;

    // Constructor to initialize deque
    public Deque(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    // Check if deque is full
    private boolean isFull() {
        return size == capacity;
    }

    // Check if deque is empty
    private boolean isEmpty() {
        return size == 0;
    }

    // Insert at the front
    public void insertFront(int data) {
        if (isFull()) {
            System.out.println("Deque is full! Cannot insert at front.");
            return;
        }

        if (isEmpty()) {  // If empty
            front = rear = 0;
        } else if (front == 0) {  // Circular wrap-around
            front = capacity - 1;
        } else {
            front--;
        }

        arr[front] = data;
        size++;
        System.out.println("Inserted " + data + " at front.");
    }

    // Insert at the rear
    public void insertRear(int data) {
        if (isFull()) {
            System.out.println("Deque is full! Cannot insert at rear.");
            return;
        }

        if (isEmpty()) {  // If empty
            front = rear = 0;
        } else if (rear == capacity - 1) {  // Circular wrap-around
            rear = 0;
        } else {
            rear++;
        }

        arr[rear] = data;
        size++;
        System.out.println("Inserted " + data + " at rear.");
    }

    // Delete from the front
    public void deleteFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty! Cannot delete from front.");
            return;
        }

        System.out.println("Deleted " + arr[front] + " from front.");

        if (front == rear) {  // Single element case
            front = rear = -1;
        } else if (front == capacity - 1) {  // Circular wrap-around
            front = 0;
        } else {
            front++;
        }

        size--;
    }

    // Delete from the rear
    public void deleteRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty! Cannot delete from rear.");
            return;
        }

        System.out.println("Deleted " + arr[rear] + " from rear.");

        if (front == rear) {  // Single element case
            front = rear = -1;
        } else if (rear == 0) {  // Circular wrap-around
            rear = capacity - 1;
        } else {
            rear--;
        }

        size--;
    }

    // Display the deque
    public void display() {
        if (isEmpty()) {
            System.out.println("Deque is empty!");
            return;
        }

        System.out.print("Deque elements: ");
        int i = front;
        while (true) {
            System.out.print(arr[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % capacity;  // Circular increment
        }
        System.out.println();
    }

    // Main function
    public static void main(String[] args) {
        Deque dq = new Deque(5);

        dq.insertRear(10);
        dq.insertRear(20);
        dq.insertFront(5);
        dq.display();

        dq.deleteFront();
        dq.display();

        dq.insertRear(30);
        dq.insertRear(40);
        dq.insertRear(50); // Should show deque is full
        dq.display();

        dq.deleteRear();
        dq.display();
    }
}