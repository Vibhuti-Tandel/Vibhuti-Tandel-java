/*
 [3] Write a Java program that takes a year from user and print whether that year is a leap year or not. B19. 
 */

package corejava;

import java.util.Scanner;

public class M3_LeapYear {

	public static void main(String[] args) {

		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any year: ");
		year = sc.nextInt();

		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println("Leap year");
				}
			}
			else
			{
				System.out.println("Leap year");
			}
		}
		else
		{
			System.out.println("Not a leap year");
		}
	}

}
