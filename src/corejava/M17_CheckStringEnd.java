/*
 [17] W.A.J.P to check whether a given string ends with the contents of another string. "Java Exercises" ends with "se"? False "Java Exercise" ends with "se"? True 
 */

package corejava;

import java.util.Scanner;

public class M17_CheckStringEnd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String s1 = sc.nextLine();
		System.out.println("Enter content of another string to compare end: ");
		String s2 = sc.nextLine();
		System.out.println("Comparison: ");
		System.out.println(s1.endsWith(s2));
	}
}
