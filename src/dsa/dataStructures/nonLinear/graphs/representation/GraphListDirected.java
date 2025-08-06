package dsa.dataStructures.nonLinear.graphs.representation;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GraphListDirected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n -> number of nodes
        // m -> number of edges
        int n = sc.nextInt();
        int m = sc.nextInt();
        // We cover all the nodes, so Time Complexity is O(n)
        // Adjacency List Representation
        List<List<Integer>> adjList = new ArrayList<>();
        // Initialize the list with empty arrays
        // {1 : {}, 2 : {}, and so on}
        for (int i=0; i<=n; i++){
            adjList.add(new ArrayList<>());
        }
        // Read the edges as input from the user
        for(int i=0; i<m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            // Directed Graph u <---> v
            adjList.get(u).add(v);
            // adjList.get(v).add(u); // Skip this line for directed graph
        }
        // Print the list:
        for (int i=1; i<=n; i++){
            System.out.print("Node " + i + " : List of Neighbours: ");
            for (int V : adjList.get(i)){
                System.out.print(V + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
