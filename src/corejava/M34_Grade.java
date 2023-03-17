/*
 [34] Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below: Marks Grade 91-100 AA 81-90 AB 71-80 BB 61-70 BC 51-60 CD 41-50 DD 40 Fail 
 */

package corejava;

import java.util.Scanner;

public class M34_Grade {

	public static void grade(int m)
	{
		if(m>=91 && m<=100)
		{
			System.out.println("AA");
		}
		else if(m>=81 && m<=90)
		{
			System.out.println("AB");
		}
		else if(m>=71 && m<=80)
		{
			System.out.println("BB");
		}
		else if(m>=61 && m<=70)
		{
			System.out.println("BC");
		}
		else if(m>=51 && m<=60)
		{
			System.out.println("CC");
		}
		else if(m>=41 && m<=50)
		{
			System.out.println("DD");
		}
		else if(m<=40 && m>=0)
		{
			System.out.println("FF");
		}
		else
		{
			System.out.println("Enter valid marks...");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int mark;
		System.out.println("Enter your marks out of 100: ");
		mark = sc.nextInt();
		System.out.println("Your Grade is...");
		grade(mark);
	}
}
