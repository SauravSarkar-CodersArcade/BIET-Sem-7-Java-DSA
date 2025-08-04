package dsa.algos.sorting;
import java.util.Arrays;
public class WaveSort {
    public static void waveSort(int[] arr){
        // Sort The Array
        Arrays.sort(arr); // n log n
        for (int i=0; i< arr.length-1; i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,90,49,2,1,5,23};
        System.out.println("Before: " + Arrays.toString(arr));
        waveSort(arr);
        System.out.println("After: " + Arrays.toString(arr));

    }
}
