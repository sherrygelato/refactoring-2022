package code.refactoring.complex_3;

import java.util.Enumeration;
import java.util.Vector;

public class TextStatement extends Statement {
	
	private Vector _rentals = new Vector();
	private String _name;
	
	public String statement() {
		String result = getName() + " �������� �뿩 ��� \n";	// headerString
		Enumeration rentals = _rentals .elements();
		
		while(rentals.hasMoreElements()) {
			Rental each = (Rental)rentals.nextElement();
			// �̹��� �뿩�ϴ� ���� ������ �뿩�Ḧ ���
			result += "\t" + each.getMovie().getTitle()+ "\t" + String.valueOf(each.getCharge()) + "\n";  // eachRentalString
		}
		
		//  footerString
		result += "���� �뿩��: " + String.valueOf(getTotalCharge()) + "\n";
		result += "���� ����Ʈ: " + String.valueOf(getTotalFrequentRenterPoints()) + "\n";
		return result;
	}

	private char[] getTotalFrequentRenterPoints() {
		return null;
	}

	private char[] getTotalCharge() {
		return null;
	}

	private String getName() {
		return _name;
	}

	@Override
	String headerString(Customer aCustomer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String eachRentalString(Rental aRental) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String footerString(Customer aCustomer) {
		// TODO Auto-generated method stub
		return null;
	}

}