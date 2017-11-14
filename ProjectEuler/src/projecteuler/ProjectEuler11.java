/**
 * 
 */
package projecteuler;

/**
 * @author William
 * Description: This class will solve ProjectEuler11, which wants the greatest product of four adjacent numbers up, down, left, right, or diagonally from the grid provided.
 */
public class ProjectEuler11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numToGrid = "08 02 22 97 38 15 00 40 00 75 04 05 07 78 52 12 50 77 91 08 49 49 99 40 17 81 18 57 60 87 17 40 98 43 69 48 04 56 62 00 81 49 31 73 55 79 14 29 93 71 40 67 53 88 30 03 49 13 36 65 52 70 95 23 04 60 11 42 69 24 68 56 01 32 56 71 37 02 36 91 22 31 16 71 51 67 63 89 41 92 36 54 22 40 40 28 66 33 13 80 24 47 32 60 99 03 45 02 44 75 33 53 78 36 84 20 35 17 12 50 32 98 81 28 64 23 67 10 26 38 40 67 59 54 70 66 18 38 64 70 67 26 20 68 02 62 12 20 95 63 94 39 63 08 40 91 66 49 94 21 24 55 58 05 66 73 99 26 97 17 78 78 96 83 14 88 34 89 63 72 21 36 23 09 75 00 76 44 20 45 35 14 00 61 33 97 34 31 33 95 78 17 53 28 22 75 31 67 15 94 03 80 04 62 16 14 09 53 56 92 16 39 05 42 96 35 31 47 55 58 88 24 00 17 54 24 36 29 85 57 86 56 00 48 35 71 89 07 05 44 44 37 44 60 21 58 51 54 17 58 19 80 81 68 05 94 47 69 28 73 92 13 86 52 17 77 04 89 55 40 04 52 08 83 97 35 99 16 07 97 57 32 16 26 26 79 33 27 98 66 88 36 68 87 57 62 20 72 03 46 33 67 46 55 12 32 63 93 53 69 04 42 16 73 38 25 39 11 24 94 72 18 08 46 29 32 40 62 76 36 20 69 36 41 72 30 23 88 34 62 99 69 82 67 59 85 74 04 36 16 20 73 35 29 78 31 90 01 74 31 49 71 48 86 81 16 23 57 05 54 01 70 54 71 83 51 54 69 16 92 33 48 61 43 52 01 89 19 67 48 ";
		int[][] grid = stringToMultiDimArray(numToGrid, 20 , 20);
		System.out.println(greatestProductOfFourFromGrid(grid));
		
		
		//Commented out printing the grid.
		/*for(int i = 0; i < 20; i++){
			for(int j = 0; j < 20; j++){
				int length = String.valueOf(test[i][j]).length();
				if(length == 2){
					System.out.print(test[i][j] + " ");
				}
				if(length == 1){
					System.out.print("0" + test[i][j] + " ");
				}
			}
			System.out.println();
		}*/

		
	}
	
	public static int greatestProductOfFourFromGrid(int[][] numberGrid){
		int result = 0;
		int highestProductFromJLoop = 0;
		int rowsAndColumnsOfGrid = numberGrid.length;
		int productOfLeftToRight = 0;
		int productOfRightToLeft = 0;
		int productOfUpToDown = 0;
		int productOfDownToUp = 0;
		int productOfUpRightDiag = 0;
		int productOfUpLeftDiag = 0;
		int productOfDownRightDiag = 0;
		int productOfDownLeftDiag = 0;
		
		for(int i = 0; i < rowsAndColumnsOfGrid; i++){
			for(int j = 0; j < rowsAndColumnsOfGrid; j++){
				//Test for left to right.
				if(j < rowsAndColumnsOfGrid -3){
					productOfLeftToRight = numberGrid[i][j] * numberGrid[i][j+1] * numberGrid[i][j+2] * numberGrid[i][j+3];
				}
				//Test for right to left.
				if(j > 2){
					productOfRightToLeft = numberGrid[i][j] * numberGrid[i][j-1] * numberGrid[i][j-2] * numberGrid[i][j-3];
				}
				//Test for up to down.
				if(i < rowsAndColumnsOfGrid -3){
					productOfUpToDown = numberGrid[i][j] * numberGrid[i+1][j] * numberGrid[i+2][j] * numberGrid[i+3][j];
				}
				//Test for down to up.
				if(i > 2){
					productOfDownToUp = numberGrid[i][j] * numberGrid[i-1][j] * numberGrid[i-2][j] * numberGrid[i-3][j];
				}
				//Test for up right diagonal.
				if(i > 2 && j < rowsAndColumnsOfGrid -3){
					productOfUpRightDiag = numberGrid[i][j] * numberGrid[i-1][j+1] * numberGrid[i-2][j+2] * numberGrid[i-3][j+3];
				}
				//Test for up left diagonal.
				if(i > 2 && j > 2){
					productOfUpLeftDiag = numberGrid[i][j] * numberGrid[i-1][j-1] * numberGrid[i-2][j-2] * numberGrid[i-3][j-3];
				}
				//Test for down right diagonal.
				if(i < rowsAndColumnsOfGrid -3 && j < rowsAndColumnsOfGrid -3){
					productOfDownRightDiag = numberGrid[i][j] * numberGrid[i+1][j+1] * numberGrid[i+2][j+2] * numberGrid[i+3][j+3];
				}
				//Test for down left diagonal.
				if(j > 2 && i < rowsAndColumnsOfGrid -3){
					productOfDownLeftDiag = numberGrid[i][j] * numberGrid[i+1][j-1] * numberGrid[i+2][j-2] * numberGrid[i+3][j-3];
				}
				
				highestProductFromJLoop = returnTheGreatest(productOfLeftToRight, productOfRightToLeft, productOfUpToDown, productOfDownToUp, productOfUpRightDiag, productOfUpLeftDiag, productOfDownRightDiag, productOfDownLeftDiag);
				
				if(result < highestProductFromJLoop){
					result = highestProductFromJLoop;
				}
				
			}
		}
		
		return result;
	}
	
	//This method will convert the string of given numbers to a multidimensional array, it is very specific though because of ProjectEuler11's
	//numbers so it only works if there are 2 digit numbers and spaces between each number.
	public static int[][] stringToMultiDimArray(String numsToBeArray, int rows, int columns){
		int[][] returnedGrid = new int[rows][columns];
		char[] oneDimNumsWithSpaces = numsToBeArray.toCharArray();
		int[] oneDimNumsWithoutSpaces = new int[rows * columns];
		
		int x = 0; //Secondary index for following loop
		
		//This loop will convert the char array with numbers and spaces to an int array with the numbers but no spaces
		for(int i = 0; i < oneDimNumsWithSpaces.length; i++){
			
			//Once we hit a space in the char array we know we need the last two indices since every number is two digits
			if(oneDimNumsWithSpaces[i] == ' '){
				String firstChar = Character.toString(oneDimNumsWithSpaces[i-2]);
				String secondChar = Character.toString(oneDimNumsWithSpaces[i-1]);
				oneDimNumsWithoutSpaces[x] = Integer.parseInt(firstChar + secondChar);
				x++;
			}
			
			//Break once we know the array is full.
			if(oneDimNumsWithoutSpaces[oneDimNumsWithoutSpaces.length-1] > 0){
				break;
			}		
		}
		
		int z = 0; //Index for one dim int array for following loop.
		
		//This loop will convert our int array into the 2D array based on rows and columns
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){
				returnedGrid[i][j] = oneDimNumsWithoutSpaces[z];
				z++;
				
			}
			
		}
		
		return returnedGrid;
	}
	
	//This method will take in eight integers and return the one with the highest numeric value
	public static int returnTheGreatest(int a, int b, int c, int d, int e, int f, int g, int h){
		int result = 0;
		int[] nums = new int[]{a,b,c,d,e,f,g,h};
		
		for(int i = 0; i < nums.length; i++){
			if(nums[i] > result){
				result = nums[i];
			}
		}
		
		
		return result;
	}

}
