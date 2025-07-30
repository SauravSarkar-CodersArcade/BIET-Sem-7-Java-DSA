package dsa.algos.sorting;

import java.util.Arrays;

public class SelectionSort {
    static void selectionSort(int[] arr){
        for (int i=0; i< arr.length - 1; i++){
            int minIndex = i;
            for (int j = i+1; j< arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){ // Only swap if the minIndex value changes
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,5,2,1,4,6,0};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
