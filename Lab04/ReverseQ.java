//********** Ahmed Adel Al-Khawahir	201949310	Sec:55 **********//
import java.util.Scanner;

public class ReverseQ {

	public static void main(String[] args) {
		
		LabQueue<String> queue = new LabQueue<String>();
		LabQueue<String> revQueue = new LabQueue<String>();
		
		System.out.println("Here's how I reverse a Queue: ");
		Scanner k = new Scanner(System.in);
		System.out.print("Enter your input> ");
		String input = k.nextLine();
		System.out.println(input.length());
		
		
		for(int i = 0; i <= input.length();) {
			System.out.println("index>> "+i);
			
			if(input.charAt(i) == ' ') {
				System.out.println("space");
				i++;
			}
			else if(input.charAt(i+1) == ' ') {
				String fullSt = ""+input.charAt(i);
			
				queue.enqueue(fullSt);
				
				i++;
			}
				
			else if(i != input.length()) {
					String fullSt = "";
					while(input.charAt(i) != ' ' && i != input.length()) {
						
						fullSt = fullSt + input.charAt(i);
						System.out.println(fullSt);
						i++;
						
					}
					System.out.println("INNN "+i);
					if(i == input.length()) {
						System.out.println("OUT OF RANGE");
					}
					else {
						if(input.charAt(i) != ' ')
							queue.enqueue(fullSt);
					}
				
			}
		}
//		
//		for(int i = (input.length()-1); i>=0; i--)
//			revQueue.enqueue(input.charAt(i)+"");

	for(

	int i = 0;i<60;i++)System.out.print("-");System.out.println();

	System.out.println("The queue is>> "+queue.toString());

	for(
	int i = 0;i<60;i++)System.out.print("-");System.out.println();

	for(
	int i = 0;i<22;i++)System.out.print(" ");

	System.out.println("((( Reverse )))");

	for(
	int i = 0;i<60;i++)System.out.print("-");System.out.println();

	System.out.println("After Reverse>> "+revQueue.toString());

}

}
