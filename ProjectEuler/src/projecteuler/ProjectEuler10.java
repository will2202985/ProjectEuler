/**
 * 
 */
package projecteuler;

import java.util.ArrayList;

/**
 * @author William
 * Description: This class will solve ProjectEuler10, which wants the sum of all prime numbers below 2,000,000.
 */
public class ProjectEuler10 {
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfIntArrayList(BuildListOfPrimes(2_000_000)));
		
	}
	
	//This method checks if a number is prime. Returns true if it is prime.
    public static Boolean isPrime(int num)
    {
        Boolean status = true;

        for (int i = 2; i <= Math.sqrt(num); i++)
        {
            if ((num % i) == 0)
            {
                return false;  
            }
        }
            return status;
    }
    
    //This method takes in an int and generates an ArrayList of prime numbers up to the int given.
    public static ArrayList<Integer> BuildListOfPrimes(int upperLimit)
    {
    	ArrayList<Integer> primes = new ArrayList<Integer>();

        for (int i = 2; i < upperLimit; i++)
        {
            if (isPrime(i)) primes.add(i);
        }
        return primes;
    }
    
    public static long sumOfIntArrayList(ArrayList<Integer> nums){
    	long sum = 0;
    	//System.out.println(nums.get(nums.size()-1));
    	for(int i = 0; i < nums.size(); i++){
    		sum += nums.get(i);
    	}
    	
    	return sum;
    }

}
