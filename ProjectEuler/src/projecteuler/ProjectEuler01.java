/**
 * 
 */
package projecteuler;

/**
 * @author William
 * Description: This class solves ProjectEuler01 which prints the sum of all multiples of 3 and 5 under 1000.
 *
 */
public class ProjectEuler01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sumOfMultiplesOf3And5());

	}
	public static int sumOfMultiplesOf3And5(){
		int $num = 0;  
		for(int i=0; i < 1000; i++){
		    
			if(i % 3 == 0 || i % 5 == 0){
		      
				$num += i;
				
		    }
		  }
		  return $num;
		}
}
