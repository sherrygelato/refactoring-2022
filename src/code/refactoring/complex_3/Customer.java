package code.refactoring.complex_3;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
	
	private String _name;
	private Vector _rentals = new Vector();
	
	public Customer(String name) {
		_name = name;
	}
	
	public void addRental(Rental arg) {
		_rentals.addElement(arg);
	}
	
	public String getName() {
		return _name;
	}
	
	public String statement() {
		double totalAmount = 0;
		int totalRentalPoint = 0;
		Enumeration rentals = _rentals.elements();
		String result = getName() + " 고객님의 대여기록\n";
		
		while (rentals.hasMoreElements()) {
			// double thisAmount = 0;
			// int thisRentalPoint = 0;
			Rental aRental = (Rental)rentals.nextElement();
			
			// 비디오 종류별 대여료 계산
			double thisAmount = aRental.getRentalCharge();
			// 적립 포인트를 1 포인트 증가
			int thisRentalPoint = aRental.getRentalPoint();
			
			//이번에 대여하는 비디오정보와 대여료를 출력
			result += "\t" + aRental.getMovie().getTitle()+ "\t" + String.valueOf(thisAmount) + "\n";
			//현재까지 누적된 총 대여료
			totalAmount += thisAmount;
			totalRentalPoint += thisRentalPoint;
			//푸터행 추가
			result += "누적 대여료: " + String.valueOf(totalAmount) + "\n";
			result += "적립 포인트: " + String.valueOf(thisRentalPoint) + "\n";
		}
		return result;
	}
}
