package org.bank;

public class AxisBank extends BankInfo {
	public void deposit(double deposite ) {
		System.out.println("New Deposit Amount is;"+deposite);
		super.deposit(10000.00);

	}
	public static void main(String[] args) {
		BankInfo a=new BankInfo();
		a.savings(1245);
		a.deposit(5000);
		a.deposit(10000);
	}

}
