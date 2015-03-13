/**Michael Womack
 * CS 3401
 * Child of Midterm
 * March 6, 2015 */

package package1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DistinctAuthors {

public static void main(String[] args){
		
	
		try {
			
			System.out.println(getAuthors("info.txt"));
		
		} catch (Exception e) {
			
			System.out.println("An error occurred");
		}	
	}
	
public static Set<String> getAuthors(String filename) throws FileNotFoundException {
		
		Set<String> distinct = new HashSet<String>();
		Scanner input = new Scanner(new File(filename));
		String author = "";
		
		while(input.hasNextLine()){
			author = input.nextLine();
			int begin = author.indexOf(",");
			int end = author.indexOf(",", begin + 2);
			distinct.add(author.substring(begin + 2, end));
			}
		return  distinct;
	}

}
