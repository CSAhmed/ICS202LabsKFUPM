import java.util.Random;

//********** Ahmed Adel Al-Khawahir	201949310	Sec:55 **********//
public class DLLTest {
	public static void main(String[] args) {
		
		//Style
		for (int i=0; i<60; i++)
			System.out.print("-");
		
		System.out.println("\n###	Made by: Ahmed Adel Al-Khawahir 201949310	###");
		
		for (int i=0; i<60; i++)
			System.out.print("-");
		System.out.println();
		
		for (int i=0; i<60; i++)
			System.out.print("*");
		System.out.println();
		//-*-
		
		//Initialize the two string array
		String[] fruitArray = new String[]{"Mango","Avocado","Lime","Peach","Apple","Orange"};
		String[] priceArray = new String[] {"99$","53$","67$","14$","20$","34$"};
		//-*-
		
		//Add the elements to the DLLs
		DLL<String> testA = new DLL<String>();
		for(int i=0; i<6; i++) {
			testA.addToTail(fruitArray[i]);
		}
		DLL<String> testAdup = new DLL<String>();
		for(int i=0; i<6; i++) {
			testAdup.addToTail(fruitArray[i]);
		}
		DLL<String> testB = new DLL<String>();
		for(int i=0; i<6; i++) {
			testB.addToTail(priceArray[i]);
		}
		//-*-
		
		//Style
		for (int i=0; i<60; i++)
			System.out.print("-");
		
		System.out.println("\n***	The First Method Test (printReverse)	***");
		
		for (int i=0; i<60; i++)
			System.out.print("-");
		System.out.println();
		//-*-
		
		//Printing the Doubly Linked Lists
		System.out.print("ListA: ");testA.printAll();
		System.out.print("ListB: ");testB.printAll();
		//-*-
		
		//Do the printReverse method
		System.out.print("Reversed ListA: ");testA.printReverse();
		System.out.print("Reversed ListB: ");testB.printReverse();
		//-*-
		
		//Style
		System.out.println();
		
		for (int i=0; i<60; i++)
			System.out.print("-");
		
		System.out.println("\n***	The Second Method Test (Delete7)	***");
		
		for (int i=0; i<60; i++)
			System.out.print("-");
		System.out.println();
		//-*-
		
		//Printing one of the methods
		System.out.print("ListA: ");testA.printAll();
		//-*-
		
		//Do the delete7 method until the DLL becomes null (Has no elements)
		while(!testA.isEmpty()) {
			testA.delete7();
			System.out.print("After Deleting the 7th element, ListA: ");testA.printAll();
		}
		//-*-
		
		for (int i=0; i<60; i++)
			System.out.print("-");
		
		System.out.println("\n***	The Second Method Test  (Delete7)	*** '10 Random Integers Example'");
		
		for (int i=0; i<60; i++)
			System.out.print("-");
		System.out.println();
		
		DLL<Integer> randomDLL = new DLL<Integer>();
		for(int i=0; i<11; i++) {
			randomDLL.addToTail(1 + (int)(Math.random() * ((100 - 1) + 1)));
		}
		System.out.print("The random DLL of integers: ");randomDLL.printAll();
		
		while(!randomDLL.isEmpty()) {
			randomDLL.delete7();
			System.out.print("After Deleting the 7th element, randomDLL: ");randomDLL.printAll();
		}
		
		
		//Style
		System.out.println();
		
		for (int i=0; i<60; i++)
			System.out.print("-");
		
		System.out.println("\n***	The Third Method Test (insertAlternate)	***");
		
		for (int i=0; i<60; i++)
			System.out.print("-");
		System.out.println();
		//-*-
		
		//The First Case of the 'insertAlternate' Method
		System.out.println("### 1 ### (if the two lists are different in size) ###\n");
		testA.insertAlternate(testB);
		//-*-
		
		//Style
		for (int i=0; i<60; i++)
			System.out.print("-");
		//-*-
		
		//The Second Case of the 'insertAlternate' Method
		System.out.println("\n### 2 ### (if the two lists are same in size) ###\n");
		testAdup.insertAlternate(testB);
		testAdup.printAll();
		//-*-
		
		//Style
		for (int i=0; i<60; i++)
			System.out.print("-");
		System.out.println("\n");
		
		for (int i=0; i<60; i++)
			System.out.print("^");
		
		System.out.println("\n#######		The End of LAB03		#######");
		
		for (int i=0; i<60; i++)
			System.out.print("^");
		System.out.println();
		//-*-
		
	}//End of the main method
}//End of DLLTest Class

//********** Ahmed Adel Al-Khawahir	201949310	Sec:55 **********//