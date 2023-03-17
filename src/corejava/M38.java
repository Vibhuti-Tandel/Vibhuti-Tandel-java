/*
 [38] W.A.J. P to demonstrate multiple catch blocks, 
 (one is to handle divide by zero exception and another one is to handle ArrayIndexOutOfBoundException) 
 int a [] =new int [5]; a [5]=30/0; 
 */

package corejava;

import java.util.Scanner;

public class M38 {

	public static void main(String[] args) {
		
		try {

			int a[] = new int[5];
			Scanner sc = new Scanner(System.in);
			for(int i=0;i<a.length;i++)
			{
				System.out.print("Enter a["+i+"]: ");
				a[i] = sc.nextInt();
				System.out.println("100 divided by "+a[i]+" : "+(100/a[i]));
			}
			System.out.println("Array elements");
			for(int i=0;i<=a.length;i++)
			{
				System.out.print(a[i]+" ");
			}
			
		} 
		catch (ArithmeticException e) {
			System.out.println("\nCannot divide by zero");
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\nArray index is out of bound");
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
