package dsa.dataStructures.nonLinear.graphs.representation;
import java.util.Scanner;
public class GraphMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // n -> number of nodes
        // m -> number of edges
        // We cover all the nodes, so Time Complexity is O(n)
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] adjMatrix = new int[n+1][n+1]; // for 0-based indexing
        // Now take the edges as input
        for (int i=0; i<m; i++){
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            // For undirected graph u <--> v
            adjMatrix[u][v] = 1;
            adjMatrix[v][u] = 1; // Skip this for a directed graph
        }
        // Print the matrix ->
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
