//********** Ahmed Adel Al-Khawahir	201949310	Sec:55 **********//
import java.util.Arrays;
import java.util.Scanner;

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

		Scanner input = new Scanner(System.in);

		System.out.println("Please choose the way to build 'Max Heap' :");
		System.out.println("(1) Build Heap BottomUp \n(2) Build Heap TopDown");

		int inputN = input.nextInt();

		input.close();

		buildHeapBottomUp();
//		buildHeapTopDown();

	}

	private void buildHeapBottomUp() {
		for (int i = count / 2; i >= 1; i--) {
			percolateDown(i);
		}
	}

//	private void buildHeapTopDown() {
//		for (int i = 1; i <= count; i++) {
//			percolateUp(i);
//		}
//	}

	private void percolateDown(int index) {
		// Q1

		boolean done = false;
		int n = count;

		while ((2 * index <= n) && !done) {
			index = 2 * index;
			if ((index + 1 <= n) && (array[index + 1].compareTo(array[index]) > 0)) {
				index = index + 1;
			}
			if (array[index / 2].compareTo(array[index]) < 0) {

				Comparable tmp = array[index];

				array[index] = array[index / 2];
				array[index / 2] = tmp;
			} else {
				done = true;
			}
		}
	}

//	private void percolateUp(int index) {
//		// Q1
//		boolean done = false;
//
//		while (!done && (index != 1)) {
//			if (array[index].compareTo(array[index / 2]) > 0) {
//
//				Comparable tmp = array[index];
//
//				array[index] = array[index / 2];
//				array[index / 2] = tmp;
//			} else {
//				done = true;
//			}
//
//			index = index / 2;
//		}
//	}

	public void purge() {
		while (count > 0)
			array[count--] = null;
	}

	public void enqueue(Comparable comparable) {
		int index = count;

		// percolate up via a gap
		while (index > 1 && array[index / 2].compareTo(comparable) < 0) {

			array[index] = array[index / 2];

			index = index / 2;
		}

		array[index] = comparable;
	}

	public Comparable findMax() {
		return array[1];
	}

	public Comparable dequeueMax() {
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
			x[i] = dequeueMax();
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
	
	// Quiz method ( a )
	public static boolean isMaxHeap(Comparable[] array) {
		
		if(array[0] != null) {
			return false;
		}
		else {
			return isMaxHeapHelper(array, array.length-1);
		}
	}
	public static boolean isMaxHeapHelper(Comparable[] array, int i) {
		
		if(i == 2) {
			return true;
		}
		
		else if(array[(i-1)/2].compareTo(array[i]) < 0) {
			return false;
		}
		
		else {
			return true && isMaxHeapHelper(array, i-1);
		}
    
	}
	// Quiz method ( b )
	public static int lessThanSearch(Comparable[] arr, Comparable hi) {
		
		if(arr[0] != null) {
			System.out.println("Not Max Heap");
			return 0;
		}
		else {
			System.out.println("( "+hi+" )");
			return 1 + lessThanSearchHelper(arr, hi, arr.length-1);
		}
	}
	public static int lessThanSearchHelper(Comparable[] arr, Comparable hi, int n) {
		
		if(n == 1) {
			return 0;
		}
		else {
			if(arr[n].compareTo(hi) < 0) {
				System.out.println("( "+arr[n]+" )");
				return 1 + lessThanSearchHelper(arr, hi, n-1);
			}
			else
				return 0;
		}
	}

	public static void main(String[] args) {
		
		String[] array1 = { null, "water", "carrot", "lemon", "melon", "banana" };
		String[] array2 = { null, "water", "lemon", "melon", "carrot", "banana" };
//		String[] array3 = { null, "water", "lemon", "melon", "carrot", "banana", "Ahmed" };
		
		System.out.println(array2.length);
		
		
		System.out.println("The original array1 is: " + Arrays.toString(array1));
		System.out.println("The original array2 is: " + Arrays.toString(array2));
		
		//Style
		for (int i=0; i<70; i++)
			System.out.print("-");
		System.out.println();
		//-*-
		
		System.out.println("Is 'array1' a Max heap? "+isMaxHeap(array1));
		System.out.println("Is 'array2' a Max heap? "+isMaxHeap(array2));
		
		//Style
		for (int i=0; i<70; i++)
			System.out.print("-");
		System.out.println();
		//-*-
		
		System.out.println("The number of elements that is less than or equal 'lemon': "
							+ lessThanSearch(array2, "lemon"));


	}
}