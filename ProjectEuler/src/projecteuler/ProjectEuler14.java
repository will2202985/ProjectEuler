/**
 * 
 */
package projecteuler;

/**
 * @author William
 *
 */
public class ProjectEuler14 {

	/**
	 * @param args
	 * Description: This program will solve ProjectEuler problem 14. ProjectEuler 14 wants the number that produces the largest Collatz sequence that is under 1,000,000. 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long numWithBiggestCollatzSequence = 0;
		long biggestCollatzSequence = 0;
		
		
		for(int i = 0; i < 1000000; i++){
			long sequenceCount = collatzSequenceCount(i);
			
			if(sequenceCount > biggestCollatzSequence){
				biggestCollatzSequence = sequenceCount;
				numWithBiggestCollatzSequence = i;
			}
		}
		
		System.out.println(numWithBiggestCollatzSequence);

	}
	
	//This method will take in the long param startingNum and return a long representing how long its Collatz sequence is.
	public static long collatzSequenceCount(long startingNum){
		long sequenceCount = 0;
		
		while(true){
			if(startingNum == 0){
				return 0;
			}
			
			if(startingNum == 1){
				break;
			}
			
			if(startingNum % 2 == 1){
				startingNum *= 3;
				startingNum +=1;
				sequenceCount++;
			}
			
			if(startingNum % 2 == 0){
				startingNum /= 2;
				sequenceCount++;
			}
			
		}
		return sequenceCount;
	}

}
