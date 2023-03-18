/*
 [11] Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn. 
Input number: 5 5 + 55 + 555 
 */

package corejava;

import java.util.Scanner;

public class M11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n,sum;
		System.out.println("Enter an integer: ");
		n = sc.nextInt();
		String s1 = Integer.toString(n);
		String s2 = s1.concat(s1);
		String s3 = s2.concat(s1);
		
		int n1 = Integer.parseInt(s1);
		int n2 = Integer.parseInt(s2);
		int n3 = Integer.parseInt(s3);
		
		sum = n1 + n2 + n3;
		System.out.println(s1+" + "+s2+" + "+s3+" = "+sum);
	}
}
