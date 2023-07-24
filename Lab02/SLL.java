//**************************  SLL.java  *********************************
//           a generic singly linked list class 

public class SLL<T> {
	protected SLLNode<T> head, tail;

	public SLL() {
		head = tail = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addToHead(T el) {
		head = new SLLNode<T>(el, head);
		if (tail == null)
			tail = head;
	}

	public void addToTail(T el) {
		if (!isEmpty()) {
			tail.next = new SLLNode<T>(el);
			tail = tail.next;
		} else
			head = tail = new SLLNode<T>(el);
	}

	public T deleteFromHead() { // delete the head and return its info;
		if (isEmpty())
			return null;
		T el = head.info;
		if (head == tail) // if only one node on the list;
			head = tail = null;
		else
			head = head.next;
		return el;
	}

	public T deleteFromTail() { // delete the tail and return its info;
		if (isEmpty())
			return null;
		T el = tail.info;
		if (head == tail) // if only one node in the list;
			head = tail = null;
		else { // if more than one node in the list,
			SLLNode<T> tmp; // find the predecessor of tail;
			for (tmp = head; tmp.next != tail; tmp = tmp.next)
				;
			tail = tmp; // the predecessor of tail becomes tail;
			tail.next = null;
		}
		return el;
	}

	public void delete(T el) { // delete the node with an element el;
		if (!isEmpty())
			if (head == tail && el.equals(head.info)) // if only one
				head = tail = null; // node on the list;
			else if (el.equals(head.info)) // if more than one node on the list;
				head = head.next; // and el is in the head node;
			else { // if more than one node in the list
				SLLNode<T> pred, tmp;// and el is in a nonhead node;
				for (pred = head, tmp = head.next; tmp != null
						&& !tmp.info.equals(el); pred = pred.next, tmp = tmp.next)
					;
				if (tmp != null) { // if el was found;
					pred.next = tmp.next;
					if (tmp == tail) // if el is in the last node;
						tail = pred;
				}
			}
	}

	public void printAll() {
		for (SLLNode<T> tmp = head; tmp != null; tmp = tmp.next)
			System.out.print(tmp.info + " ");
		System.out.println();
	}

	public boolean isInList(T el) {
		SLLNode<T> tmp;
		for (tmp = head; tmp != null && !tmp.info.equals(el); tmp = tmp.next);
		return tmp != null;
	}

	// *** Exercise 1 ***
	public void insertBefore(T newElem, T existingElem) {

		if (existingElem.equals(head.info)) { // if the existing element is the head
			addToHead(newElem);

		} else { // if the existing element is the tail or between head and tail or DNE.

			SLLNode<T> pred, tmp;
			for (pred = head, tmp = head.next; tmp != null
					&& !tmp.info.equals(existingElem); pred = pred.next, tmp = tmp.next);

			if (tmp != null) { // if the existing element exist.
				pred.next = new SLLNode<T>(newElem, pred.next);

			} else // if the existing element is not exist (DNE).
				System.out.println("existingElem does not exist >> element: " + existingElem);
		}
	}// End of insertBefore method (Ex1)

	// *** Exercise 2 ***
	public void insertAfter(T newElem, T existingElem) {

		if (existingElem.equals(head.info)) { // if the existing element is the head
			head.next = new SLLNode<T>(newElem, head.next);

		} else { // if the existing element is the tail or between head and tail or DNE.

			SLLNode<T> pred, tmp;
			for (pred = head, tmp = head.next; tmp != null
				&& !tmp.info.equals(existingElem); pred = pred.next, tmp = tmp.next);

			if (tmp != null) { // if the existing element exist.
				tmp.next = new SLLNode<T>(newElem, tmp.next);

			} else // if the existing element is not exist (DNE).
				System.out.println("existingElem does not exist >> element: " + existingElem);
		}

	}// End of insertAfter method (Ex2)

	// *** Exercise 3 ***
	public void deleteBefore(T existingElem) {
		
		if(existingElem.equals(head.info)) {
			System.out.println("There is no existing element before: "+existingElem);
		}
		else {
			SLLNode<T> pred, tmp;
			for (pred = head, tmp = head.next; tmp != null
				&& !tmp.info.equals(existingElem); pred = pred.next, tmp = tmp.next);
			if(tmp != null) {
				delete(pred.info);
			}
			else {
				System.out.println("existingElem does not exist !");
			}
			
		}
		
	}// End of deleteBefore method (Ex3)
	
	// *** Exercise 4 ***
	public void deleteAfter(T existingElem) {
		
		if(existingElem.equals(tail.info)) {
			System.out.println("There is no existing element after: "+existingElem);
		}
		else {
			SLLNode<T> tmp;
			for (tmp = head; tmp != null
				&& !tmp.info.equals(existingElem); tmp = tmp.next);
			if(tmp != null) {
				delete(tmp.next.info);
			}
			else {
				System.out.println("existingElem does not exist !");
			}
		}
		
		
	}// End of deleteAfter method (Ex4)
	

}

