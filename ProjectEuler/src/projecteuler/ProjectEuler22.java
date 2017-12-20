/**
 * 
 */
package projecteuler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author William
 * Link: https://projecteuler.net/problem=22
 * This class will solve Project Euler 22 which states...
 * Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order. 
 * Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.
 * For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list.
 * So, COLIN would obtain a score of 938 × 53 = 49714.
 * What is the total of all the name scores in the file?
 */
public class ProjectEuler22 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
	
		// First make an array list out of the text file Project Euler #22 gave us, the original file has been restructured using eclipse
		// so that each name is on its own line with no quotes. This makes it easier to work with for me.
		ArrayList<String> listOfNames = textFileToStringArray("projectEuler22Names.txt");
		
		// Next the array list is sorted.
		Collections.sort(listOfNames);
		
		// Each name has a position and a score, the sum is the answer after all of the code is executed.
		long namesPosition = 0;
		long namesScore = 0;
		long sum = 0;
		
		// For each name in the list of names multiply its position by its score and add that to the sum.
		for(String name : listOfNames){
			
			// Position is 1 more than its index.
			namesPosition = listOfNames.indexOf(name) + 1;
			
			// Each names score is the sum of each chars place in the alphabet. (Was sad I couldn't use a foreach on a string like in c#)
			for(int i = 0; i < name.length(); i++){
				namesScore += letterToSpotInTheAlphabet(name.charAt(i));
			}
			sum += namesScore * namesPosition;
			
			// Have to reset the score before we go to the next name.
			namesScore = 0;
		}
		System.out.println(sum);
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
	
	// Method reads from file based on parameter filePath and reads it line by line into an ArrayList<String>
	public static ArrayList<String> textFileToStringArray(String filePath) throws IOException{
		ArrayList<String> returnedArrayList = new ArrayList<String>();
		
		// Setup our readers
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		// Read the first line
		String line = br.readLine();

		// Loop through every line of the file and add it to the returned array list
		while(line != null){
			returnedArrayList.add(line);
			line = br.readLine();
		}
		
		// Close the reader and return the array list
		br.close();
		return returnedArrayList;
	}

}
