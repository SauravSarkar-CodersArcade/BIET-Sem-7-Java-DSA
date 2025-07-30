package dsa.algos.searching.binarySearchQuestions;
public class MissingElement {
    static int missingElement(int[] arr){
        int s = 0;
        int e = arr.length - 1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] != mid + 1){
                // Go to th left had side
                // Also keep checking the two cases
                // Case 1: index becomes 0 -> return mid + 1
                // case 2: mid-1 == mid -> return mid + 1
                if(arr[mid-1] == mid || mid == 0){
                    return mid + 1;
                }
                e = mid - 1;
            }else if(arr[mid] == mid + 1){
                // Go to the right hand side
                s = mid + 1;
            }
        }
        return arr.length + 1; // No element is missing,
        // it's the next element in the series
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,6,7};
        int[] arr2 = {1,2,3,4,5,6};
        System.out.println(missingElement(arr1));
        System.out.println(missingElement(arr2));
    }
}
