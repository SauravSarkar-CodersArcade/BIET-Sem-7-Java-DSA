package arrays;
public class JaggedArray {
    public static void main(String[] args) {
        // Array of arrays
        int[][] jagged = {{1, 2, 3, 4, 5},
                          {4, 5, 6, 7},
                          {7, 8, 9}};
        for (int i = 0; i<jagged.length; i++){ // rows or length
            for (int j = 0; j<jagged[i].length; j++){ // row[i].length
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
        for (int[] x : jagged){
            for (int y : x){
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
