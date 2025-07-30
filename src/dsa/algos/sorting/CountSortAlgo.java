package dsa.algos.sorting;

import java.util.Arrays;

public class CountSortAlgo {
    static void countSort(int[] arr){
        // Step: 1 Find the max
        int k = arr[0];
        for (int i=1; i<arr.length; i++){
            if(arr[i] > k){
                k = arr[i];
            }
        }
        // Step: 2 Create a count array of k+1 elements
        int[] count = new int[k+1];
        // Step: 3 Calculate the frequency of each element in the array
        for (int i=0; i< arr.length; i++){
            count[arr[i]]++;
        }
        // Calculate the cumulative frequency (curr = curr + prev)  (L -> R)
        // Skipping the 0th index as there is no previous for 0th index
        for(int i=1; i<=k; i++){
            count[i] += count[i-1];
        }
        int[] output = new int[arr.length];
        // Start from the end of the array (R -> L)
        for (int i = arr.length-1; i >= 0; i--){
            output[--count[arr[i]]] = arr[i];
        }
        // Copy the output array back to the input array
        System.arraycopy(output,0,arr,0, arr.length);
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,3,4,1,6,4,3};
        System.out.println("Before Sorting: ");
        System.out.println(Arrays.toString(arr));
        countSort(arr);
        System.out.println("After Sorting: ");
        System.out.println(Arrays.toString(arr));
    }
}
