import java.util.Arrays;  
import java.util.Comparator;  
public class ArrayMethodsExample
{  
    public static void main(String[] args) 
    {  
           // Method 1: asList()  
        Integer[] array = {1, 4, 7, 10, 13};  
        System.out.println("Original Array: " + Arrays.asList(array));           // Method 2: binarySearch()  
        int keyToSearch = 7;  
        int index = Arrays.binarySearch(array, keyToSearch);  
        System.out.println("Index of " + keyToSearch + ": " + index);  
           // Method 3: compare(array1, array2)  
        Integer[] array1 = {1, 2, 3};  
        Integer[] array2 = {1, 2, 3};  
        int comparisonResult = Arrays.compare(array1, array2);  
        System.out.println("Comparison result between array1 and array2: " + comparisonResult);  
        int[] originalArray = {3, 8, 4, 1, 5};  
          // Method 4: copyOf(originalArray, newLength)  
        int newLength = 7;  
        int[] copyArray = Arrays.copyOf(originalArray, newLength);  
        System.out.println("Copy of originalArray with new length: " + Arrays.toString(copyArray));  
          // Method 5: copyOfRange(originalArray, fromIndex, endIndex)  
        int fromIndex = 2;  
        int toIndex = 4;  
        int[] copyRangeArray = Arrays.copyOfRange(originalArray, fromIndex, toIndex);  
        System.out.println("Copy of originalArray from index " + fromIndex + " to " + toIndex + ": " + Arrays.toString(copyRangeArray));
          // Method 6: sort(originalArray)  
	Arrays.sort(originalArray);  
        System.out.println("Sorted array using sort(): " + Arrays.toString(originalArray));  
         // Method 7: sort(originalArray, fromIndex, endIndex) 
        Arrays.sort(originalArray, fromIndex, toIndex);  
        System.out.println("Partially sorted array from index " + fromIndex + " to " + toIndex + ": " + Arrays.toString(originalArray));  
    }  
}

