import java.util.Arrays;

public class BinaryHeap {
	protected Comparable array[];
	int count;

	public BinaryHeap(int i) {
		array = new Comparable[i + 1];
	}

	public BinaryHeap(Comparable[] comparable) {
		this(comparable.length);
		for (int i = 0; i < comparable.length; i++)
			array[i + 1] = comparable[i];

		count = comparable.length;

		buildHeapTopDown(); 
		buildHeapBottomUp();
	}

	private void buildHeapBottomUp() {
		// Q1
		for (int i = count / 2; i >= 1; i--)
			percolateDown(i);

	}

	private void buildHeapTopDown() {
		// Q1
		for (int i = 1; i < count/2 ; i++) {
			percolateUp(i);
		}
	}

	private void percolateDown(int index) {
		// Q1
		boolean done = false;
		while ((2 * index <= count) && !done) {
			
			index = 2 * index;
			
			if ((index + 1 <= count) && (array[index].compareTo(array[index+1]) < 0))
				if (array[index/2].compareTo(array[index]) < 0) {
					
					Comparable tmp = array[index];
					
					array[index] = array[index/2];
					array[index/2] = tmp;
					
				}
				else
					done = true;
		}

	}

	private void percolateUp(int index) {
		// Q1
		
		boolean done = false;
		while (!done && (index != 1)) {
			if (array[index].compareTo(array[index/2]) > 0) {
				
				Comparable tmp = array[index];
				
				array[index] = array[index/2];
				array[index/2] = tmp;
			}
			else
				done = true;
			
			index = index / 2;

		}
		
	}

	public void purge() {
		while (count > 0)
			array[count--] = null;
	}

	public void enqueue(Comparable comparable) {
		int index = ++count;

		// percolate up via a gap
		while (index > 1 && array[index / 2].compareTo(comparable) > 0) {
			array[index] = array[index / 2];
			index = index / 2;
		}

		array[index] = comparable;
	}

	public Comparable findMin() {
		return array[1];
	}

	public Comparable dequeueMin() {
		Comparable minItem = array[1];
		array[1] = array[count];
		count--;
		percolateDown(1);
		return minItem;
	}

	public Comparable[] heapSort() {
		Comparable[] x = new Comparable[count];
		int total = count;
		for (int i = 0; i < total; i++) {
			x[i] = dequeueMin();
		}
		return x;
	}

	public boolean isFull() {
		return count == array.length - 1;
	}

	public boolean isEmpty() {
		return count == 0;
	}

	public String toString() {
		Comparable[] tempArray = new Comparable[array.length - 1];
		System.arraycopy(array, 1, tempArray, 0, array.length - 1);
		return Arrays.toString(tempArray);
	}

	public static void main(String[] args) {
		Integer[] a = { 10, 2, 8, 9, 1, 6, 3, 4, 0, 5 };
		System.out.println("The original array is: " + Arrays.toString(a));
		BinaryHeap bh = new BinaryHeap(a);
		// builds heap bottom up: change the constructor to build it top-down
		System.out.println("\nThe heap is: " + bh);
		System.out.println("\nSorted Array is: " + Arrays.toString(bh.heapSort()));
	}
}