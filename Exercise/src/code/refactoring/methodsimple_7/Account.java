package code.refactoring.methodsimple_7;

public class Account {
	private int _balance=100;
	
	void canWithdraw(int amount) {
		if (amount > _balance)
//        	return -1;
			throw new IllegalArgumentException("Amount Too Large");
		_balance -= amount;
	}

}
