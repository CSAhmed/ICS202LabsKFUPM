 
import java.util.*; 
  
public class Graph { 
        int numVertices; 
          
        LinkedList<Integer>[] adjacencyLists; 
          
        Graph(int numVertices) 
        { 
            this.numVertices = numVertices; 
            adjacencyLists = new LinkedList[numVertices]; 
              
            for (int i = 0; i < adjacencyLists.length; i++) 
                adjacencyLists[i] = new LinkedList<Integer>(); 
              
        } 
          
        void addDirectedEdge(int v, int w) { 
            adjacencyLists[v].add(w); // Add w to v’s list. 
        }
        
         void addUndirectedEdge(int v, int w) { 
            adjacencyLists[v].add(w); // Add w to v’s list. 
            adjacencyLists[w].add(v); // Add v to w’s list. 
        } 
          
        // prints all not yet visited vertices reachable from s 
        void DFSUtil(int s, Vector<Boolean> visited) { 
            // Create a stack for DFS 
            Stack<Integer> stack = new Stack<>(); 
               
            // Push the current source node 
            stack.push(s); 
               
            while(! stack.empty()){ 
                // Pop a vertex from stack and print it 
                s = stack.peek(); 
                stack.pop(); 
                   
                /* The Stack may contain same vertex twice. So we need to print the popped item only 
                   if it is not visited.
                */ 
                if(! visited.get(s)) { 
                    System.out.print(s + " "); 
                    visited.set(s, true); 
                } 
                   
                /* Get all adjacencyListsacent vertices of the popped vertex s 
                   If a adjacencyListsacent has not been visited, then push it to the stack.
                */ 
                Iterator<Integer> itr = adjacencyLists[s].iterator(); 
                   
                while (itr.hasNext()){ 
                    int v = itr.next(); 
                    if(!visited.get(v)) 
                        stack.push(v); 
                }      
            } 
        } 
          
        // prints all vertices in DFS manner 
        void DFS() { 
            Vector<Boolean> visited = new Vector<Boolean>(numVertices); 
            // Mark all the vertices as not visited 
            for (int i = 0; i < numVertices; i++) 
                visited.add(false); 
      
            for (int i = 0; i < numVertices; i++) 
                if (!visited.get(i)) 
                    DFSUtil(i, visited); 
        }     
} 