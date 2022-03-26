package code.refactoring.complex_31;

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
		String result = getName() + " ������ �뿩���\n";
		
		while (rentals.hasMoreElements()) {
			Rental each = (Rental)rentals.nextElement();
		
			//�̹��� �뿩�ϴ� ���������� �뿩�Ḧ ���
			result += "\t" + each.getMovie().getTitle()+ "\t" + String.valueOf(each.getRentalCharge()) + "\n";
			//Ǫ���� �߰�
			result += "���� �뿩��: " + String.valueOf(getTotalCharge()) + "\n";
			result += "���� ����Ʈ: " + String.valueOf(getTotalFrequentRentPoint()) + "\n";
			//return result;
		}
		return result;
	}
	
	private int getTotalFrequentRentPoint() {
		int frequentRenterPoints = 0;
		Enumeration rentals = _rentals.elements();
		
		while (rentals.hasMoreElements()) {
			Rental each = (Rental)rentals.nextElement();
			//������� ������ �� �뿩��
			frequentRenterPoints += each.getFrequentRentalPoints();
		}
		return frequentRenterPoints;
	}

	private double getTotalCharge() {
		double totalAmount = 0;
		Enumeration rentals = _rentals.elements();
		
		while (rentals.hasMoreElements()) {
			Rental each = (Rental)rentals.nextElement();
			//������� ������ �� �뿩��
			totalAmount += each.getRentalCharge();
		}
		return totalAmount;
	}
}
