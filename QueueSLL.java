import java.util.Scanner;
class QueueSLLOperations
{
    class Node 
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    Node front, rear;
    public QueueSLLOperations() 
    {
        front = rear = null;
    }
    public void enqueue(int data)
    {
        Node newNode = new Node(data);
        if (rear == null) 
        {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }
    public int dequeue() 
    {
        if (front == null) 
        {
            System.out.println("Queue is empty");
            return -1;
        }
        int value = front.data;
        front = front.next;
        if (front == null) 
        {
            rear = null; // Queue is empty
        }
        return value;
    }
    public int peek() 
    {
        if (front == null) 
        {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }
    public void display() 
    {
        if (front == null) 
        {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        while (temp != null) 
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}
public class QueueSLL
{
    public static void main(String[] args) 
    {
        QueueSLLOperations q = new QueueSLLOperations();
        Scanner sc = new Scanner(System.in);
        int choice, value;
        do
        {
            System.out.println("\n1. Enqueue\t2. Dequeue\t3. Peek\t4. Display\t5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) 
            {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    value = sc.nextInt();
                    q.enqueue(value);
                    break;
                case 2:
                    System.out.println("Dequeued value: " + q.dequeue());
                    break;
                case 3:
                    System.out.println("Front value: " + q.peek());
                    break;
                case 4:
                    q.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 6);
        sc.close();
    }
}
