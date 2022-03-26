package code.refactoring.complex_3;

import java.util.Enumeration;
import java.util.Vector;

public class HtmlStatement extends Statement {
	
	private Vector _rentals = new Vector();
	private String _name;
	
	public String statement() {
		String result = "<H1><EM>" + getName() + " �������� �뿩 ���  </EM></H1><P>\n";
		Enumeration rentals = _rentals .elements();
		
		while(rentals.hasMoreElements()) {
			Rental each = (Rental)rentals.nextElement();
			// �̹��� �뿩�ϴ� ���� ������ �뿩�Ḧ ���
			result += each.getMovie().getTitle()+ ": " + String.valueOf(each.getCharge()) + "<BR>\n";
		}
		
		result += "<P>���� �뿩��: <EM>" + String.valueOf(getTotalCharge()) + "</EM><P>\n";
		result += "<P>���� ����Ʈ: <EM>" + String.valueOf(getTotalFrequentRenterPoints()) + "</EM><P>\n";
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