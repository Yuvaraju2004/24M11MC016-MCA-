import java.util.Scanner;
class StackSLLOperations
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
    public Node top; 
    public StackSLLOperations() 
    {
        top = null;
    }
    public void push(int data)
    {
        Node newnode = new Node(data);
        newnode.next = top;
        top = newnode;
        System.out.println(data + " pushed onto stack.");
    }
    public int pop() 
    {
        if (isEmpty()) 
       {
            System.out.println("Stack underflow! No elements to pop.");
            return -1;
        }
        int poppedValue = top.data;
        top = top.next;
        return poppedValue;
    }
    public int peek()
    {
        if (isEmpty()) 
        {
            System.out.println("Stack is empty.");
            return -1;
        }
        return top.data;
    }
    public void display() 
    {
        if (isEmpty()) 
         {
            System.out.println("Stack is empty.");
            return;
        }
        Node temp = top;
        System.out.print("Stack: ");
        while (temp != null) 
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public boolean isEmpty() 
    {
        return top == null;
    }
}
class StackSLL
{
    public static void main(String[] args) 
    {
        StackSLLOperations s = new StackSLLOperations();
        Scanner sc = new Scanner(System.in);
        int choice, value;
        do 
        {
            System.out.println("\n1. Push\t 2. Pop\t 3. Peek\t4. Display\t5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) 
            {
                case 1:
                    System.out.print("Enter value to push: ");
                    value = sc.nextInt();
                    s.push(value);
                    break;
                case 2:
                    System.out.println("Popped: " + s.pop());
                    break;
                case 3:
                    System.out.println("Top element: " + s.peek());
                    break;
                case 4:
                    s.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);
        sc.close();
    }
}
