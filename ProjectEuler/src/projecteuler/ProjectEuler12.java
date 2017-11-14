package projecteuler;

import java.util.ArrayList;

/**
 * @author William
 * Description: This program will solve ProjectEuler12. ProjectEuler12 wants the value of the first triangle number to have over 500 divisors.
 */
public class ProjectEuler12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Long> triangleNumbers = generateTriangleNumbers(1000000);
		long numOfDivisors = 0;
		int i = 0;
		while(true){
			numOfDivisors = getNumberOfDivisors(triangleNumbers.get(i));
			if(numOfDivisors > 500){
				break;
			}
			i++;
		}
		
		System.out.println(triangleNumbers.get(i));
		
		
	}
	
	//This method will generate an arraylist of Triangle numbers. The amount of numbers you get will be the parameter numberOfTriangleNumbers -1.
	public static ArrayList<Long> generateTriangleNumbers(long numberOfTriangleNumbers){
		ArrayList<Long> triangleNumbers = new ArrayList<Long>();
		long triangleNumber = 1;
		triangleNumbers.add(triangleNumber);
		
		for(int i = 2; i < numberOfTriangleNumbers; i++){
			triangleNumber += i;
			triangleNumbers.add(triangleNumber);
		}
		
		return triangleNumbers;
	}
	
	//This method will take in an integer and return its number of divisors using prime factorization. From Stackoverflow. My method was too slow :(
	public static long getNumberOfDivisors (long n) {
	    int ret = 1;

	    long factor = 2;
	    while (factor <= n) {
	        int temp = 1;
	        while (n % factor == 0) {
	            n /= factor;
	            temp++;
	        }
	        ret *= temp;
	        factor++;
	    }
	    return ret;
	}
	
	// My slow numOfDivisors method couldn't solve the problem soon enough :(
    /*	public static int numOfDivisors(long num){
		if(num == 1){
			return 1;
		}
		int numOfDivisors = 1;
		for(int i = 1; i <= num/2; i++){
			if(num % i == 0){
				numOfDivisors++;
			}
		}
		
		
		return numOfDivisors;
	}*/

}
