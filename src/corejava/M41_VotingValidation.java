/*
 [41] W.A.J.P to create the validate method that takes integer value as a parameter. 
 If the age is less than 18, then throw an Arithmetic Exception otherwise print a message welcome to vote. 
 O/P- Enter your age: 16 Exception in thread main java. Lang. Arithmetic Exception: not valid 
 */

package corejava;

import java.util.Scanner;

class Election
{
	public void validate(int age) throws ArithmeticException
	{
		if(age>18)
		{
			System.out.println("Welcome to vote!!");
		}	
		else
		{
			throw new ArithmeticException();
		}
	}
}

public class M41_VotingValidation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		try {
			Election e = new Election();
			e.validate(age);
			
		} catch (ArithmeticException e) {
			System.out.println("\nYou can't vote!!");
			e.printStackTrace();
		}
	}
}
