public class BubbleSortWithSteps {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2};
        int n = arr.length;

        System.out.println("Original Array:");
        printArray(arr);
        System.out.println();

        for (int i = 0; i < n - 1; i++) { // Outer loop for passes
            System.out.println("Pass " + (i + 1) + ":");

            for (int j = 0; j < n - i - 1; j++) { // Inner loop for swapping
                if (arr[j] > arr[j + 1]) { // Swap if the element is greater than the next one
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

                // Print array after each iteration of the inner loop
                printArray(arr);
            }
            System.out.println();
        }

        System.out.println("Sorted Array:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
