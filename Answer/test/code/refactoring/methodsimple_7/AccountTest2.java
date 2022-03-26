package code.refactoring.methodsimple_7;

public class AccountTest2 {
	public static void main(String[] args) { 
		 
		Account account= new Account();
		int amount = 150;

		try {
			account.canWithdrawUserException(amount);
			doTheUsualThing();
		} catch (BalanceException e) {
			System.out.println( "Exception -->" + e); 
			handleOverdrawn();
		}		
	}

	private static void doTheUsualThing() {
		System.out.println( "doTheUsualThing() -->" ); 
		
	}

	private static void handleOverdrawn() {
		System.out.println( "handleOverdrawn() -->" ); 
		
	}

}
