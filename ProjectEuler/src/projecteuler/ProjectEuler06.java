/**
 * 
 */
package projecteuler;

/**
 * @author William
 * Description: This class will solve ProjectEuler06, which wants the difference between the sum of the squares of all numbers up to 100
 * and the square of the sum of all numbers up to 100.
 */
public class ProjectEuler06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(squareOfSumUpTo(100) - sumOfSquaresUpTo(100));
	}
	
	//this method will return the square of the sum of numbers up to param num.
	public static int squareOfSumUpTo(int num){
		int squareOfSum = 0;
		int sum = 0;
		
		for(int i = 1; i <= num; i++){
			sum += i;
		}
		squareOfSum = sum*sum;
		
		return squareOfSum;
	}
	
	//This method returns the sum of squares up to param num.
	public static int sumOfSquaresUpTo(int num){
		int sum = 0;
		
		for(int i = 1; i <= num; i++){
			sum += i*i;
		}
		
		return sum;
	}

}
