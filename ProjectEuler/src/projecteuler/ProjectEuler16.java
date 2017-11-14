/**
 * 
 */
package projecteuler;

import java.math.BigInteger;

/**
 * @author William
 *
 */
public class ProjectEuler16 {

	/**
	 * @param args
	 * Description: This class will solve ProjectEuler16. ProjectEuler16 wants the sum of all of the digits in 2^1000.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Pretty straight forward so no methods other than main were used. I just used big ints to get 2^1000's actual number then converted it to a char array. After that i can
		// simply get the numeric value of each char in the array and add them together and store it in the int answer.
		BigInteger twoToThousandth = new BigInteger("2").pow(1000);
		String tTTConverted = twoToThousandth.toString();
		char[] tTTConvertedAgain = tTTConverted.toCharArray();
		int answer = 0;
		
		for(int i = 0; i < tTTConvertedAgain.length; i++){
			answer += Character.getNumericValue(tTTConvertedAgain[i]);
		}
		
		System.out.println(answer);

	}

}
