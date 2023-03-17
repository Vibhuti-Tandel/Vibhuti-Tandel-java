/*
 [27] Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor. 
 */

package corejava;

class TriPeriArea
{
	public TriPeriArea()
	{
		System.out.println("Constructor called");
	}

	public void calc(float s1,float s2,float s3)
	{
		System.out.println("Perimeter of triangle: "+(s1+s2+s3));
		System.out.println("Area of triangle: "+(0.5*(s2*s3)));
	}
}

public class M27_Triangle {

	public static void main(String[] args) {

		TriPeriArea t = new TriPeriArea();
		t.calc(3, 4, 5);
	}
}
