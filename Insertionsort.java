// Java program for implementation of Insertion Sort

class InsertionSort {
  
    // Function to sort array using insertion sort
    void sort(int a[])
    {
        int n = a.length;
        for (int i = 1; i < n; ++i) {
            int k = a[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are
            // greater than key, to one position ahead
            // of their current position
            while (j >= 0 && a[j] > k) {
                a[j + 1] = a[j];
                j = j - 1;
            }
          
            a[j + 1] = k;
        }
    }

    public static void main(String args[])
    {
        int a[] = { 12, 11, 13, 5, 6 };

        InsertionSort ob = new InsertionSort();
        ob.sort(a);

        int n = a.length;
        for (int i = 0; i < n; ++i)
            System.out.print(a[i] + " ");

    }
}