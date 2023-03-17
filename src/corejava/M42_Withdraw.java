/*
 [42] W.A.J.P to create a custom exception if Customer withdraw amount which is greater than account balance then program will show custom exception otherwise amount will deduct from account balance. 
 Account balance is: 2000 Enter withdraw amount: 2500 Sorry, insufficient balance, you need more 500 Rs. 
 To perform this transaction. 
 */

package corejava;

import java.util.Scanner;

class InvalidWithdrawal extends Exception
{
	public InvalidWithdrawal(String str)
	{
		super(str);
	}
}

public class M42_Withdraw {

	public static void withdrawRs(int balance,int withdraw) throws InvalidWithdrawal
	{
		if(withdraw > balance)
		{
			int extra = withdraw-balance;
			throw new InvalidWithdrawal("\nSorry insufficient balance, you need more "+extra+" Rs to perform this transaction");
		}
		else
		{
			balance = balance - withdraw;
			System.out.println("Balance after withdrawal: "+balance);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int balance = 5000;
		System.out.println("Account Balance is: "+balance);
		try {
			
			int withdraw;
			System.out.println("Enter withdraw amount: ");
			withdraw = sc.nextInt();
			withdrawRs(balance, withdraw);
			
		} catch (InvalidWithdrawal e) {
			System.out.println("\nException Occured..."+"\n"+e);
		}
	}
}
