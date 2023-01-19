package Graphs.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

//Creating a class Edge - has src and destination and a constuctor to set src and dest
class Edge{
    int source , dest;
    public Edge(int source,int dest){
        this.source = source;
        this.dest = dest;
    }
}
//Class to represent graph
class Graph{
    //2D List
    List<List<Integer>> adjlist = null;

    Graph(List<Edge> edges ,int n){
        //2D ArrayList is created
        adjlist = new ArrayList<>();
        for(int i=0;i<n;i++){
            adjlist.add(new ArrayList<>());
        }

        //Graph get a list of edges and no.of nodes
        //iterate over the List of edges and get src and des
        //add des to adjList by getting src.
        for(Edge edge : edges){
            int src = edge.source;
            int des = edge.dest;

            adjlist.get(src).add(des);
            adjlist.get(des).add(des);
        }

    }
}
public class DFS {
    // Function to perform DFS traversal on the graph on a graph
    public static void DFS(Graph graph, int v, boolean[] discovered) {
        // mark the current node as discovered
        discovered[v] = true;

        // print the current node
        System.out.print(v + " ");

        // do for every edge (v, u)
        for (int u : graph.adjlist.get(v)) {
            // if `u` is not yet discovered
            if (!discovered[u]) {
                DFS(graph, u, discovered);
            }
        }
    }

    // Perform iterative DFS on graph starting from vertex `v`
    public static void iterativeDFS(Graph graph, int v, boolean[] discovered) {
        // create a stack used to do iterative DFS
        Stack<Integer> stack = new Stack<>();

        // push the source node into the stack
        stack.push(v);

        // loop till stack is empty
        while (!stack.empty()) {
            // Pop a vertex from the stack
            v = stack.pop();

            // if the vertex is already discovered yet, ignore it
            if (discovered[v]) {
                continue;
            }

            // we will reach here if the popped vertex `v` is not discovered yet;
            // print `v` and process its undiscovered adjacent nodes into the stack
            discovered[v] = true;
            System.out.print(v + " ");

            // do for every edge (v, u)
            List<Integer> adjList = graph.adjlist.get(v);
            for (int i = adjList.size() - 1; i >= 0; i--) {
                int u = adjList.get(i);
                if (!discovered[u]) {
                    stack.push(u);
                }
            }
        }
    }

    public static void main(String[] args) {
        List<Edge> edges = Arrays.asList(
                new Edge(1, 2), new Edge(1, 7), new Edge(1, 8), new Edge(2, 3),
                new Edge(2, 6), new Edge(3, 4), new Edge(3, 5), new Edge(8, 9),
                new Edge(8, 12), new Edge(9, 10), new Edge(9, 11)
        );

        // total number of nodes in the graph (labelled from 0 to 12)
        int n = 13;

        // build a graph from the given edges
        Graph graph = new Graph(edges, n);

        // to keep track of whether a vertex is discovered or not
        boolean[] discovered = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!discovered[i]) {
                DFS(graph, i, discovered);
            }
        }
        // Do iterative DFS traversal from all undiscovered nodes to
        // cover all connected components of a graph
//        for (int i = 0; i < n; i++) {
//            if (!discovered[i]) {
//                iterativeDFS(graph, i, discovered);
//            }
//        }
    }
}


