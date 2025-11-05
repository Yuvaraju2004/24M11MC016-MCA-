import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for array size
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        int[] A = new int[size];

        // Taking input for sorted array
        System.out.println("Enter " + size + " sorted elements:");
        for (int i = 0; i < size; i++) {
            A[i] = scanner.nextInt();
        }

        // Taking input for the key to search
        System.out.print("Enter the element to search: ");
        int key = scanner.nextInt();

        // Performing binary search
        int pos = binarySearch(A, key);

        // Printing result
        if (pos != -1) {
            System.out.println("Element found at index: " + pos);
        } else {
            System.out.println("Searching element is not found in the given array.");
        }

        scanner.close();
    }

    // Binary search function
    public static int binarySearch(int[] A, int key) {
        int low = 0, high = A.length - 1;
        int pos = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (A[mid] == key) {
                pos = mid;
                return pos; // Element found
            } else if (key < A[mid]) {
                high = mid - 1; // Search in the left half
            } else {
                low = mid + 1; // Search in the right half
            }
        }
        return pos; // Element not found
    }
}