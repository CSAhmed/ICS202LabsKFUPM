public class CLL<T> {
    protected CLLNode<T> current;
    public CLL() {
       current = null;
    }
    
    public boolean isEmpty() {
        return current == null;
    }
    
    public void addToEnd(T el) {
        if(isEmpty()) {
            current = new CLLNode(el);
            current.next = current;
        }
        else {
            CLLNode<T> newNode = new CLLNode(el, current);
            CLLNode<T> temp = current; //the "first" node of the Circular Linked List
            while(temp.next != current) 
               temp = temp.next; //reach the last node before current
            temp.next = newNode;
        }
    }
    
    public void addToBeginning(T el) {
         this.addToEnd(el);
         if(current.next == current) return;
         
         CLLNode<T> tmp = current;
         
         while(tmp.next != current)
            tmp = tmp.next;
         current = tmp;
    }
    
    //Exercise 2
    public T deleteFromBeginning() { 
      if(current == null) {
    	   return null;
       }
      else if(current.next == current) {
    	  return null;
      }
      else {
    	  CLLNode<T> temp,pred, save;
    	  save = current;
    	  
    	  for(pred = current, temp = current.next; !temp.info.equals(current.info); pred = pred.next, temp = temp.next); 
    		  if(temp.info == current.info) {
    			  pred.next = temp.next;
    	    	  current = temp.next;
    		  
    	  }

    	  return save.info;
    	  
      }
    }

    public void printTheList() {
        if(current == null) return;
        CLLNode<T> temp = this.current;
        do {
            System.out.print(temp.info + " ");
            temp = temp.next;  
        } 
        while(temp != current);         
        System.out.println();
    }
    
    //Exercise 1
    public int lengthOfTheList() {
       //QUIZ method
    	
    	//Check if the list is empty
       if(current == null) {
    	   return 0;
       }
       //if the list is >1
       else {
    	   CLLNode<T> tmp;
    	   int length = 1;
    	   for (tmp = this.current.next; tmp!=current; tmp = tmp.next) {
    		   length++;
    	   }
    	   
    	   return length;
       }
    }//End of lengthOfTheList method
    
}    
