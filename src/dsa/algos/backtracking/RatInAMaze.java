package dsa.algos.backtracking;

import java.util.Scanner;

public class RatInAMaze {
    static boolean isPathSafe(int[][] arr, int x, int y, int n){
        return (x < n && y < n && arr[x][y] == 1);
    }
    static boolean ratInMaze(int[][] arr, int x, int y, int n,
                             int[][] resultantArray){
        // Base Case -> Rat has already reached destination
        if(x == n-1 && y == n-1){
            resultantArray[x][y] = 1;
            return true;
        }
        // Check if the current cell is safe to stand or not
        if(isPathSafe(arr, x, y, n)){
            resultantArray[x][y] = 1;
            // Move forward & check if a path exists
            if(ratInMaze(arr,x+1,y,n,resultantArray)){
                return true;
            }
            // Move downward & check if a path exists
            if(ratInMaze(arr,x,y+1,n,resultantArray)){
                return true;
            }
            // We couldn't find a safe path
            resultantArray[x][y] = 0; // Backtracking
            return false;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        // Input the maze array (n x n)
        int[][] arr = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        // Input the resultant array (n x n) with all 0s
        int[][] resultantArray = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                resultantArray[i][j] = 0;
            }
        }
        if(ratInMaze(arr, 0,0, n, resultantArray)){
            // If it's true then print the path of rat in the maze
            System.out.println("The path for the Rat in the Maze: ");
            for (int i=0; i<n; i++){
                for (int j=0; j<n; j++){
                    System.out.print(resultantArray[i][j] + " ");
                }
                System.out.println();
            }
        }else {
            System.out.println("No path for the rat in the maze.");
        }


    }
}
