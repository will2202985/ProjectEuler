/**
 * 
 */
package projecteuler;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author William
 * Description: This class will solve ProjetEuler13, which wants the first 10 digits of the sum of 100 50-digit numbers.
 */
public class ProjectEuler13 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filepath = "C:\\Users\\William\\Desktop\\MiscTextFiles\\projectEuler13Nums.txt";
		String[] projectEulerNums = ReadFromFile(filepath);
		System.out.println(sumOfStringArray(projectEulerNums));
		

	}
	
	// This method is going to pull the numbers out of a text file and put them into a String array. Each line will become a String in the String array.
	public static String[]ReadFromFile(String filePathFromUser) throws IOException{
		File usersFile;
		Stream<String> usersData;
		Object[] userFileData;
		String[] convertedUserFileData;
		
		usersFile = new File(filePathFromUser);
		usersData = Files.lines(Paths.get(usersFile.toURI()));
		userFileData = usersData.toArray();
		convertedUserFileData = new String[userFileData.length];
		usersData.close();
		
		int i = 0;
		while(i < userFileData.length){
			convertedUserFileData[i] = userFileData[i].toString();
			i++;
		}
		
		return convertedUserFileData;
	}
	
	//This method will take in a string array of huge numbers and return the sum of them as a BigInteger.
	public static BigInteger sumOfStringArray(String[] nums){
		BigInteger result = new BigInteger("0");
		
		for(int i = 0; i < nums.length; i++){
			result = result.add(new BigInteger(nums[i]));
		}
		
		return result;
	}

}
