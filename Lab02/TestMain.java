//********** Ahmed Adel Al-Khawahir	201949310	Sec:55 **********//
public class TestMain {

	public static void main(String[] args) {
		
		System.out.println("******************************* Testing SLL 4 METHODS (LAB02) ********************************\n");
		
		//Declaring String array
		String[] fruitArray = new String[]{"Mango","Avocado","Lime","Peach","Apple"};
		
		//Making an String object from SLL class
		SLL<String> myList = new SLL<String>();
		
		System.out.println("# 1 #");
		
		//Adding the Strings to the Linked list
		myList.addToHead(fruitArray[0]);
		System.out.print("After inserting "+fruitArray[0]+", the list is >>	");
		myList.printAll();
		
		myList.addToTail(fruitArray[1]);
		System.out.print("After inserting "+fruitArray[1]+", the list is >>	");
		myList.printAll();
		
		myList.addToTail(fruitArray[2]);
		System.out.print("After inserting "+fruitArray[2]+", the list is >>	");
		myList.printAll();
		
		myList.addToTail(fruitArray[3]);
		System.out.print("After inserting "+fruitArray[3]+", the list is >>	");
		myList.printAll();
		
		myList.addToTail(fruitArray[4]);
		System.out.print("After inserting "+fruitArray[4]+", the list is >>	");
		myList.printAll();
		//-*-
		
		System.out.println();
		System.out.println("# 2 #");
		
		//Checking the methods (insertBefore, insertAfter).
		myList.insertBefore("Fruits", "Apple");
		System.out.print("After 'insertBefore' the list is >>	");
		myList.printAll();
		
		myList.insertAfter("Watermelon", "Lime");
		System.out.print("After 'insertAfter' the list is >>	");
		myList.printAll();
		//-*-
		
		System.out.println();
		System.out.println("# 3 #");
		
		//Checking the methods (deleteBefore, deleteAfter)
		myList.deleteBefore("Apple");
		System.out.print("After 'deleteBefore' the list is >>	");
		myList.printAll();
		
		myList.deleteAfter("Lime");
		System.out.print("After 'deleteAfter' the list is >>	");
		myList.printAll();
		//-*-
		
		System.out.println("\n\n************** THIS PROGRAM DOES NOT SUPPORT DUPLICATED DATA FOR DELETE METHODS **************");
		
	}

}
//********** Ahmed Adel Al-Khawahir	201949310	Sec:55 **********//