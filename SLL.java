import java.util.Scanner;

class SLLOperations {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public Node first;

    public void insertFirst(int data) {
        Node newnode = new Node(data);
        newnode.next = first;
        first = newnode;
    }

    public void insertAtPosition(int data, int position) {
        if (position == 0) {
            insertFirst(data);
            return;
        }
        Node newnode = new Node(data);
        Node temp = first;
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid position"); // Handle invalid position
            return;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public void insertLast(int data) {
        Node newnode = new Node(data);
        if (first == null) {
            first = newnode;
            return;
        }
        Node temp = first;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }//rlidgerdiggiguyrigdgldghiggg

    public void deleteFirst() {
        if (first != null) {
            first = first.next;
        } else {
            System.out.println("List is empty. Cannot delete."); // Handle empty list
        }
    }

    public void deleteLast() {
        if (first == null) {
            System.out.println("List is empty. Cannot delete."); // Handle empty list
            return;
        }
        if (first.next == null) {
            first = null;
            return;
        }
        Node temp = first;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteByValue(int key) {
        Node temp = first, prev = null;
        if (temp != null && temp.data == key) {
            first = temp.next;
            return;
        }
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Key not found."); // Handle key not found
            return;
        }
        prev.next = temp.next;
    }

    public boolean search(int key) {
        Node temp = first;
        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void display() {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

class SLL {
    public static void main(String[] args) {
        SLLOperations list = new SLLOperations();
        Scanner sc = new Scanner(System.in);
        int choice, value, position;
        do {
            System.out.println("\n1. Insert First\n2. Insert Last\n3. Insert at Position\n4. Delete First\n5. Delete Last\n6. Delete by Value\n7. Display\n8. Search\n9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert at first: ");
                    value = sc.nextInt();
                    list.insertFirst(value);
                    break;
                case 2:
                    System.out.print("Enter value to insert at last: ");
                    value = sc.nextInt();
                    list.insertLast(value);
                    break;
                case 3:
                    System.out.print("Enter value to insert: ");
                    value = sc.nextInt();
                    System.out.print("Enter position: ");
                    position = sc.nextInt();
                    list.insertAtPosition(value, position);
                    break;
                case 4:
                    list.deleteFirst();
                    break;
                case 5:
                    list.deleteLast();
                    break;
                case 6:
                    System.out.print("Enter value to delete: ");
                    value = sc.nextInt();
                    list.deleteByValue(value);
                    break;
                case 7:
                    list.display();
                    break;
                case 8:
                    System.out.print("Enter value to search: ");
                    value = sc.nextInt();
                    System.out.println("Search result: " + list.search(value));
                    break;
                case 9:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 9);
        sc.close(); // Close the scanner
    }
}