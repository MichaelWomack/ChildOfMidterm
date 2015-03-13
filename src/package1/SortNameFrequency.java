/**Michael Womack
 * CS 3401
 * Child of Midterm
 * March 6, 2015 */

package package1;

import java.util.Comparator;
import java.util.Map;

public class SortNameFrequency implements
		Comparator<Map.Entry<String, Integer>> {
	
	/**Method will compare two Map.Entry objects, then sort them from largest to smallest */
	public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2){
		if(e1.getValue() > e2.getValue())
			return -1;
		else if(e1.getValue() < e2.getValue())
			return 1;
		else
			return 0;
	}
}
