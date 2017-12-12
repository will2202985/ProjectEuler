/**
 * 
 */
package projecteuler;

/**
 * @author William
 * 12/11/2017
 *https://projecteuler.net/problem=40
 *This class will solve ProjectEuler40 which states... 
 *	An irrational decimal fraction is created by concatenating the positive integers:
	0.123456789101112131415161718192021...
	It can be seen that the 12th digit of the fractional part is 1.
	If dn represents the nth digit of the fractional part, find the value of the following expression.
	d1 × d10 × d100 × d1000 × d10000 × d100000 × d1000000
 */
public class ProjectEuler40 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Not seeing too much modularity for this one so just a solve method is used
		System.out.println(solve());
	}
	
	// solves the problem by just building chapernownesConstant up to the point we need and returning the product of all the numbers we need.
	public static int solve(){
		
		// I use a stringbuilder to store the constant since i will be constantly changing it.
		StringBuilder champernownesConstant = new StringBuilder("");
		
		// counter for the while loop that generates champernownesConstant.
		int i = 1;
		
		// While the numbers for champerownesConstant aren't up to 1000000(the highest index needed for the problem) keep adding the next integer to it.
		while(champernownesConstant.length() < 1000000){
			champernownesConstant.append(i);
			i++;
		}
		
		// This looks scary but its just returning the product of the numeric value of the indices we need for the problem.
		return Character.getNumericValue(champernownesConstant.charAt(0)) * Character.getNumericValue(champernownesConstant.charAt(9)) * Character.getNumericValue(champernownesConstant.charAt(99)) * Character.getNumericValue(champernownesConstant.charAt(999)) * Character.getNumericValue(champernownesConstant.charAt(9999)) * Character.getNumericValue(champernownesConstant.charAt(99999)) * Character.getNumericValue(champernownesConstant.charAt(999999));
		
	}
	
}
