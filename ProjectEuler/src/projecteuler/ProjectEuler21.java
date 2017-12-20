/**
 * 
 */
package projecteuler;

/**
 * @author William
 * Link: https://projecteuler.net/problem=21
 * This class solves ProjectEuler21 which states...
 * Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
 * If d(a) = b and d(b) = a, where a != b, then a and b are an amicable pair and each of a and b are called amicable numbers.
 * For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
 * Evaluate the sum of all the amicable numbers under 10000.
 */
public class ProjectEuler21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sumOfAmicableNumbers = 0;
		
		// Loop solves problem 21 using my sumOfDivisors method.
		for(int i = 1; i < 10000; i++){
			
			// First if statement makes sure the sum of divisors isn't equal to the number itself.
			// Might just be me not understanding the notation but I thought it was confusing how they worded this requirement in the problem
			if(i != sumOfDivisors(i)){
				// This if statement checks if the number of divisors in the number of divisors is = to i. Little confusing nesting the method in itself but
				// it isn't too bad a way to check for this.
				if(i == sumOfDivisors(sumOfDivisors(i))){
					sumOfAmicableNumbers += i;
				}
			}
		}
		
		System.out.println(sumOfAmicableNumbers);
	}
	
	
	// This method gets the sum of the divisors that are less than the parameter num(does not count the number itself as a divisor).
	public static int sumOfDivisors(int num){
		
		if(num == 1){
			return 1;
		}
		
		int sumOfDivisors = 1;
		
		// Since divisors come in pairs we only need to check up to the square root of the number. 
		for(int i = 2; i <= Math.sqrt(num); i++){
			
			if(num % i == 0){
				sumOfDivisors+=i;
				sumOfDivisors+=num/i;
			}
			
			// This is for if there is a perfect square since we are adding both divisors to the sum, if there is only one number * itself to get to the num param
			// then we have only one divisor.
			if(i * i == num) sumOfDivisors-= i;
			
		}
		
		return sumOfDivisors;
	}

}
