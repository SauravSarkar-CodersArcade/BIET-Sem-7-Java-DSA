package arrays;
import java.util.Arrays;
public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {1,3,5,7,9};
        int[] b = {2,4,6};
        int[] merged = mergedSortedArrays(a,b);
        System.out.println("Merged Array: " +
                Arrays.toString(merged));
    }
    public static int[] mergedSortedArrays(int[] a, int[] b){
        int n1 = a.length;
        int n2 = b.length;
        int i=0, j=0, k=0;
        int[] mergedArray = new int[n1+n2];
        while (i < n1 && j < n2){
            if(a[i] < b[j]){
                mergedArray[k++] = a[i++];
            }else {
                mergedArray[k++] = b[j++];
            }
        }
        // If there are any remaining elements in either array,
        // just copy & paste them into the final array
        while (i < n1){
            mergedArray[k++] = a[i++];
        }
        while (j < n2){
            mergedArray[k++] = b[j++];
        }
        return mergedArray;
    }
}
