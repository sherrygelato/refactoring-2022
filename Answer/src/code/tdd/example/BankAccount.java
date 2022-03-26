package code.tdd.example;

public class BankAccount {
	
	private int balance;

	public BankAccount(int initMoney) {
		this.balance = initMoney;
	}

	public int getBalance() {
		return this.balance;
	}

	public void deposit(int money) {
		this.balance += money;
		
	}

	public void withdraw(int money) {
		this.balance -= money;
		
	}
	
}
  