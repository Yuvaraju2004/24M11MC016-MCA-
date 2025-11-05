import java.util.Scanner;

class DLLOperations {
    class Node {
        int data;
        Node prev, next;
        

        Node(int d) {
            data = d;
            prev = next = null;
        }
    }

    Node first, last;

    void insertFirst(int data) {
        Node newnode = new Node(data);
        if (first == null) {
            first = last = newnode;
            return;
        } else {
            newnode.next = first;
            first.prev = newnode;
            first = newnode;
        }
    }

    void insertAtPosition(int data, int position) {
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
            System.out.println("Invalid position");
            return;
        }
        newnode.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = newnode;
        }
        temp.next = newnode;
        newnode.prev = temp;
        if (newnode.next == null) {
            last = newnode;
        }
    }

    void insertLast(int data) {
        Node newnode = new Node(data);
        if (first == null) {
            first = last = newnode;
            return;
        }
        last.next = newnode;
        newnode.prev = last;
        last = newnode;
    }

    void deleteFirst() {
        if (first == null) {
            System.out.println("List is empty! No node to delete.");
            return;
        }
        first = first.next;
        if (first != null) {
            first.prev = null;
        } else {
            last = null;
        }
        System.out.println("First node deleted.");
    }

    void deleteLast() {
        if (last == null) { // Corrected condition: Check if last is null
            System.out.println("List is empty! No node to delete.");
            return;
        }
        last = last.prev;
        if (last != null) {
            last.next = null;
        } else {
            first = null;
        }
        System.out.println("Last node deleted.");
    }

    void deleteByValue(int key) {
        Node temp = first;
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Key not found"); // Informative message
            return;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        } else {
            first = temp.next;
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        } else {
            last = temp.prev;
        }
        System.out.println("Node with value " + key + " deleted."); // Informative message
    }

    boolean search(int key) {
        Node temp = first;
        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    void displayForward() {
        Node temp = first;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + (temp.next != null ? " <-> " : "")); // Conditional for last element
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    void displayBackward() {
        Node temp = last;
        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + (temp.prev != null ? " <-> " : "")); // Conditional for last element
            temp = temp.prev;
        }
        System.out.println("NULL");
    }
}

class DLL {
    public static void main(String[] args) {
        DLLOperations list = new DLLOperations();
        Scanner scanner = new Scanner(System.in);
        int choice, value, position;

        do {
            System.out.println("\n1. Insert First\n2. Insert Last\n3. Insert at Position\n4. Delete First\n5. Delete Last\n6. Delete by Value\n7. Display Forward\n8. Display Backward\n9. Search\n10. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert at first: ");
                    value = scanner.nextInt();
                    list.insertFirst(value);
                    break;
                case 2:
                    System.out.print("Enter value to insert at last: ");
                    value = scanner.nextInt();
                    list.insertLast(value);
                    break;
                case 3:
                    System.out.print("Enter value to insert: ");
                    value = scanner.nextInt();
                    System.out.print("Enter position: ");
                    position = scanner.nextInt();
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
                    value = scanner.nextInt();
                    list.deleteByValue(value);
                    break;
                case 7:
                    list.displayForward();
                    break;
                case 8:
                    list.displayBackward();
                    break;
                case 9:
                    System.out.print("Enter value to search: ");
                    value = scanner.nextInt();
                    System.out.println("Search result: " + list.search(value));
                    break;
                case 10:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 10);

        scanner.close();
    }
}