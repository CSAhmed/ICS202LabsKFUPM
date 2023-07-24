//Ahmed Adel Al-Khawahir 	201949310	sec:55
public class TestBooks {

	public static void main(String[] args) {
		
		//Making an arrays for everything
		String[] randomTitles = {"ABC","Arabic","Sport",
								"Data Structures","Toefl","Calculus I",
								"Chemistry","Physics","Design",
								"Python Learning"};
		int[] randomPages = {100, 365, 92, 400, 500, 550, 200, 380, 190, 800};
		String[] randomCourses = {"ICS-202", "ENG-EP", "Math-101", "ICS-104"};
		
		//Variable to check the number of books and textbooks
		int checkBook = 0;
		int checkTextbook = 0;
		
		//Make an array that join everything
		Book[] arrayBooks = new Book[10];
		
		//for loop to fill the ArrayBooks 
		int j=0;
		for(int i=0; i<arrayBooks.length; i++) {
			if(i==0||i==1||i==2||i==6||i==7||i==8) {
				arrayBooks[i] = new Book(randomTitles[i], randomPages[i]);
			}
			else {
				arrayBooks[i] = new Textbook(randomTitles[i], randomPages[i], randomCourses[j]);
				j++;
			}
			
		}
		
		//Another way to fill the ArrayBooks
//		arrayBooks[0] = new Book("ABC",100);
//		arrayBooks[1] = new Book("Arabic",365);
//		arrayBooks[2] = new Book("Sport",92);
//		arrayBooks[3] = new Textbook("Data Structures",400,"ICS-202");
//		arrayBooks[4] = new Textbook("Toefl",500,"ENG-EP");
//		arrayBooks[5] = new Textbook("Calculus I",550,"Math-101");
//		arrayBooks[6] = new Book("Chemistry",200);
//		arrayBooks[7] = new Book("Physics",380);
//		arrayBooks[8] = new Book("Design",190);
//		arrayBooks[9] = new Textbook("Python Learning",800,"ICS-104");
		
		//Check how many books and textbooks are in the array
		for(int i=0; i<arrayBooks.length; i++) {
			if (arrayBooks[i] instanceof Textbook) {
				checkTextbook++;
			}
			else {
				checkBook++;
			}
		}
		
		//for loop to print the books
		for(int k=0; k<arrayBooks.length; k++) {
			System.out.println("("+(k+1)+") "+arrayBooks[k].toString());
		}
		
		//formating style
		for(int i=0;i<75;i++) {
			System.out.print("-");
		}
		

		
		//print the check numbers
		System.out.println("\nThe number of Books = "+checkBook);
		System.out.println("The number of TextBooks = "+checkTextbook);
		

	}

}
