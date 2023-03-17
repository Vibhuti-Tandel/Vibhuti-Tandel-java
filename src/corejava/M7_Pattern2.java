/*
 [7] Write a program in Java to make such a pattern like right angle triangle with number increased by 1 
 */

package corejava;

public class M7_Pattern2 {

	public static void main(String[] args) {
		 int i,j,n=1;
		 for(i=1;i<=4;i++)
		 {
			 for(j=1;j<=i;j++)
			 {
				 System.out.print((n++)+" ");
			 }
			 System.out.println("");
		 }
	}
}
