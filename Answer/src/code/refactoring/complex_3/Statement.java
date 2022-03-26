package code.refactoring.complex_3;

import java.util.Enumeration;

public abstract class Statement {
	
	abstract String headerString(Customer aCustomer);
	abstract String eachRentalString(Rental aRental);
	abstract String footerString(Customer aCustomer);
	
	public String value(Customer aCustomer) {
		
		Enumeration rentals = aCustomer.getRentals();
		String result = headerString(aCustomer);
		
		while(rentals.hasMoreElements()) {
			Rental each = (Rental)rentals.nextElement();
			result += eachRentalString(each);
		}
		
		result += footerString(aCustomer);

		return result;
	}

}
