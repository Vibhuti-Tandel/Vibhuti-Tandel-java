/*
 [5] Write a program in Java to input 5 numbers from keyboard and find their sum and average using for loop. 
 */

package corejava;

import java.util.Scanner;

public class M5_SumAvg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		float sum=0,avg;
		int a[] = new int[5];
		for(i=0;i<5;i++)
		{
			System.out.print("Enter number "+(i+1)+": ");
			a[i] = sc.nextInt();
			sum = sum + a[i];
		}
		avg = sum / 5;
		System.out.println("Sum of above 5 numbers: "+sum);
		System.out.println("Average of above 5 numbers: "+avg);
	}

}
