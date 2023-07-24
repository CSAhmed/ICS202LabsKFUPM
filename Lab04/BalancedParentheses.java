//********** Ahmed Adel Al-Khawahir	201949310	Sec:55 **********//
import java.util.Scanner;

public class BalancedParentheses {

	public static void main(String[] args) {
		
		//Make two Stacks.
		LabStack<String> s = new LabStack<String>();
		
		LabStack<String> bpstack = new LabStack<String>();
		//-*-
		
		//Take the input and put in the 's' Stack.
		System.out.print("Enter your expression: ");
		Scanner k = new Scanner(System.in);
		String input = k.nextLine();
		
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) != ' ') {
				s.push(input.charAt(i) + "");
			}
		}
		//-*-
		
		k.close();
		
		System.out.println();
		
		//BalancedParentheses check.
		int pushparapop = 0;
		int regularPare = 0;
		int squarePare = 0;
		int curlyPare = 0;
		
		//Loop will stop if the 's' stack is empty.
		while(!s.isEmpty()) {
			
			//If it is close Parentheses
			if(s.topEl().equals(")") || s.topEl().equals("]") || s.topEl().equals("}")) {
				
				if(s.topEl().equals(")")) {
					regularPare++;
					bpstack.push(s.pop());
				}
				else if(s.topEl().equals("]")) {
					squarePare++;
					bpstack.push(s.pop());
				}
				else {
					curlyPare++;
					bpstack.push(s.pop());
				}
				
				pushparapop++;
				
			}
			//-*-
			
			//If it is open Parentheses
			else if(s.topEl().equals("(") || s.topEl().equals("[") || s.topEl().equals("{") ) {
				
				if(bpstack.isEmpty()) {
					s.pop();
				}
				else if(s.topEl().equals("(")) {
					
					if(bpstack.topEl().equals(")")) {
						regularPare--;
						bpstack.pop();
					}
					s.pop();
				}
				else if(s.topEl().equals("[")) {
					
					if(bpstack.topEl().equals("]")) {
						squarePare--;
						bpstack.pop();
					}
					
					s.pop();
				}
				else {
					
					if(bpstack.topEl().equals("}")) {
						curlyPare--;
						bpstack.pop();
					}
					
					s.pop();
				}
				
				pushparapop--;
				
			}
			//-*-
			
			//Not Parentheses
			else {
				s.pop();
			}
			//-*-
			
		}
		//-*-
		
		//Style
		for (int i=0; i<60; i++)
			System.out.print("-");
		//-*-
		
		System.out.println("\nThe Expression: "+input);
		
		//Style
		for (int i=0; i<60; i++)
			System.out.print("-");
		//-*-
		
		//Print if that the Parentheses are balanced or not.
		if(pushparapop == 0) {
			
			if(regularPare == 0 && squarePare == 0 && curlyPare == 0)
				System.out.println("\nExpression is balanced");
			else
				System.out.println("\nExpression is not balanced,\n\nParentheses not matched !");
		}
		else {
			System.out.println("\nExpression is not balanced");
		}
		//-*-

	}//End of Main method.
	
}//End of BalancedParentheses class.
