package code.refactoring.methodarrange_6;

public class Gamma {

	private int _inputVal;
	private int _quantity;
	private int _yearToDate;
	private Account _account;
	
	public Gamma(int inputVal, int quantity, int yearToDate, Account account) {
		this._inputVal = inputVal;
		this._quantity = quantity;
		this._yearToDate = yearToDate;
		this._account = account;
	};
	
	public int compute() {
		int importantValue1 = (_inputVal * _quantity) + _account.delta();
		int importantValue2 = (_inputVal * _yearToDate) + 100;
		
		if ((_yearToDate - importantValue1) > 100)
			importantValue2 -= 20;
		int importantValue3 = importantValue2 * 7;
		
		//  ??
		return importantValue3 -2 * importantValue1;

	}
}
