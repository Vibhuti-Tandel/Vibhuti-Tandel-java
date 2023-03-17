/*
 [35] Create a class named 'Shape' with a method to print "This is this is shape". 
 Then create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both having a method to print "This is rectangular shape" and "This is circular shape" respectively. 
 Create a subclass 'Square' of 'Rectangle' having a method to print "Square is a rectangle". 
 Now call the method of 'Shape' and 'Rectangle' class by the object of 'Square' class. 
 */

package corejava;

class Shape35
{
	public void printShape()
	{
		System.out.println("This is shape");
	}
}

class Rectangle35 extends Shape35
{
	public void rectShape()
	{
		System.out.println("This is rectangular shape");
	}
}

class Circle35 extends Shape35
{
	public void circleShape()
	{
		System.out.println("This is circular shape");
	}
}

class Sqaure35 extends Rectangle35
{
	public void sqaureShape()
	{
		System.out.println("Sqaure is Rectangle");
	}
}

public class M35_Shape {

	public static void main(String[] args) {
		
		Sqaure35 s = new Sqaure35();
		s.printShape();
		s.rectShape();
	}
}
