/*
 [31] We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects (each out of 100) by student B. Create an abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students. The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. Create an object for each of the two classes and print the percentage of marks for both the students. 
 */

package corejava;

abstract class Marks
{
	public abstract void getPercentage();
}

class StudentA extends Marks
{
	float m1,m2,m3;
	
	public StudentA(float m1,float m2,float m3)
	{
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}

	@Override
	public void getPercentage() {
		// TODO Auto-generated method stub
		float per;
		per =  (m1+m2+m3)/3;
		System.out.println("Percentage of Student A is: "+per);
	}
}

class StudentB extends Marks
{
	float m1,m2,m3,m4;
	
	public StudentB(float m1,float m2,float m3,float m4)
	{
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.m4 = m4;
	}
	
	@Override
	public void getPercentage() {
		// TODO Auto-generated method stub
		float per;
		per = (m1+m2+m3+m4)/4;
		System.out.println("Percentage of Student B is: "+per);
	}
	
}

public class M31_Percentage {

	public static void main(String[] args) {
		
		StudentA a = new StudentA(89, 77, 69);
		a.getPercentage();
		StudentB b = new StudentB(90, 61, 66, 78);
		b.getPercentage();
	}
}
