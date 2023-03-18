/*
 [20] W.A.J.P to find the second most frequent character in a given string. 
 The given string is: successes The second most frequent char in the string is: c 
 */

package corejava;

import java.util.Scanner;

public class M20 {

	static final int total_chars = 256;
	
	static char secondMostFrequentChar(String str)
	{
		int count[] = new int[total_chars];
		int i;
		for(i=0;i<str.length();i++)
		{
			(count[str.charAt(i)])++;
		}
		
		int first=0,second=0;
		for(i=0;i<total_chars;i++)
		{
			if(count[i] > count[first])
			{
				second = first;
				first = i;
			}
			else if(count[i] > count[second] && count[i] != count[first])
			{
				second = i;
			}
		}
		return (char)second;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Enter string: ");
		str = sc.next();
		char res = secondMostFrequentChar(str);
		
		if(res != '\0')
		{
			System.out.println("The second most frequent character in string is: "+res);
		}
		else
		{
			System.out.println("No second most frequent character");
		}
	}
}
