/**
 * 
 */
package projecteuler;

/**
 * @author William
 * Description: This class will solve ProjectEuler05 which will, find the smallest positive number that is evenly divisible by all of the numbers from 1 to 20.
 */
public class ProjectEuler05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(divisibleByAllNumbersUpTo(20));
		System.out.println(divisibleByAllNumsUpTo(20));
		
	}
	
	//This method will find the smallest number divisible by all positive numbers up to the parameter num.
	public static int divisibleByAllNumbersUpTo(int num){
		int finalNum = num;
		
		while(!isDivisibleByUpTo(finalNum, num)){
			finalNum++;
		}
		
		
		return finalNum;
	}
	
	//This method finds if the number is divisible by all numbers up to the parameter num.
	public static boolean isDivisibleByUpTo(int dividedNum ,int limit){
		
		for(int i = 1; i <= limit; i++){
			if(dividedNum % i != 0){
				return false;
			}
		}
		
		return true;
	}
	
	
	// Wrote another method to solve this problem.
	// Returns the first number divisible by all numbers up to parameter num.
	public static int divisibleByAllNumsUpTo(int num){
		int result = 0;
		for(int i = 1; i < Integer.MAX_VALUE; i++){
			for(int j = 1; j <= num; j++){
				if(i % j != 0){
					result = 0;
					break;
				}
				result = i;
			}
			if(result != 0){
				break;
			}
		}
		return result;
	}
	
}
