package code.refactoring.classmove_1;

public class AccountType {

	public boolean isPremium() {
		// TODO Auto-generated method stub
		return true;
	}
	
	public double overdraftCharge(int _daysOverdrawn) {
		
		if (isPremium()) {
			double result = 10;
			if(_daysOverdrawn > 7) result += (_daysOverdrawn - 7) *0.85;
				return result;			
		}
		else return _daysOverdrawn * 1.75;
	}

}
