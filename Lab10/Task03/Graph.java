import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.ArrayDeque;
// Determines if a vertex is reachable from another vertex in a directed graph
public class Graph {
    private List<List<Integer>> adjList = null;
    private int numVertices;
 
    public Graph(List<Edge> edges, int numVertices) {
        this.numVertices = numVertices;
        adjList = new ArrayList<>();
 
        for (int i = 0; i < numVertices; i++) {
            adjList.add(new ArrayList<>());
        }
 
        // add edges to the directed graph
        for (Edge edge: edges){
            int src = edge.source;
            int dest = edge.dest;
 
            adjList.get(src).add(dest);
        }
    }
  
    public boolean isReachable(int src, int dest){
      boolean[] visited = new boolean[numVertices];
      return isReachable(src, dest, visited);
    }
    
    // Function to perform BFS traversal from the source vertex in the graph to
    // determine if the destination vertex is reachable from the source or not
    private boolean isReachable(int src, int dest, boolean[] visited)
    {
       //Make an queue for BFS
    	Queue<Integer> q = new LinkedList<>();
       
       visited[src] = true;
       q.add(src);
       
       while(!q.isEmpty()) {
  
           src = q.poll();

           Iterator<Integer> iterator = adjList.get(src).listIterator();
           while (iterator.hasNext())
           {
               int n = iterator.next();
               if (visited[n] == false)
               {
                   visited[n] = true;
                   q.add(n);
                   
               }
           }
       }
       
       return visited[dest];
        
 
      
    }
}