package dsa.algos.searching.binarySearchQuestions;
public class FirstLastTotalOccurrences {
    static int firstOccurrence(int[] arr, int key){
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == key){
                // Store the index & move to left for first occ
                ans = mid;
                e = mid - 1;
            }else if(arr[mid] < key){
                s = mid + 1;
            }else {
                e = mid - 1;
            }
        }
        return ans;
    }
    static int lastOccurrence(int[] arr, int key){
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == key){
                // Store the index & move to right for last occ
                ans = mid;
                s = mid + 1;
            }else if(arr[mid] < key){
                s = mid + 1;
            }else {
                e = mid - 1;
            }
        }
        return ans;
    }
    static int totalOccurrence(int[] arr, int key){
        int fo = firstOccurrence(arr,key);
        int lo = lastOccurrence(arr,key);
        return lo - fo + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,3,4,5,6};
        System.out.println("First: " + firstOccurrence(arr,3));
        System.out.println("Last: " + lastOccurrence(arr,3));
        System.out.println("Total: " + totalOccurrence(arr,3));
    }
}
