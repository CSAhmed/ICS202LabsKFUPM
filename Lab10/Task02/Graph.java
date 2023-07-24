import java.util.*; 

class Graph { 
        int numVertices; 
          
        LinkedList<String>[] adjacencyList;  
        
        String[] labels;
          
        Graph(int numVertices, String[] labels) { 
        	this.labels = labels;
        	
            this.numVertices = numVertices; 
            adjacencyList = new LinkedList[numVertices]; 
              
            for (int i = 0; i < adjacencyList.length; i++) {
                adjacencyList[i] = new LinkedList<String>();
            
            }
        } 
          
        //To add a directed edge to graph 
        void addDirectedEdge(String v, String w)  { 
        	
        	int vNum=0;
        	
        	for(int i=0; i<labels.length; i++) {
        		
        		if(labels[i].equals(v)) {
        			vNum = i;
        		}

        	}
        	
            adjacencyList[vNum].add(w); // Add w to v’s list. 
        }

         //To add undirected edge to graph 
        void addUndirectedEdge(String v, String w) {   
        	
        	int vNum=0;
        	int wNum=0;
        	
        	for(int i=0; i<labels.length; i++) {
        		
        		if(labels[i].equals(v)) {
        			vNum = i;
        		}
        		
        		if(labels[i].equals(w)) {
        			wNum = i;
        		}
        	}
            adjacencyList[vNum].add(w); 
            adjacencyList[wNum].add(v);                
        } 
        
        void displayGraph(){
           for (int i = 0; i < adjacencyList.length; i++){  
               System.out.println(labels[i] + " ----> " + adjacencyList[i]);
            } 
            System.out.println(); 
        
       } 
   }

