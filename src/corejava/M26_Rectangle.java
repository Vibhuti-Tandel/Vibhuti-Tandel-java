/*
 [26] Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to print the area and perimeter of the rectangle respectively. Its constructor having parameters for length and breadth is used to initialize the length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its constructor having a parameter for its side (suppose s) calling the constructor of its parent class as 'super (s, s)'. Print the area and perimeter of a rectangle and a square. 
 */

package corejava;


class Rect
{
	int length,breadth;

	public Rect(int length,int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public void perimeter()
	{
		System.out.println("Perimeter of rectangle: "+(2*(length+breadth)));
	}

	public void area()
	{
		System.out.println("Area of rectangle: "+(length*breadth));
	}
}

class Square extends Rect{

	public Square(int length, int breadth) {
		super(length, breadth);
		System.out.println("Perimeter of sqaure: "+(4*length));
		System.out.println("Area of square: "+(length*length));
	}
}

public class M26_Rectangle {

	public static void main(String[] args) {
		Square s = new Square(6, 5);
		s.perimeter();
		s.area();
	}
}
