import java.util.Scanner;

public class PostfixCalculator {

	public static void main(String[] args) {

		// Make a Stack.
		LabStack<Integer> calcStack = new LabStack<Integer>();
		// -*-

		// Take the input and put in the 's' Stack.
		System.out.print("Enter your <postfix> expression: ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int stop = input.length();
		
		
		while(stop != 0) {
			
			stop--;
			
			for(int i=0; i<=input.length(); i++) {
				
				char current = ' ';
				if(i != input.length()) {
					current = input.charAt(i);
				}
				int num1 = 0;
				int num2 = 0;
				int num3 = 0;
				
				if(current == ' ' ) {
					
				}
				else if(Character.isDigit(current)) {
					
					if(input.charAt(i+1) == ' ') {
						int currNum = Character.getNumericValue(current);
						calcStack.push(currNum);
						i++;
					}
					else {
						
						String fullNum = "";
						
						while(input.charAt(i) != ' ') {
							
							fullNum = fullNum + input.charAt(i);
							if(i != input.length()) {i++;}
								
						}
						if(i != input.length()) {
							int currNum = Integer.valueOf(fullNum);
							calcStack.push(currNum);
						}
						
					}
					
				}
				else if(current == '+') {
					num1 = calcStack.pop();
					num2 = calcStack.pop();
					
					num3 = num2 + num1;
					
					calcStack.push(num3);
					System.out.println("Currently, the stack is>> "+calcStack.toString());
				}
				else if(current == '-') {
					num1 = calcStack.pop();
					num2 = calcStack.pop();
					
					num3 = num2 - num1;
					
					calcStack.push(num3);
					System.out.println("Currently, the stack is>> "+calcStack.toString());
				}
				else if(current == '*') {
					num1 = calcStack.pop();
					num2 = calcStack.pop();
					
					num3 = num2 * num1;
					
					calcStack.push(num3);
					System.out.println("Currently, the stack is>> "+calcStack.toString());
				}
				else if(current == '/') {
					num1 = calcStack.pop();
					num2 = calcStack.pop();
					
					num3 = num2 / num1;
					
					calcStack.push(num3);
					System.out.println("Currently, the stack is>> "+calcStack.toString());
				}
				
				
			}
			
			
		}

		scan.close();
		// -*-
		
		int last = calcStack.pop();
		
		
		System.out.println("The result of ( "+input+" ) = "+last);
		
		

	}

}
