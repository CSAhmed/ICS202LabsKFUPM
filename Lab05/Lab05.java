
public class Lab05 {

	public static void main(String[] args) {
		
		String[] fruits = {"Apple", "Mango", "Banana", "Orange", "Peach", "Lime", "Watermelon"};
		
		System.out.println(findSmallest(fruits, fruits.length-1));
		System.out.println(findLongest(fruits, fruits.length-1));
		
		System.out.println(gcd(45, 25));
		
		System.out.println(putCommas("987631000"));
		
		System.out.println(findPalindrome("level"));
		System.out.println(findPalindrome("lever"));

		
	}//End of the main method
	
	public static String findSmallest(String[] array, int index) {
		
		//The Base Case
		if (index == 1) {
			//return the first element
			return array[0];
		}
		//-*-
		
		//If it's not the base case
		else {
			//Check if the current element is smaller than the element with (index-1)
			return (array[index].length() < findSmallest(array, index - 1).length()) ? 
		        		array[index]: findSmallest(array, index - 1);
			//-*-
		}
		//-*-
		
	}//End of findSmallest method
	
	public static String findLongest(String[] array, int index) {
		
		//The Base Case
		if (index == 1) {
			//return the first element
			return array[0];
		}
		//-*-
		
		//If it's not the base case
		else {
			//Check if the current element is longer than the element with (index-1)
			return (array[index].length() > findSmallest(array, index - 1).length()) ? 
		        		array[index]: findSmallest(array, index - 1);
			//-*-
		}
		//-*-
		
	}//End of findLongest method
	
	public static int gcd(int n, int m) {
		
		//The Base Case
		if(m ==0) {
			return n;
		}
		//-*-
		
		//If it's not the base case
		else {
			//return the n value as m and the m value as n mod m
			return gcd(m, n % m);
			//-*-
			
		}
		//-*-
		
	}//End of gcd method
	
	
	public static String putCommas(String x) {
		
	    if (x.length() == 0) return "Not Applicable";
	    
	    int length = 1;
	    if (x.length() != 0) {
	        length = x.length();
	    }
	    
	    //Print out leading digits
	    int numOfDigits = 1;
	    
	    if (length % 3 == 0) {
	        numOfDigits = 3;
	    }
	    else if ((length+1) % 3 == 0) {
	        numOfDigits = 2;
	    }
	    
	    if (length > 3) {
	        x = x.charAt(length-numOfDigits)+",";
	       
	    }
	        
	    return putCommas(x.substring(0, x.length()-3));
		
	}//End of putCommas method	
	
	public static boolean findPalindrome(String word) {
		
		//The Base Case , return true
		if(word.length() == 0 || word.length() == 1) {
			return true;
		}
		//-*-
		
		//If the first char == the last char
		if(word.charAt(0) == word.charAt(word.length()-1)) {
			
			//Return the method with word without first and last char
			return findPalindrome(word.substring(1, word.length()-1));
			//-*-
		}
		//-*-
		
		//otherwise it will return false
		return false;
		//-*-
		
	}//End of findPalindrome method

}
