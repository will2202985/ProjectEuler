/**
 * 
 */
package projecteuler;

/**
 * @author William
 * Description: This class solves ProjectEuler04 It will print out the largest palindrome that is the product of multiplying two three digit numbers.
 *
 */
public class ProjectEuler04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProjectEuler04 test = new ProjectEuler04();
		
		System.out.println(test.largestPalindromeFromThreeDigits());
		

	}
	
	//This method will return the largest palindrome from multiplying two three digit numbers.
	public int largestPalindromeFromThreeDigits(){
		int largestPalindrome = 0;
		int palindromeTestVar = 0;
		
		for(int i = 100; i < 999; i++){
			for(int x = 100; x < 999; x++){
				palindromeTestVar = i * x;
				if(isPalindrome(palindromeTestVar) && palindromeTestVar > largestPalindrome){
					largestPalindrome = palindromeTestVar;
				}
				
			}
		}
		return largestPalindrome;
	}
	
	//this method takes in an integer and returns true if its a palindrome.
	public static boolean isPalindrome(int checkedNum){
		
		//Number is converted to a string to reverse the number.
		String checkedNumToString = Integer.toString(checkedNum);
		String reversedNum = new StringBuilder(checkedNumToString).reverse().toString();
		 
		//Screw up
		//String stringFirstHalf = checkedNumToString.substring(0, checkedNumToString.length()/2) ;
		//String stringSecondHalf = checkedNumToString.substring(checkedNumToString.length()/2, checkedNumToString.length() ) ;
		
		if(!(checkedNumToString.contentEquals(reversedNum))){
			return false;
		}
		
		
		return true;
	}

}
