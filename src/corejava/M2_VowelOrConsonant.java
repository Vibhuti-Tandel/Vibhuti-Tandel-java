/*
 [2] Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message. 
 */

package corejava;

import java.util.Scanner;

public class M2_VowelOrConsonant {

	public static void main(String[] args) {

		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any single character from alphabet: ");
		s = sc.next();

		if(s.length()>1)
		{
			System.out.println("Please enter only one character");
		}
		else if(s.matches("[aeiouAEIOU]?"))
		{
			System.out.println("Entered character is vowel");
		}
		else if(!s.matches("[a-z A-Z]?"))
		{
			System.out.println("Please enter alphabets only");
		}
		else
		{
			System.out.println("Entered character is consonant");
		}
	}
}
