package code.refactoring.general_5;

import java.util.Enumeration;
import java.util.Vector;

public class TextStatement extends Statement {
	
	private Vector _rentals = new Vector();
	private String _name;
	
	public TextStatement(String name) {
		_name = name;
	}

	public String statement() {
		String result = getName() + " 고객님의 대여 기록 \n";
		Enumeration rentals = _rentals .elements();
		
		while(rentals.hasMoreElements()) {
			Rental each = (Rental)rentals.nextElement();
			// 이번에 대여하는 비디오 정보와 대여료를 출력
			result += "\t" + each.getMovie().getTitle()+ "\t" + String.valueOf(each.getCharge()) + "\n";
		}
		
		result += "누적 대여료: " + String.valueOf(getTotalCharge()) + "\n";
		result += "적립 포인트: " + String.valueOf(getTotalFrequentRenterPoints()) + "\n";
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
