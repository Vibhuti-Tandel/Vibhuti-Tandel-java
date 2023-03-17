/*
 [28] Print the sum, difference and product of two complex numbers by creating a class named 'Complex' with separate methods for each operation whose real and imaginary parts are entered by user. 
 */

package corejava;

import java.util.Scanner;

class Complex
{
	float r1,i1,r2,i2;
	public Complex(float r1,float i1,float r2,float i2)
	{
		this.r1 = r1;
		this.i1 = i1;
		this.r2 = r2;
		this.i2 = i2;
	}

	public void sum()
	{
		System.out.println("Sum of complex number: "+(r1+r2)+" + "+(i1+i2)+"i");
	}
	public void difference()
	{
		System.out.println("Difference of complex number: "+(r1-r2)+" + "+(i1-i2)+"i");
	}
	public void product()
	{
		System.out.println("Product of complex number: "+((r1*r2)-(i2*i1))+" + "+((r1*i2)+(r2*i1))+"i");
	}
}

public class M28_ComplexNumber {

	public static void main(String[] args) {

		float r1,r2,i1,i2,s,d,p;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter real part of first number: ");
		r1 = sc.nextFloat();
		System.out.println("Enter imaginary part of first number: ");
		i1 = sc.nextFloat();
		System.out.println("Enter real part of second number: ");
		r2 = sc.nextFloat();
		System.out.println("Enter imaginary part of second number: ");
		i2 = sc.nextFloat();

		Complex c = new Complex(r1, i1, r2, i2);

		System.out.println("First complex number: "+r1+" + "+i1+"i");
		System.out.println("Second complex number: "+r2+" + "+i2+"i");
		c.sum();
		c.difference();
		c.product();
	}
}
