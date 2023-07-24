//********** Ahmed Adel Al-Khawahir	201949310	Sec:55 **********//
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class GraphDriver{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Edge> edges = Arrays.asList(Edge.getEdge(0, 3),  Edge.getEdge(1, 0),
                                             Edge.getEdge(1, 2),  Edge.getEdge(1, 4),
                                             Edge.getEdge(2, 7),  Edge.getEdge(3, 4),
                                             Edge.getEdge(3, 5), Edge.getEdge(4, 3),
                                             Edge.getEdge(4, 6), Edge.getEdge(5, 6),
                                             Edge.getEdge(6, 7));
 
        // Number of nodes in the graph (labelled from 0 to N-1)
        int numVertices = 8;
        // To be completed by students
        Graph g = new Graph(edges,numVertices);
        
        int src = -1;
        int des = -1;
        
        while(!(src >= 0 && src <= 7)) {
        	System.out.print("Enter the source vertex [0 - 7]: ");
            src = scanner.nextInt();
            
            if(src < 0 || src > 7) {
            	System.out.println("Wrong input !! >> it must be between 0 and 7");
            	System.out.println("--------------------------------------------");
            }
            
        }
        
        System.out.println("(Next) -------------------------------------");
        
        while(!(des >= 0 && des <= 7)) {
        	
        	System.out.print("Enter the destination vertex [0 - 7]: ");
        	des = scanner.nextInt();
            
        	if(des < 0 || des > 7) {
            	System.out.println("Wrong input !! >> it must be between 0 and 7");
            	System.out.println("--------------------------------------------");
            }
        }
        
        scanner.close();
        
        System.out.println("--------------------------------------------");
        System.out.println("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
        
        boolean reach = g.isReachable(src, des);
        
        if(reach == true) {
        	System.out.println("Path exists from vertex "+src+" to vertex "+des);
        }
        else {
        	System.out.println("No path exists between vertices "+src+" and "+des);
        }
    }
}