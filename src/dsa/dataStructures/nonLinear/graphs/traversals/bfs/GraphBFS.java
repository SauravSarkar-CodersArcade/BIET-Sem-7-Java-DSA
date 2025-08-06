package dsa.dataStructures.nonLinear.graphs.traversals.bfs;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class GraphBFS {
    public List<Integer> bfsGraph(List<List<Integer>> adjList, int V){
        List<Integer> bfs = new ArrayList<>(); // To store the result
        boolean[] visited = new boolean[V+1]; // 0-based indexing
        Queue<Integer> q = new LinkedList<>();
        // Start BFS from the source node
        visited[0] = true;
        q.add(0);
        while (!q.isEmpty()){
            int node = q.poll();
            bfs.add(node);
            // Traverse all the node's neighbours
            for (int neighbour : adjList.get(node)){
                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }
        return bfs;
    }

    public static void main(String[] args) {
        int V = 5;
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i=0; i<=V; i++){
            adjList.add(new ArrayList<>()); // Initialize empty arrays
        }
        // Add the edges
        addEdge(adjList, 0,1);
        addEdge(adjList, 0,2);
        addEdge(adjList, 0,3);
        addEdge(adjList, 1,3);
        addEdge(adjList, 2,4);
        addEdge(adjList, 2,3);
        addEdge(adjList, 3,4);
        GraphBFS obj = new GraphBFS();
        List<Integer> ans = obj.bfsGraph(adjList, V);
        printBFS(ans);
    }
    public static void addEdge(List<List<Integer>> adjList, int u, int v){
        adjList.get(u).add(v);
        adjList.get(v).add(u); // For undirected graph
    }
    public static void printBFS(List<Integer> ans){
        for (int num : ans){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
