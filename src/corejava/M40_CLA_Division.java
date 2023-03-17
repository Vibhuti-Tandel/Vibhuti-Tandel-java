/*
 [40] W.A.J. P to demonstrate try catch block, take two numbers from the user by Command line argument 
 and perform the division operation 
 and handle Arithmetic O/PException in thread main java. Lang. Arithmetic Exception:/ by 
 */

package corejava;

public class M40_CLA_Division {

	public static void main(String[] args) {
		
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		try {
			System.out.println("First number argument: "+n1);
			System.out.println("Second number argument: "+n2);
			int ans = n1/n2;
			System.out.println("Division: "+ans);
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero");
			e.printStackTrace();
		}
	}
}
