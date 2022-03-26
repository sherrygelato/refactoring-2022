package code.refactoring.classmove_1;

public class Account {

	private AccountType _type = new AccountType();
	private int _daysOverdrawn;
	
	public Account(int daysOverdrawn) {
		this._daysOverdrawn = daysOverdrawn;

	}
	
	public double overdraftCharge() {
		
		return _type.overdraftCharge(_daysOverdrawn);
	}
	
	double bankCharge() {
		double result = 4.5;
		if(_daysOverdrawn > 0) result += _type.overdraftCharge(_daysOverdrawn);
		return result;	
	}
}
