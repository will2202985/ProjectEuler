/**
 * 
 */
package projecteuler;

/**
 * @author William
 *
 * Description: This class solves ProjectEuler03 which finds the largest prime factor of the number 600851475143.
 *
 */
public class ProjectEuler03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		long EulerStartingNum = 600851475143L;
		int largestPrimeFactor = 0; 
		
		for(int i = 1; i < Math.sqrt(EulerStartingNum);i++){
			if(isPrime(i) && EulerStartingNum % i == 0){
				largestPrimeFactor = i;
			}
		}
		System.out.println(largestPrimeFactor);
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

}
