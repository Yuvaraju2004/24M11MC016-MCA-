import java.util.Scanner;

public class BubbleSortOptimized {
    
    // Optimized Bubble Sort function
    static void bubbleSort(int arr[], int n) {
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps occurred, the array is already sorted
            if (!swapped) 
                break;
        }
    }

    // Function to print an array
    static void printArray(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method (Driver Code)
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for array size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int arr[] = new int[n];

        // Taking user input for array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sorting the array using Bubble Sort
        bubbleSort(arr, n);

        // Printing the sorted array
        System.out.println("Sorted array: ");
        printArray(arr);

        scanner.close();
    }
}