/**
 * 
 */
package projecteuler;

import java.math.BigInteger;

/**
 * @author William
 * https://projecteuler.net/problem=20
 * 
 * This class solves Project Euler 20 which states...
 * n! means n x (n - 1) x ... x 3 x 2 x 1
 * For example, 10! = 10 x 9 x ... x 3 x 2 x 1 = 3628800,
 * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 * Find the sum of the digits in the number 100!
 *
 */
public class ProjectEuler20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfDigits(factorial(new BigInteger("100"))));
	}
	
	// This method takes a big integer and gets the sum of the digits
	public static int sumOfDigits(BigInteger num){
		String number = num.toString();
		int sum = 0;
		
		for(int i = 0; i < number.length(); i++){
			sum += Character.getNumericValue(number.charAt(i));
		}
		
		return sum;
		
	}
	
	// This method returns the factorial of the parameter num using BigIntegers
	public static BigInteger factorial(BigInteger num){
		
		// Loop logic is a bit tricky since I'm using BigIntegers but it is just counting down to 1 from num
		for(BigInteger i = num; i.compareTo(new BigInteger("1")) == 1; i= i.subtract(new BigInteger("1"))){
			
			// int equivalent is num *= i - 1
			num = num.multiply(i.subtract(new BigInteger("1")));
		}
		
		return num;
	}

}
