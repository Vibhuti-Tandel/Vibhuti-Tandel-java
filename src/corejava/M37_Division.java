/*
 [37] Take two numbers from the user and perform the division operation and handle Arithmetic Exception. 
 O/P- Enter two numbers: 10 0 
 Exception in thread main java.lang.ArithmeticException:/ by zero 
 */

package corejava;

import java.util.Scanner;

public class M37_Division {

	public static void main(String[] args) {
		
		try {
			int n1,n2,d;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter two numbers for division: ");
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			d = n1/n2;
			System.out.println("Division: "+d);
			
		} catch (ArithmeticException e) {
			
			System.out.println("Cannot divide by zero");
			e.printStackTrace();
		}
	}
}
