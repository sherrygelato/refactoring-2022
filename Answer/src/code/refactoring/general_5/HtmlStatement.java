package code.refactoring.general_5;

import java.util.Enumeration;
import java.util.Vector;

public class HtmlStatement extends Statement {
	
	private Vector _rentals = new Vector();
	private String _name;
	
	public String statement() {
		String result = "<H1><EM>" + getName() + " 고객님의 대여 기록  </EM></H1><P>\n";
		Enumeration rentals = _rentals .elements();
		
		while(rentals.hasMoreElements()) {
			Rental each = (Rental)rentals.nextElement();
			// 이번에 대여하는 비디오 정보와 대여료를 출력
			result += each.getMovie().getTitle()+ ": " + String.valueOf(each.getCharge()) + "<BR>\n";
		}
		
		result += "<P>누적 대여료: <EM>" + String.valueOf(getTotalCharge()) + "</EM><P>\n";
		result += "<P>적립 포인트: <EM>" + String.valueOf(getTotalFrequentRenterPoints()) + "</EM><P>\n";
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
