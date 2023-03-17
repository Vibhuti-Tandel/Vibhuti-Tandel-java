/*
 [29] Create an abstract class 'Parent' with a method 'message'. It has two subclasses each having a method with the same name 'message' that prints "This is first subclass" and "This is second subclass" respectively. Call the methods 'message' by creating an object for each subclass. 
 */

package corejava;

abstract class Parent
{
	public abstract void message();
}

class First extends Parent
{

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("This is first subclass");
	}

}

class Second extends Parent
{

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("This is second subclass");
	}

}

public class M29_AbstractParent {

	public static void main(String[] args) {

		First f = new First();
		f.message();

		Second s = new Second();
		s.message();
	}
}
