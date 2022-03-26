package code.refactoring.classmove_2;

public class Account {
	
	   private AccountType _type = new AccountType();
	   
		public Account(double rate) {
			setInterestRate(rate);
		}
	    
	    double interestForAmount_days (double amount, int days) {
	        return getInterestRate() * amount * days / 365;
	    }

	    private void setInterestRate (double arg) {
	    	_type.setInterestRate( arg );
	    }

	    private double getInterestRate () {
	        return _type.getInterestRate ();
	    }
}
