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
		String result = getName() + " ������ �뿩���\n";
		
		while (rentals.hasMoreElements()) {
			// double thisAmount = 0;
			// int thisRentalPoint = 0;
			Rental aRental = (Rental)rentals.nextElement();
			
			// ���� ������ �뿩�� ���
			double thisAmount = aRental.getRentalCharge();
			// ���� ����Ʈ�� 1 ����Ʈ ����
			int thisRentalPoint = aRental.getRentalPoint();
			
			//�̹��� �뿩�ϴ� ���������� �뿩�Ḧ ���
			result += "\t" + aRental.getMovie().getTitle()+ "\t" + String.valueOf(thisAmount) + "\n";
			//������� ������ �� �뿩��
			totalAmount += thisAmount;
			totalRentalPoint += thisRentalPoint;
			//Ǫ���� �߰�
			result += "���� �뿩��: " + String.valueOf(totalAmount) + "\n";
			result += "���� ����Ʈ: " + String.valueOf(thisRentalPoint) + "\n";
		}
		return result;
	}
}
