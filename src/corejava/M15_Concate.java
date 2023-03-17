/*
 [15] W.A.J.P to concatenate a given string to the end of another string. 
 */

package corejava;

import java.util.Scanner;

public class M15_Concate {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s1,s2;
		System.out.println("Enter first string: ");
		s1 = sc.next();
		System.out.println("Enter second string: ");
		s2 = sc.next();
		
		System.out.println("Concatinating string2 at the end of string1: ");
		System.out.println(s1.concat(s2));
	}
}
