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
	
}
