/*
 [24] Create a class with a method that prints "This is a parent class" and its subclass with another method that prints "This is child class". Now, create an object for each of the class and call 1 - method of parent class by object of parent class 2 - method of child class by object of child class 3 - method of parent class by object of child class 
 */

package corejava;

class Pr1
{
	public void parentMethod()
	{
		System.out.println("This is a parent class");
	}
}

class Child extends Pr1
{
	public void childMethod()
	{
		System.out.println("This is a child class");
	}
}

public class M24_ParentChild {

	public static void main(String[] args) {
		Pr1 p = new Pr1();
		Child c = new Child();
		p.parentMethod();
		c.childMethod();
		c.parentMethod();
	}
}
