//********** Ahmed Adel Al-Khawahir	201949310	Sec:55 **********//
public class GraphDriver {
	public static void main(String[] args) {
		// Create an undirected graph with 4 vertices
		// To be completed by students
		Graph undGraph = new Graph(4);

		// Add the 5 edges of the graph
		// To be completed by students
		undGraph.addEdge(0, 1);
		undGraph.addEdge(0, 2);
		undGraph.addEdge(0, 3);
		undGraph.addEdge(3, 1);
		undGraph.addEdge(3, 2);

		// Style
		for (int i = 0; i < 60; i++)
			System.out.print("-");
		System.out.println();
		// -*-

		// Display the graph before deleting edge 2---3
		System.out.println("Before deleting edge 2---3 the graph is: \n");
		// To be completed by students
		undGraph.displayGraph();
		
		// Style
		for (int i = 0; i < 60; i++)
			System.out.print("v");
		System.out.println();
		// -*-

		System.out.println("			(2)-----(0)");
		System.out.println("			 |      /|");
		System.out.println("			 |     / |");
		System.out.println("			 |    /  |");
		System.out.println("			 |   /   |");
		System.out.println("			 |  /    |");
		System.out.println(" 			 | /     |");
		System.out.println("			(3)-----(1)");

		// Style
		for (int i = 0; i < 60; i++)
			System.out.print("-");
		System.out.println();
		// -*-

		// Display the graph after deleting edge 2---3
		// To be completed by students
		undGraph.removeEdge(2, 3);
		
		// Style
		for (int i = 0; i < 60; i++)
			System.out.print("-");
		System.out.println();
		// -*-

		System.out.println("After deleting edge 2---3 the graph is: \n");
		// To be completed by students
		undGraph.displayGraph();
		
		// Style
		for (int i = 0; i < 60; i++)
			System.out.print("v");
		System.out.println();
		// -*-
		
		System.out.println("			(2)-----(0)");
		System.out.println("			        /|");
		System.out.println("			       / |");
		System.out.println("			      /  |");
		System.out.println("			     /   |");
		System.out.println("			    /    |");
		System.out.println(" 			   /     |");
		System.out.println("			(3)-----(1)");
		
		// Style
		for (int i = 0; i < 60; i++)
			System.out.print("-");
		System.out.println();
		// -*-
		// Style
		for (int i = 0; i < 60; i++)
			System.out.print("-");
		System.out.println();
		// -*-

		System.out.println("For checking that edge '2---3' deleted:");
		System.out.println("'2---3' is edge? " + undGraph.isEdge(2, 3));
		System.out.println("'0---3' is edge? " + undGraph.isEdge(0, 3));

	}
}