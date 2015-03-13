/**Michael Womack
 * CS 3401
 * Child of Midterm
 * March 6, 2015 */

package package1;

import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortedStudentLists {

	public static void main(String[] args) {
		
		try {
			
			//create 3 lists of students
			List<Student> list1 = Student.createList();
			List<Student> list2 = Student.createList();
			List<Student> list3 = Student.createList();
			
			//sort the lists according to name, gpa, numHours
			Collections.sort(list1, new CompareName());
			Collections.sort(list2, new CompareGPA());
			Collections.sort(list3, new CompareHours());
			
			
			//display list1
			System.out.println("\n----Name----");
			for(int i = 0; i < list1.size(); i++)
				System.out.println(list1.get(i).getName());
			
			//display list2
			System.out.println("\n----GPA----");
			for(int i = 0; i < list2.size(); i++)
				System.out.println(list2.get(i).getGpa() + "\t" + list2.get(i).getName());
			
			//display list3
			System.out.println("\n----Hours----");
			for(int i = 0; i < list3.size(); i++)
				System.out.println(list3.get(i).getHours() + "\t" + list3.get(i).getName());
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Error Finding File");
			
		} catch (Exception e){
			System.out.println("Unknown Error Occurred");
		}
	}
}
