/**
 * 
 */
package projecteuler;

/**
 * @author William
 * Link: https://projecteuler.net/problem=30
 * 
 * This class solves Project Euler Problem 30 which states...
 * Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:
 * 
 * 1634 = 1^4 + 6^4 + 3^4 + 4^4
 * 8208 = 8^4 + 2^4 + 0^4 + 8^4
 * 9474 = 9^4 + 4^4 + 7^4 + 4^4
 * As 1 = 1^4 is not a sum it is not included.
 *	
 * The sum of these numbers is 1634 + 8208 + 9474 = 19316.
 * Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
 */
public class ProjectEuler30 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Print the answer out from my method.
		System.out.println(sumOfDigitPowerSumNumbers(5));
	}
	
	/**
	 * This method is specifically designed to solve Project Euler 30, it finds the sum of all the Digit Powers for the Power Param that you give it.
	 * Project Euler 30 is looking for the digit fifth powers.
	 * @param power
	 * @return sumOfDigitPowerSumNumbers, bases on the given power.
	 */
	public static int sumOfDigitPowerSumNumbers(int power){
		
		// First I setup our variables used for the problem. We need a String to hold a String representation of the number we are checking.
		String currentNumber = "";
		
		// We also need an int to store the sum of each digit of the current num raised to the power param.
		int currentNumDigitSum = 0;
		
		// Finally we need our returned total for the sum of the digit power sums.
		int runningTotal = 0;
		
		// The only tricky part about this problem is finding the point where you stop looking for numbers, 20 raised to whatever power you're looking for works for 
		// this problem it may need to be higher for powers higher than 5. Originally I thought to do 10 raised to the power param but that didn't work for 5.
		for(int i = 2; i < Math.pow(20, power); i++){
			
			// We turn every number to a string to iterate through the chars and use their numeric value to get the digit power sum.
			currentNumber = Integer.toString(i);
			
			// Looping through the current number and summing up its digit power sum.
			for(int j = 0; j < currentNumber.length(); j++){
				currentNumDigitSum += Math.pow(Character.getNumericValue(currentNumber.charAt(j)), power);
			}
			
			// If the number is equal to its digit power sum we add it to the returned runningTotal.
			if(currentNumDigitSum == i){
				runningTotal += i;
			}
			
			// Reset the currentNumDigitSum for the next number.
			currentNumDigitSum = 0;
		}
		
		return runningTotal;
	}

}
