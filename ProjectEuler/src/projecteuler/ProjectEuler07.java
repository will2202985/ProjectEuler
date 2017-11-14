/**
 * 
 */
package projecteuler;

import java.util.ArrayList;

/**
 * @author William
 * Description: This class will solve ProjectEuler07, which asks for the 10,001st prime number.
 */
public class ProjectEuler07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> primesList = BuildListOfPrimes(1000000);
		//put 10000 in because index starts at 0
		System.out.println(primesList.get(10000));
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

}
