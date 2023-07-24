//****************************  DLL.java  *******************************
//                  generic doubly linked list class

public class DLL<T> {
	private DLLNode<T> head, tail;

	public DLL() {
		head = tail = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void setToNull() {
		head = tail = null;
	}

	public T firstEl() {
		if (head != null)
			return head.info;
		else
			return null;
	}

	public void addToHead(T el) {
		if (head != null) {
			head = new DLLNode<T>(el, head, null);
			head.next.prev = head;
		} else
			head = tail = new DLLNode<T>(el);
	}

	public void addToTail(T el) {
		if (tail != null) {
			tail = new DLLNode<T>(el, null, tail);
			tail.prev.next = tail;
		} else
			head = tail = new DLLNode<T>(el);
	}

	public T deleteFromHead() {
		if (isEmpty())
			return null;
		T el = head.info;
		if (head == tail) // if only one node on the list;
			head = tail = null;
		else { // if more than one node in the list;
			head = head.next;
			head.prev = null;
		}
		return el;
	}

	public T deleteFromTail() {
		if (isEmpty())
			return null;
		T el = tail.info;
		if (head == tail) // if only one node on the list;
			head = tail = null;
		else { // if more than one node in the list;
			tail = tail.prev;
			tail.next = null;
		}
		return el;
	}

	public void printAll() {
		for (DLLNode<T> tmp = head; tmp != null; tmp = tmp.next)
			System.out.print(tmp.info + " ");
		System.out.println();
	}

	public T find(T el) {
		DLLNode<T> tmp;
		for (tmp = head; tmp != null && !tmp.info.equals(el); tmp = tmp.next)
			;
		if (tmp == null)
			return null;
		else
			return tmp.info;
	}
	
	// *** Additional Exercise *** That check what is the size of the DLL
	public int size() {
		if(head == null) {
			return 0;
		}
		int size = 1;
		DLLNode<T> CurrentNode = head;
		while (CurrentNode.next != null) {
			CurrentNode = CurrentNode.next;
			size++;
		}
		return size;
	}
	// End of size method (AE)

	// *** Exercise 1 ***
	public void printReverse() {
		for (DLLNode<T> tmp = tail; tmp != null; tmp = tmp.prev)
			System.out.print(tmp.info + " ");
		System.out.println();
	}// End of printReverse method (Ex1)

	// *** Exercise 2 ***
	public void delete7() {
		
		if (head == tail) {
			head = tail = null;
		} 
		else if (isEmpty()) {
			System.out.println("There is no element in the Linked List.");
		}
		else {
			DLLNode<T> tmp = head;
			DLLNode<T> dir = tmp;
			int i = 0;
			Boolean direction = null;
			// For-loop working for 7 times
			for (i = 0; i < 6; i++, tmp = dir) {

				// Check if the tmp is the head
				if (tmp == head) {
					dir = tmp.next;
					direction = true;
				}
				// Check if the tmp is the tail
				else if (tmp == tail) {
					dir = tmp.prev;
					direction = false;
				}
				// if the tmp direction with .next ( positive x )
				if (direction == true) {
					dir = tmp.next;
				}
				// if the tmp direction with .prev ( negative x )
				if (direction == false) {
					dir = tmp.prev;
				}
			} // end of for-loop and tmp = the value that we want to delete

			// Check if the value that we want to delete is the head
			if (tmp == head) {
				tmp.next.prev = null;
				head = tmp.next;
			}
			// Check if the value that we want to delete is the tail
			else if (tmp == tail) {
				tmp.prev.next = tmp.next;
				tail = tmp.prev;
			}
			// if the value is not the head and not the tail
			else {
				tmp.prev.next = tmp.next;
				tmp.next.prev = tmp.prev;
			}

		}

	}// End of delete7 method (Ex2)

	// *** Exercise 3 ***
    public void insertAlternate(DLL<T> newList) {
    	
    	//Check if the sizes of the two DLL are different or not
    	if(size() != newList.size()) {
    		//Print that the DLLs have different sizes
    		System.out.println("The two lists are different in size, you can not Alternate!");
    		System.out.print("List 1: ");printAll();
    		System.out.print("List 2: ");newList.printAll();
    		
    		//Check which DLL is bigger and smaller
    		if(size() > newList.size())
    			System.out.println("***('List 1' is bigger than 'List 2')***");
    		else if(size() < newList.size())
    			System.out.println("***('List 1' is smaller than 'List 2')***");
    	}
    	//Same Size 
    	else {
    		//Initialize the variable tmp and newTmp from DLLNode class
    		DLLNode<T> tmp;
    		DLLNode<T> newTmp;
    		
    		//For loop will stop if the two lists are in the tail.next, which is (null) 
    		for (tmp = head, newTmp = newList.head; tmp != null && newTmp != null; tmp = tmp.next.next, newTmp = newTmp.next) {	
    			//insert the newTmp in tmp.next and keep doing it until (tmp.next = null && newTmp = null)
    			tmp.next = new DLLNode<T>(newTmp.info,tmp.next, tmp.prev);
    		}
    	}
    
    }// End of insertAlternate method (Ex3)

}