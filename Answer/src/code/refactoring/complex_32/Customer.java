package code.refactoring.complex_32;

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
		Enumeration rentals = _rentals.elements();
		String result = getName() + " 고객님의 대여기록\n";
		
		while (rentals.hasMoreElements()) {
			Rental aRental = (Rental)rentals.nextElement();
			
			//이번에 대여하는 비디오정보와 대여료를 출력
			//result += "\t" + aRental.getMovie().getTitle()+ "\t" + String.valueOf(aRental.getRentalCharge()) + "\n";
			//현재까지 누적된 총 대여료
			//푸터행 추가
			result += "누적 대여료: " + String.valueOf(getTotalCharge()) + "\n";
			result += "적립 포인트: " + String.valueOf(getTotalRentalPoint()) + "\n";
		}

		return result;
	}
	
	public double getTotalCharge() {
		double totalAmount = 0;
		Enumeration rentals = _rentals.elements();
		
		while (rentals.hasMoreElements()) {
			Rental aRental = (Rental)rentals.nextElement();
			System.out.println("aRental --> " + aRental.getDaysRented() );
			totalAmount += aRental.getRentalCharge();
			System.out.println("totalAmount --> " + totalAmount );
		}

		return totalAmount;
	}
	
	public int getTotalRentalPoint() {
		int frequentRenterPoints = 0;
		Enumeration rentals = _rentals.elements();
		
		while (rentals.hasMoreElements()) {
			Rental aRental = (Rental)rentals.nextElement();
			// 적립 포인트를 1 포인트 증가
			frequentRenterPoints += aRental.getRentalPoints();

		}

		return frequentRenterPoints;
	}

}
