public class Graph {
      private boolean adjacencyMatrix[][];
      private int numberOfVertices;

      public Graph(int numberOfVertices) {
            this.numberOfVertices = numberOfVertices;
            adjacencyMatrix = new boolean[numberOfVertices][numberOfVertices];
      }

      public void addEdge(int i, int j) {
          // To be completed by students
    	  adjacencyMatrix[i][j] = true;
    	  adjacencyMatrix[j][i] = true;

      }

      public void removeEdge(int i, int j) {
            // To be completed by students
    	  adjacencyMatrix[i][j] = false;
    	  adjacencyMatrix[j][i] = false;
      }

      public boolean isEdge(int i, int j) {
            // to be completed by students
    	  boolean check1 = adjacencyMatrix[i][j];
    	  boolean check2 = adjacencyMatrix[j][i];
    	  
    	  if(check1 == true && check2 == true) {
    		  return true;
    	  }
    	  else {
    		  return false;
    	  }
    	  
      }
      
      public void displayGraph(){
        System.out.printf("%10s", " ");
        for(int i = 0; i < numberOfVertices; i++)
          System.out.printf("%10s", i);
          System.out.println();
        for(int i = 0; i < numberOfVertices; i++){
          System.out.printf("%10s", i);
          for(int j = 0; j < numberOfVertices; j++){
            System.out.printf("%10s", adjacencyMatrix[i][j]);
           }
           System.out.println();
       }
       
   }
 }
