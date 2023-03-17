/*
 [32] Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! And is equal to 1*2*3*. *(n-1) *n. E.g.- 4! = 1*2*3*4 = 24 3! = 3*2*1 = 6 2! = 2*1 = 2 Also, 1! = 1 0! = 0 
 */

package corejava;

import java.util.Scanner;

public class M32_Factorial {

	public static int fact(int n)
	{
		int f=1;
		if(n==0)
		{
			f=0;
		}
		else
		{
			for(int i=1;i<=n;i++)
			{
				f = f * i;
			}
		}
		return f;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter number to find factorial: ");
		n = sc.nextInt();
		int ans = fact(n);
		System.out.println("Factorial of "+n+" is: "+ans);
	}
	
}
