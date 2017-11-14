/**
 * 
 */
package projecteuler;

/**
 * @author William
 * Description: This class will solve ProjectEuler09, which wants the product of  a, b, and c from a Pythagorean triplet where a + b + c = 1000.
 * A Pythagorean triplet would be where a squared + b squared = c squared.
 */
public class ProjectEuler09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int a = 1; a < 1000; a++){
			for(int b = 1; b < 1000; b++){
				for(int c = 1; c < 1000; c++){
					if(isPythagoreanTriplet(a, b, c) && a + b + c == 1000){
						System.out.println(a*b*c);
					}
				}
			}
			
		}
		
		
	}
	
	// This method takes in three ints and returns true if they are a Pythagorean triplet.
	public static boolean isPythagoreanTriplet(int a, int b, int c){
		if(a*a + b*b == c*c){
			return true;
		}
		
		return false;
	}

}
