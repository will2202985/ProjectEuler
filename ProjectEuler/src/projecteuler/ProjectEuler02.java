package projecteuler;

/**
 * @author William
 *
 * Description: This class solves ProjectEuler02 which prints out the sum of all even values of numbers in the Fibonacci sequence under four million.
 *
 */

import java.util.ArrayList;

public class ProjectEuler02 {

	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
		ArrayList<Integer> fibonacciArrayList = new ArrayList<Integer>(fibonacciArrayList(30));
		int sumOfEvenFib = 0;
		
		for(int i = 0; i < fibonacciArrayList.size(); i++){
			if(fibonacciArrayList.get(i) % 2 == 0){
				sumOfEvenFib += fibonacciArrayList.get(i);
			}//End if		
		}//End for
		
		System.out.println(sumOfEvenFib);*/
		System.out.println(solve());
	}
	
	//This method fills an ArrayList<Integer> with a fibonacci sequence the amount of numbers added is the parameter not including 1 and 2.
	public static ArrayList<Integer> fibonacciArrayList(int fibonacciUpperLimit){
		ArrayList<Integer> fibonacciNumbers = new ArrayList<Integer>();
		fibonacciNumbers.add(1);
		fibonacciNumbers.add(2);
		
		for(int i = 0; i < fibonacciUpperLimit; i++){
			fibonacciNumbers.add(fibonacciNumbers.get(i) + fibonacciNumbers.get(i+1));
		}
		
		
		return fibonacciNumbers;
	}
	
	public static int solve(){
		int result = 2;
		int one = 1;
		int two = 2;
		
		while(one < 4000000){
			one += two;
			if(one % 2 == 0){
				result += one;
			}
			
			two += one;	
			
			if(two % 2 == 0){
				result += two;
			}
			
		}
		
		
		return result;
	}

}
