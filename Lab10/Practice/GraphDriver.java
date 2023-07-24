
public class GraphDriver { 
   
    // Driver program to test methods of graph class 
    public static void main(String[] args)  
    { 
        Graph g = new Graph(5); 
        g.addDirectedEdge(1, 0); 
        g.addDirectedEdge(2, 1); 
        g.addDirectedEdge(3, 4); 
        g.addDirectedEdge(4, 0); 
           
        System.out.println("Following is Depth First Traversal"); 
        g.DFS(); 
    } 
} 

