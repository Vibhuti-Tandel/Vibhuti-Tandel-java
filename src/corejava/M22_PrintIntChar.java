/*
 [22] Create a class to print an integer and a character with two methods having the same name but different sequence of the integer and the character parameters. For example, if the parameters of the first method are of the form (int n, char c), then that of the second method will be of the form (char c, int n).
 */

package corejava;

class Print
{
	public void printIntChar(int n,char c)
	{
		System.out.println("Method having parameter(int,char)...");
		System.out.println("Integer: "+n);
		System.out.println("Character: "+c);
	}
	public void printIntChar(char c,int n)
	{
		System.out.println("Method having parameter(char,int)...");
		System.out.println("Character: "+c);
		System.out.println("Integer: "+n);
	}
}

public class M22_PrintIntChar {

	public static void main(String[] args) {

		Print p = new Print();
		p.printIntChar(12, 'v');
		p.printIntChar('b', 23);
		p.printIntChar(33, 'h');
	}
}
