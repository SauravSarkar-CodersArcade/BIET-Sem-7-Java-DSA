package dsa.algos.sorting;
import java.util.Arrays;
public class MergeSortAlgorithm {
    public static void mergeSort(int[] arr){
        if(arr.length < 2){
            return;
        }
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        mergeSort(left); // Repetitive division of the left side
        mergeSort(right);// Repetitive division of the right side
        merge(arr, left, right); // Merge the left & right parts
    }
    public static void merge(int[] arr, int[] left, int[] right){
        int i=0, j=0, k=0;
        while (i < left.length && j < right.length){
            if(left[i] < right[j]){
                arr[k++] = left[i++];
            }else{
                arr[k++] = right[j++];
            }
        }
        while (i < left.length){
            arr[k++] = left[i++];
        }
        while (j < right.length){
            arr[k++] = right[j++];
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,4,1,2,6,3,0,-3,8};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
