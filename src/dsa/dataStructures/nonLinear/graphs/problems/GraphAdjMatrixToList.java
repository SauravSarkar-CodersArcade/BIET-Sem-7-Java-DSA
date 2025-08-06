package dsa.dataStructures.nonLinear.graphs.problems;
import java.util.ArrayList;
import java.util.List;
public class GraphAdjMatrixToList {
    static List<List<Integer>> convertMatrixToList(int[][] adjMatrix, int V){
        List<List<Integer>> adjList = new ArrayList<>();
        // Initialise the list with empty arrays
        for (int i=0; i<V; i++){
            adjList.add(new ArrayList<>());
        }
        // Convert the matrix into a list
        // if there exists a cell adjMatrix[u][v] == 1 {u = i & j = v}
        for (int i=0; i<V; i++){
            for (int j=0; j<V; j++){
                if(adjMatrix[i][j] == 1){
                    adjList.get(i).add(j);
                }
            }
        }
        return adjList;
    }
    public static void printAdjList(List<List<Integer>> adjList){
        for (int i=0; i<adjList.size(); i++){
            System.out.print("Node: " + i + " : List of neighbours: ");
            for (int j=0; j<adjList.get(i).size(); j++){
                System.out.print(adjList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int V = 5;
        int[][] adjMatrix = {
                {0,1,1,0,0},
                {1,0,1,1,0},
                {1,1,0,0,1},
                {0,1,0,0,1},
                {0,0,1,1,0}
        };
        List<List<Integer>> adjList = convertMatrixToList(adjMatrix, V);
        System.out.println("Adjacency List Representation: ");
        printAdjList(adjList);

    }
}
