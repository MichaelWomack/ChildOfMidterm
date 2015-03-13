/**Michael Womack
 * CS 3401
 * Child of Midterm
 * March 6, 2015 */

package package1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
	
	private String name;
	private String id;
	private int numHours;
	private double gpa;
	
	/** default constructor */
	public Student(){}
	
	/** constructor with all private data fields of Student class */
	public Student(String name, String id, int numHours, double gpa){
		this.name = name;
		this.id = id;
		this.numHours = numHours;
		this.gpa = gpa;
	}
	
	public String getName(){
		return name;
	}
	
	public String getId(){
		return id;
	}
	
	public int getHours(){
		return numHours;
	}
	
	public double getGpa(){
		return gpa;
	}
	
	/**Method reads student data from a file and creates a list of student objects with
	 * the data. Returns a list of students objects. */
	public static List<Student> createList() throws FileNotFoundException{
		
		List<Student> list = new ArrayList<>();
		Scanner input = new Scanner(new File("students.txt"));
		
		while(input.hasNextLine()){
			String[] line = input.nextLine().split(",");
			Student s = new Student();
			s.name = line[0];
			s.id = line[1];
			s.numHours = Integer.parseInt(line[2].trim());
			s.gpa = Double.parseDouble(line[3].trim());
			list.add(s);
		}
		input.close();
		return list;
	}	
}
