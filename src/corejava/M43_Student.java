/*
 [43] W.A.J.P to create a class Student with attributes roll no, name, age and course. 
 Initialize values through parameterized constructor. 
 If age of student is not in between 15 and 21 then generate user defined exception "AgeNotWithinRangeException". 
 If name contains numbers or special symbols raise exception "NameNotValidException". 
 Define the two exception classes. 
 */

package corejava;

import java.util.Scanner;

class AgeNotWithinRangeException extends Exception
{
	public AgeNotWithinRangeException(String str)
	{
		super(str);
	}
}

class NameNotValidException extends Exception
{
	public NameNotValidException(String str)
	{
		super(str);
	}
}

class Student43
{
	int rollno,age;
	String name,course;
	
	public Student43(int rollno,String name,int age,String course) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.course = course;
	}
	
	public void validateNameAge(String name,int age) throws AgeNotWithinRangeException,NameNotValidException
	{
		char[] arr = name.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(!(Character.isAlphabetic(arr[i])))
			{
				throw new NameNotValidException("Name is not valid, enter only characters");
			}
		}
		
		if(!(age>=15 && age<=18))
		{
			throw new AgeNotWithinRangeException("Student age is not within the range!");
		}
	}

}

public class M43_Student {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int rollno,age;
		String name,course;
		System.out.println("Enter Student Details...");
		
		try {
			System.out.println("Roll No.: ");
			rollno = sc.nextInt();
			System.out.println("Name: ");
			name = sc.next();
			System.out.println("Age: ");
			age = sc.nextInt();
			System.out.println("Course: ");
			course = sc.next();
			
			Student43 s = new Student43(rollno, name, age, course);
			s.validateNameAge(name, age);
		} 
		catch (NameNotValidException e) 
		{
			System.out.println(e);
		}
		catch (AgeNotWithinRangeException e)
		{
			System.out.println(e);
		}
	}
}
