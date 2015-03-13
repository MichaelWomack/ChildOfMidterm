/**Michael Womack
 * CS 3401
 * Child of Midterm
 * March 6, 2015 */

package package1;

import java.util.Comparator;
	
 public class CompareName implements Comparator<Student>{
		
		public CompareName(){}
		
		public int compare(Student s1, Student s2){
			if(s1.getName().compareTo(s2.getName()) > 1)
				return 1;
			else if(s1.getName().compareTo(s2.getName()) < 1)
				return -1;
			else 
				return 0;
		}
	}
	

 class CompareHours implements Comparator<Student>{
		
		public CompareHours(){}
		
		public int compare(Student s1, Student s2){
			if(s1.getHours() > s2.getHours())
				return 1;
			else if(s1.getHours() < s2.getHours())
				return -1;
			else 
				return 0;
		}
	}
	
 class CompareGPA implements Comparator<Student>{
		
		public CompareGPA(){}
		
		public int compare(Student s1, Student s2){
			if(s1.getGpa() > s2.getGpa())
				return 1;
			else if(s1.getGpa() < s2.getGpa())
				return -1;
			else
				return 0;
		}
	}

