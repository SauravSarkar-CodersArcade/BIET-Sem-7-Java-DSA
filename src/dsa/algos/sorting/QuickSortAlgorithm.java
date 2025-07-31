package dsa.algos.sorting;
import java.util.Arrays;
public class QuickSortAlgorithm {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partitionIndex(int[] arr, int s, int e){
        int pivot = arr[s];
        int count = 0;
        for (int i=s+1; i<=e; i++){
            if(arr[i] < pivot){
                count++;
            }
        }
        // Place the pivot at it's correct position
        int pivotIndex = s + count;
        swap(arr, s, pivotIndex);
        // Let's manage the left & right side of the pivot index
        int i = s;
        int j = e;
        while (i < pivotIndex && j > pivotIndex){
            while (arr[i] < pivot){
                i++;
            }
            while (arr[j] > pivot){
                j--;
            }
            if(i < pivotIndex && j > pivotIndex){
                swap(arr, i++, j--);
            }
        }
        return pivotIndex;
    }
    public static void quickSort(int[] arr, int s, int e){
        // Base case
        if(s >= e){
            return;
        }
        // Find the pivot for partition
        int p = partitionIndex(arr, s, e);
        // We will use recursion for the left & right parts
        quickSort(arr, s, p-1);
        quickSort(arr, p+1, e);
    }
    public static void main(String[] args) {
        int[] arr = {10,2,3,4,1,5,6,8,0};
        quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
