/*
 [21] Create a class named 'Print Number' to print various numbers of different data types by creating different methods with the same name 'printn' having a parameter for each data type. 
 */

package corejava;

class Number
{
	public void printn(int num)
	{
		System.out.println("Integer number: "+num);
	}
	public void printn(long num)
	{
		System.out.println("Long number: "+num);
	}
	public void printn(float num)
	{
		System.out.println("Float number: "+num);
	}
	public void printn(double num)
	{
		System.out.println("Double number: "+num);
	}
}

public class M21_PrintNumber {

	public static void main(String[] args) {
		Number n = new Number();
		n.printn(1344);
		n.printn(345678236787L);
		n.printn(12.678F);
		n.printn(123.123412344567);
	}
}
