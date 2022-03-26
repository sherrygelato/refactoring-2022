package code.refactoring.methodarrange_6;

public class Account {
	
	public Account() {

	}
	
	// ? ??? ???? ??
	public int gamma (int inputVal, int quantity, int yearToDate) {
		// Gamma ??? ??? 
		Gamma gamma = new Gamma(inputVal, quantity, yearToDate, this); 
		// ??? ??, input params ??, account ?? ???(delta())

		return gamma.compute(); // ????? ??, ????? ??
	}

    int delta() {
		return 0;
	}

}
