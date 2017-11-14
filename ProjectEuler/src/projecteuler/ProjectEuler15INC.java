/**
 * 
 */
package projecteuler;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author William
 * Description: This class will solve ProjectEuler15. ProjectEuler15 wants the amount of routes to the bottom right corner of a 20x20 grid.
 */
public class ProjectEuler15INC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gridPaths(2,2));
		
	}
	
	// This method will determine the amount of routes from the top left to the bottom right of a grid based on the given parameters rows and columns.
	// The method runs far to slow for the 20,20 grid from ProjectEuler15 so changes need to be made.
	public static long gridPaths(int rows, int columns){
		
		// First we get our variables setup for our process.
		int[] startPoint = new int[]{rows, columns};
		int[] endPoint = new int[]{0,0};
		long result = 0;
		ArrayList<int[]> movesMade = new ArrayList<int[]>();
		int previousLength = 0;
		int newLength = 0;
		boolean changesMade = true;
			
		// We need a starting point which will always be int[rows, columns] so we add that to our arraylist which will store the moves we have made.
		movesMade.add(startPoint);
			
		/* This section subtracts 1 from the rows and columns of each array that hasn't had 1 subtracted from it's elements, each subtraction is stored in our movesMade arrayList as a 
		 * new int array. This will be done until every array that hasn't had a subtraction is = to  {0, 0}.
		 * */
		while(changesMade){
			changesMade = false;
			
			newLength = movesMade.size();
			
			for(int j = previousLength; j < newLength; j++){
				for(int i = 0; i < 2; i++){
					int[] currentMove = movesMade.get(previousLength).clone();
										
					if(currentMove[i] > 0){
						
						currentMove[i] -= 1;
						movesMade.add(currentMove);
						changesMade = true;

					} // end if
				}// end inner for-loop
				
				previousLength++;
				
			}// end outer for-loop		
		}// end while loop
		
		// Test code printing out every move made start to finish
		/*for(int test = 0; test < movesMade.size(); test++){
			for(int test2 = 0; test2 < movesMade.get(test).length; test2++){
				System.out.print(movesMade.get(test)[test2] + " ");
			}
			System.out.println();
		}*/
		
		// At the end of all this we check for how many arrays with {0,0} are in the arrayList and that is our answer.
		for(int i = 0; i < movesMade.size(); i++){
			if(Arrays.equals(movesMade.get(i), endPoint)){
				result++;
			}
		}
		
		return result;
	}

}
