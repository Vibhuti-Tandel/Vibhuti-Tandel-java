/*
 [39] W.A.J. P to implement the above program (pro.no-B27) using nesting of try-catch block. 
 try { try {//code} catch (Exception e) {//code} catch (Exception e) {//code} 
 */

package corejava;

public class M39 {

	public static void main(String[] args) {
		
		try {
			
			int a[] = new int[5];
			try {
				
				for(int i=0;i<a.length;i++)
				{
					a[i] = 100/i;
					System.out.println("100 divide by "+i+" is: "+a[i]);
				}
			} catch (ArithmeticException e) {
				System.out.println("\nCannot divide by zero");
				e.printStackTrace();
			}
			
			for(int i=1;i<=a.length;i++)
			{
				a[i] = 100/i;
				System.out.println("100 divide by "+i+" is: "+a[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\nArray index is out of bound");
			e.printStackTrace();
		}
	}
}
