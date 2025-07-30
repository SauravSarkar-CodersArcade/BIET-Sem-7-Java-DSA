package dsa.algos.searching.binarySearchQuestions;
public class SquareRootBinarySearch {
    static int squareRoot(int n){
        int s = 0;
        int e = n;
        int ans = -1;
        while (s <= e){
            int mid = s + (e-s)/2;
            int square = mid * mid;
            if(square == mid){
                return mid; // We got the answer so we are returning the mid
            }else if(square > n){
                e = mid - 1; // We are out of range, so go to the left
            }else{
                // Store the probable answer & move to the right hand side
                ans = mid;
                s = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 36;
        System.out.println("Square root: " + squareRoot(n));
    }
}
