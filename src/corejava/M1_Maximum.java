/*
 [1] Write a Java program to Take three numbers from the user and print the greatest number.
 */

package corejava;

import java.util.Scanner;

public class M1_Maximum {

public static void main(String[] args) {

		int n1,n2,n3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		n1 = sc.nextInt();
		System.out.println("Enter Second Number: ");
		n2 = sc.nextInt();
		System.out.println("Enter Third Number: ");
		n3 = sc.nextInt();

		if(n1>n2 && n1>n3)
		{
			System.out.println("Greatest number is "+n1);
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.println("Greatest number is "+n2);
		}
		else
		{
			System.out.println("Greatest number is "+n3);
		}
	}

}
