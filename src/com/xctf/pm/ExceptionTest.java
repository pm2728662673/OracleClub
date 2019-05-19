package com.xctf.pm;

public class ExceptionTest {
	public static void main(String[] args) {
		Account a = new Account();
		a.deposit(5000);		
		try{
			a.withdraw(10001);
			System.out.println(a.getBalance());
		}catch (OverdraftException o) {
			System.out.println("Exception throw:" + o);
		}
	}
}

class Account {
	private double balance = 5000;
	private double amount;
	private double res;
	private double deficit = res - balance;
	
	public double getDeficit() {
		return deficit;
	}
	
	public double getRes() {
		return res;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public double deposit(double amount) {
		return res = balance + amount;
	}
	
	public void withdraw(double number) throws OverdraftException{
		if(res - number < 0) {
			throw new OverdraftException();
		}
	}
	
	public double getBalance() {
		return balance = deficit;
	}

}

class OverdraftException extends Exception {
	/**
	 * com.xctf.pm
	 */
	private static final long serialVersionUID = 1L;
	private double deficit;
	
	public OverdraftException() {
		
	}
	
	public OverdraftException(double deficit) {
		this.deficit = deficit;
	}
	public double getDeficit() {
		return deficit;
	}

	public void setDeficit(double deficit) {
		this.deficit = deficit;
	}	
}