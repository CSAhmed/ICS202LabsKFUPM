//********** Ahmed Adel Al-Khawahir	201949310	Sec:55 **********//
public class GraphDriver {     
    // Driver program to test methods of graph class 
    public static void main(String[] args)  { 
    	
    	
    	//For all letters you can use it with maximum 27 vertices
//    	String[] letterArray = {"A", "B", "C", "D", "E", "F", "G", 
//        		"H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", 
//        		"S", "T", "U", "V", "W", "X", "Y", "Z"};
    	
    	String[] letterArray = {"A", "B", "C", "D", "E"};
    	
    	
        // Total 5 vertices in graph 
        Graph g = new Graph(5,letterArray); 
          
        g.addDirectedEdge("B", "A"); 
        g.addDirectedEdge("A", "C"); 
        g.addDirectedEdge("C", "B"); 
        g.addDirectedEdge("A", "D"); 
        g.addDirectedEdge("B", "E"); 
        
		// Style
		for (int i = 0; i < 30; i++)
			System.out.print("-");
		System.out.println();
		// -*-
              
        System.out.println("The directed graph is:  "); 
        g.displayGraph(); 

         Graph g2 = new Graph(5,letterArray);

        g2.addUndirectedEdge("B", "A"); 
        g2.addUndirectedEdge("A", "C"); 
        g2.addUndirectedEdge("C", "B"); 
        g2.addUndirectedEdge("A", "D"); 
        g2.addUndirectedEdge("B", "E"); 
        
		// Style
		for (int i = 0; i < 30; i++)
			System.out.print("-");
		System.out.println();
		// -*-

        System.out.println("The undirected graph is:  "); 
        g2.displayGraph(); 
        
		// Style
		for (int i = 0; i < 30; i++)
			System.out.print("-");
		System.out.println();
		// -*-
       
    } 
} 
