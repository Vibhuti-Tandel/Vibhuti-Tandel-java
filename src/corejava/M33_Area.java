/*
 [33] We have to calculate the area of a rectangle, a square and a circle. 
 Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each. 
 The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' is its radius. 
 Now create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of rectangle, square and circle respectively. 
 Create an object of class 'Area' and call all the three methods.
 */

package corejava;

abstract class Shape
{
	public abstract void rectangleArea(float length,float breadth);
	public abstract void squareArea(float side);
	public abstract void circleArea(float radius);
}

class Area33 extends Shape
{

	@Override
	public void rectangleArea(float length, float breadth) {
		// TODO Auto-generated method stub
		float ra = length*breadth;
		System.out.println("Area of Rectangle: "+ra);
	}

	@Override
	public void squareArea(float side) {
		// TODO Auto-generated method stub
		float sa = side*side;
		System.out.println("Area of Sqaure: "+sa);
	}

	@Override
	public void circleArea(float radius) {
		// TODO Auto-generated method stub
		double ca = (3.14)*(radius*radius);
		System.out.println("Area of Circle: "+ca);
	}
	
}

public class M33_Area {

	public static void main(String[] args) {
		
		Area33 a1 = new  Area33();
		a1.rectangleArea(12, 25);
		a1.squareArea(13);
		a1.circleArea(4);
	}
}
