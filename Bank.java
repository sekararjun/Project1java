/*
 3. Write a program to simulate a Bank account with Deposit and Withdraw methods.
 */
package oops;

class Banking{
	int accountNo;
	String name;
	int balance;
	int withdraw;
	public void deposit(int amount) {
		
		balance+=amount;
		System.out.println(amount +" is deposit to your bank Account no "+accountNo);
		System.out.println("Your account balance is "+balance);
	}
	public void withdraw(int withdrawAmount) {
		balance-=withdrawAmount;
		System.out.println( withdrawAmount+" is deposit to your bank Account no "+accountNo);
		System.out.println("Your account balance is "+balance);
	}
}


public class Bank {
 public static void main(String[] args) {
	 Banking sekar=new Banking();
	 sekar.accountNo=1000020773;
	 sekar.balance=10000;
	 sekar.name="ak";
	
	 sekar.deposit(10000);
	 sekar.withdraw(5000);
 }
}
