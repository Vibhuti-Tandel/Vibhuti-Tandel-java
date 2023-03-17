/*
 [8] Write a Java program that reads a positive integer and count the number of digits the number. 
 Input an integer number less than ten billion: 125463 Number of digits in the number: 6 
 */

package corejava;

import java.util.Scanner;

public class M8_NumberOfDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num,count=0;
		System.out.println("Enter number: ");
		num = sc.nextInt();
		
		while(num!=0)
		{
			num = (num - (num % 10)) / 10;
			count++;
		}
		System.out.println("Digits in given number: "+count);
	}
}
