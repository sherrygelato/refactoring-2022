package code.refactoring.methodsimple_7;

public class Account {
	private int _balance=100;
	
	// 미확인 예외처리
	void canWithdraw(int amount) {
		if (amount > _balance)
        	throw new IllegalArgumentException ("Amount too Large");
    	_balance -= amount;
	}

	// 확인된 예외처리
	void canWithdrawUserException(int amount) throws BalanceException {
		if (amount > _balance)
        	throw new BalanceException();
    	_balance -= amount;
	}
}
