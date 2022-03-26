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
	
	public double getTotalRentalCharge() {
		double totalAmount = 0;
		Enumeration rentals = _rentals.elements();

		while (rentals.hasMoreElements()) {
			Rental aRental = (Rental)rentals.nextElement();
			
			// ���� ������ �뿩�� ���
			double thisAmount = aRental.getRentalCharge();
			totalAmount += thisAmount;
		}
		return totalAmount;
	}

	public int getTotalRentalPoint() {
		int totalRentalPoint = 0;
		Enumeration rentals = _rentals.elements();
		
		while (rentals.hasMoreElements()) {
			Rental aRental = (Rental)rentals.nextElement();
			
			// ���� ����Ʈ�� 1 ����Ʈ ����
			int thisRentalPoint = aRental.getRentalPoint();
			
			totalRentalPoint += thisRentalPoint;
		}
		return totalRentalPoint;
	}

	// ���
	public String statement() {
		Enumeration rentals = _rentals.elements();
		String result = getName() + " ������ �뿩���\n";
		
		while (rentals.hasMoreElements()) {
			Rental aRental = (Rental)rentals.nextElement();

			//�̹��� �뿩�ϴ� ���������� �뿩�Ḧ ���
			result += "\t" + aRental.getMovie().getTitle()+ "\t" + String.valueOf(aRental.getRentalCharge()) + "\n";
			// //Ǫ���� �߰�
			// result += "���� �뿩��: " + String.valueOf(getTotalRentalCharge()) + "\n";
			// result += "���� ����Ʈ: " + String.valueOf(getTotalRentalPoint()) + "\n";
		}
		return result;
	}
}
