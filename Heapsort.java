class HeapSort {
    public void heapSort(int arr[]) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
        for (int i = n - 1; i > 0; i--) {
            swap(arr, 0, i);  // Move max to the end
            heapify(arr, i, 0);  // Heapify the reduced heap
        }
    }
    void heapify(int arr[], int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && arr[left] > arr[largest])
            largest = left;
        if (right < n && arr[right] > arr[largest])
            largest = right;
        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, n, largest);
        }
    }
    void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    void printArray(int arr[]) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        HeapSort hs = new HeapSort();
        System.out.println("Original array:");
        hs.printArray(arr);
        hs.heapSort(arr);
        System.out.println("Sorted array:");
        hs.printArray(arr);
    }
}

