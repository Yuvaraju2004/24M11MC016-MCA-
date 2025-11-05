class Queue {   
    private int front, rear, capacity;   
    private int[] queue;   
    
    // Constructor to initialize the queue
    Queue(int size) {   
        front = rear = 0;   
        capacity = size;   
        queue = new int[capacity];   
    }   
    
    // Insert an element into the queue  
    void enqueue(int item) {   
        // Check if the queue is full  
        if (rear == capacity) {   
            System.out.println("\nQueue is full");   
            return;   
        }   
    
        // Insert element at the rear   
        queue[rear++] = item;   
    }   
    
    // Remove an element from the queue  
    void dequeue() {   
        // Check if queue is empty   
        if (front == rear) {   
            System.out.println("\nQueue is empty");   
            return;   
        }   
    
        // Shift elements to the left
        for (int i = 0; i < rear - 1; i++) {   
            queue[i] = queue[i + 1];   
        }   
    
        // Decrement rear   
        rear--;   
    }   
    
    // Print queue elements   
    void display() {   
        if (front == rear) {   
            System.out.println("Queue is empty");   
            return;   
        }   
    
        System.out.print("Queue elements: ");   
        for (int i = front; i < rear; i++) {   
            System.out.print(queue[i] + " ");   
        }   
        System.out.println();   
    }   
    
    // Print front of queue   
    void front() {   
        if (front == rear) {   
            System.out.println("Queue is empty");   
            return;   
        }   
        System.out.println("Front Element of the queue: " + queue[front]);   
    }   
}   

public class QueueArrayImplementation {  
    public static void main(String[] args) {   
        // Create a queue of capacity 4   
        Queue q = new Queue(4);   
    
        System.out.println("Initial Queue:");  
        q.display();   
    
        // Insert elements into the queue   
        q.enqueue(1);   
        q.enqueue(2);   
        q.enqueue(3);   
        q.enqueue(4);   
    
        System.out.println("Queue after Enqueue operations:");  
        q.display();   
    
        // Print front of the queue   
        q.front();   
    
        // Try to insert into a full queue   
        q.enqueue(90);   
    
        // Perform dequeue operations   
        q.dequeue();   
        q.dequeue();   
    
        System.out.println("\nQueue after two Dequeue operations:");  
        q.display();   
    
        // Print front of the queue   
        q.front();   
    }   
}