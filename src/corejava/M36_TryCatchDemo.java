/*
 [36] W.A.J. P to demonstrate try catch block, 
 */

package corejava;

public class M36_TryCatchDemo {

	public static void main(String[] args) {
		
		try
		{
			int num[] = {11,34,67,45};
			System.out.println(num[5]);
		}
		catch (Exception e) {
			System.out.println("Something went wrong");
			e.printStackTrace();
		}
	}
}
