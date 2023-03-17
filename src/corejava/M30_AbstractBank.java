/*
 [30] Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'. Call this method by creating an object of each of the three classes. 
 */

package corejava;

abstract class Bank{
	
	public abstract void getBalance();
}

class BankA extends Bank
{

	@Override
	public void getBalance() {
		// TODO Auto-generated method stub
		System.out.println("Balance in Bank A is $100");
	}
	
}

class BankB extends Bank
{

	@Override
	public void getBalance() {
		// TODO Auto-generated method stub
		System.out.println("Balance in Bank B is $150");
	}
	
}

class BankC extends Bank
{

	@Override
	public void getBalance() {
		// TODO Auto-generated method stub
		System.out.println("Balance in Bank C is $200");
	}
	
}

public class M30_AbstractBank {

	public static void main(String[] args) {
		BankA a = new BankA();
		a.getBalance();
		BankB b = new BankB();
		b.getBalance();
		BankC c = new BankC();
		c.getBalance();
	}
}
