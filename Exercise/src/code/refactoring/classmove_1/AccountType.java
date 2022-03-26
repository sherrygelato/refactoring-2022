package code.refactoring.classmove_1;

public class AccountType {

	public boolean isPremium() {
		// TODO Auto-generated method stub
		return true;
	}

	// 이게 잘못 사용된 것 Account.java에서 가져옴
	public double overdraftCharge(int _daysOverdrawn) {
		
		if (isPremium()) {
			double result = 10;
			if(_daysOverdrawn > 7) result += (_daysOverdrawn - 7) *0.85;
				return result;			
		}
		else return _daysOverdrawn * 1.75;
	}

}
