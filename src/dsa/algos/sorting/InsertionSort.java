package dsa.algos.sorting;
import java.util.Arrays;
public class InsertionSort {
    static void insertionSort(int[] arr){ // O(n^2)
        for (int i=1; i<arr.length; i++){ // O(n)
            int temp = arr[i]; // Store the current element in a temp variable
            int j = i - 1;
            while (j >= 0 && arr[j] > temp){ // O(n)
                // Shifting Operation
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp; // Fill the empty space with the temp value
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,2,4,1,6,7,5};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
