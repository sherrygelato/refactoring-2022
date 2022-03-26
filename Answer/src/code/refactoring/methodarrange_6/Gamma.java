package code.refactoring.methodarrange_6;

public class Gamma {
	private final Account account;
	private int inputVal;
	private int quantity;
	private int yearToDate;

	// 1. ������ �ۼ�
	public Gamma(Account account, int inputVal, int quantity, int yearToDate) {
		this.account = account;
		this.inputVal = inputVal;
		this.quantity = quantity;
		this.yearToDate = yearToDate;
	}
	
	// 2. �޼��� �̵�
	int compute() {
		int importantValue1 = (inputVal * quantity) + account.delta();
		int importantValue2 = (inputVal * yearToDate) + 100;
		
//		importantThing();
		int importantValue3 = importantValue2 * 7;
		
		//  �߷�...		
		
		return importantValue3 -2 * importantValue1;
	}
	
//	void importantThing() {
//		if ((yearToDate - importantValue1) > 100)
//			importantValue2 -= 20;		
//	}
}