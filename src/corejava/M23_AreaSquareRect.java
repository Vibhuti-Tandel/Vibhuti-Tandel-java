/*
 [23] Create a class to print the area of a square and a rectangle. The class has two methods with the same name but different number of parameters. The method for printing area of a rectangle has two parameters which are length and breadth respectively while the other method for printing area of square has one parameter which is side of square. 
 */

package corejava;

class CalculateArea
{
	public void area(int l,int b)
	{
		System.out.println("Lenth of rectangle: "+l);
		System.out.println("Breadth of rectangle: "+b);
		System.out.println("Area of rectangle: "+(l*b));
	}
	public void area(int l)
	{
		System.out.println("Length of square: "+l);
		System.out.println("Area of square: "+(l*l));
	}
}

public class M23_AreaSquareRect {

	public static void main(String[] args) {
		CalculateArea a = new CalculateArea();
		a.area(7, 6);
		System.out.println("");
		a.area(5);
	}
}
