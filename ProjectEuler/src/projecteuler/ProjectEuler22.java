/**
 * 
 */
package projecteuler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author William
 *
 */
public class ProjectEuler22 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(letterToSpotInTheAlphabet('F'));
		
		String[] listOfNames = textFileToStringArray("C:\\Users\\William\\git\\ProjectEuler\\ProjectEuler\\projectEuler22Names.txt");
		
		for(String name : listOfNames){
			System.out.println(name);
		}
		
	}
	
	// This method gets the spot of the alphabet that a letter is in. For example A = 1, B = 2, C = 3, ...
	public static int letterToSpotInTheAlphabet(char letter){
		
		// We start the letters spot at 1
		int lettersSpotInTheAlphabet = 1;
		
		// Make the given letter uppercase so we don't have case issues.
		char checkedLetter = Character.toUpperCase(letter);
		
		// We count up the letters until we reach our letter.
		for(char i = 'A'; checkedLetter <= 'Z'; i++){
			if(i == checkedLetter){
				break;
			}
			
			// Each time we go through the loop we increment the letters spot to keep track of where we are.
			lettersSpotInTheAlphabet++;
		}
		
		return lettersSpotInTheAlphabet;
	}
	
	public static String[] textFileToStringArray(String filePath) throws IOException{
		String[] returnedArray = new String[0];
		
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);

		returnedArray = new String[(int)br.lines().count()];
		
		for(int i = 0; br.readLine() != null; i++){
			returnedArray[i] = br.readLine();
		}
		br.close();
		return returnedArray;
	}

}
