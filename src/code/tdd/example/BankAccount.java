package code.tdd.example;

public class BankAccount {
	private int balance;

	public BankAccount(int initMoney) {
		// TODO Auto-generated constructor stub
		this.balance = initMoney;
	}

	public int getBalance() {
		// TODO Auto-generated method stub
		return this.balance;
		
	}

	public int deposit(int money) {
		// TODO Auto-generated method stub
		return this.balance += money;
		
	}

	public int withdraw(int money) {
		// TODO Auto-generated method stub
		return this.balance -= money;
		
	}
	
	

}
  