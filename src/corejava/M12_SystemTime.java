/*
 [12] Write a Java program to display the system time. 
 */

package corejava;

public class M12_SystemTime {

	public static void main(String[] args) {
		
		System.out.println("System time: "+ java.time.LocalTime.now());
	}
}
