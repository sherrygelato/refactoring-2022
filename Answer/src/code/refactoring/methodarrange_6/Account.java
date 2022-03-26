package code.refactoring.methodarrange_6;

public class Account {
	
	public Account() {

	}

	public int gamma (int inputVal, int quantity, int yearToDate) {
        return new Gamma(this, inputVal, quantity, yearToDate).compute();		
	}

	public int delta() {
		return 0;
	}

}
 