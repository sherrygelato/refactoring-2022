package code.refactoring.methodsimple_7;

public class Account {
	private int _balance=100;
	
	// ��Ȯ�� ����ó��
	void canWithdraw(int amount) {
		if (amount > _balance)
        	throw new IllegalArgumentException ("Amount too Large");
    	_balance -= amount;
	}

	// Ȯ�ε� ����ó��
	void canWithdrawUserException(int amount) throws BalanceException {
		if (amount > _balance)
        	throw new BalanceException();
    	_balance -= amount;
	}
}
