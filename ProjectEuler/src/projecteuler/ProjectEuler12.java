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
			numOfDivisors = numOfDivisors(triangleNumbers.get(i));
			if(numOfDivisors > 500){
				break;
			}
			i++;
		}
		
		System.out.println(triangleNumbers.get(i));
		
		
	}
	
	//This method will generate an arraylist of Triangle numbers. The amount of numbers you get will be the parameter numberOfTriangleNumbers.
	public static ArrayList<Long> generateTriangleNumbers(long numberOfTriangleNumbers){
		ArrayList<Long> triangleNumbers = new ArrayList<Long>();
		long triangleNumber = 1;
		triangleNumbers.add(triangleNumber);
		
		for(int i = 2; i <= numberOfTriangleNumbers; i++){
			triangleNumber += i;
			triangleNumbers.add(triangleNumber);
		}
		
		return triangleNumbers;
	}
	
	/*
	//Used this method originally, it is from stackoverflow and is more efficient than mine but I got mine fast enough for the problem so I will use that.
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
	}*/

	// This method takes in a long and returns the number of divisors it has. Originally was a lot slower upgraded it to fit the need of the problem.
	public static int numOfDivisors(long num){
	if(num == 1){
		return 1;
	}
	int numOfDivisors = 2;
	for(int i = 2; i <= Math.sqrt(num); i++){
		
		if(num % i == 0){
			numOfDivisors+=2;
		}
		
		if(i * i == num) numOfDivisors--;
		
	}
	
	return numOfDivisors;
}

}
