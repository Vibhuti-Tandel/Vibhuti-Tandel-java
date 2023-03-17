/*
 [14] W.A.J.P to get the character at the given index within the String. Original String = Tops Technologies! The character at position 0 is T, The character at position 10 is o 
 */

package corejava;

import java.util.Scanner;

public class M14_CharacterPosition {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		char ch[] = str.toCharArray();

		for(int i=0;i<str.length();i++)
		{
			System.out.println("The character at position "+i+" is "+ch[i]);
		}
	}
}
