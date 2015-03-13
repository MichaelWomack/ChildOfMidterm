/**Michael Womack
 * CS 3401
 * Child of Midterm
 * March 6, 2015 */

package package1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class StudentNameFrequency {


	public static void main(String[] args) {
		
		try {
			
			Map m = nameFrequency();
			
			//Create a Set view of the mappings contains in map, then put into a list
			Set<Map.Entry<String, Integer>> entry = m.entrySet();
			List<Map.Entry<String, Integer>> list = toList(entry);
			
			//Sort the list according to preference in the SortNameFrequency class
			Collections.sort(list, new SortNameFrequency());
			
			//Display mappings' value and key
			System.out.println("Occurrences\tName\n---------------------------");
			for(int i = 0; i < list.size(); i++)
				System.out.println(list.get(i).getValue() +"\t\t" + list.get(i).getKey());
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}

	/**Method is passed a Set and returns a List of the elements given in the Set*/
	public static List<Entry<String, Integer>> toList(Set<Map.Entry<String, Integer>> entry) {
		
		List<Entry<String, Integer>> list = new ArrayList<>();
		for(Map.Entry<String, Integer> l: entry)
			list.add(l);
		
		return list;
	}

	/** Method will read data from a file and place the name of each student
	 *  into a map with the name as a key and number of occurrences as the value.
	 *  Returns the map.
	 **/
	public static Map nameFrequency() throws FileNotFoundException {
		
		Scanner input = new Scanner(new File("students.txt"));
		String name;
		Map<String, Integer> map = new HashMap<>();
		
		while(input.hasNextLine()){
			name = input.nextLine();
			name = name.substring(0, name.indexOf(','));
			
			if(!map.containsKey(name))
				map.put(name, 1);
			else{
				int value = map.get(name);
				value++;
				map.put(name, value);
			}
		}
		input.close();
		return map;
	}
}
