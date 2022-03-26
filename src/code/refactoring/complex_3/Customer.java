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
			int thisRentalPoint = 0;
			Rental aRental = (Rental)rentals.nextElement();
			
			// ���� ������ �뿩�� ���
			double thisAmount = aRental.getRentalCharge();
			// ���� ����Ʈ�� 1 ����Ʈ ����
			thisRentalPoint ++;
			//�ֽŹ��� ��Ʋ�̻� �뿩�ϸ� ���ʽ�����Ʈ ����
			if((aRental.getMovie().getPriceCode() == Movie.NEW_RELEASE) && aRental.getDaysRented() > 1)
			thisRentalPoint ++;
			
			//�̹��� �뿩�ϴ� ���������� �뿩�Ḧ ���
			result += "\t" + aRental.getMovie().getTitle()+ "\t" + String.valueOf(thisAmount) + "\n";
			//������� ������ �� �뿩��
			totalAmount += thisAmount;
			//Ǫ���� �߰�
			result += "���� �뿩��: " + String.valueOf(totalAmount) + "\n";
			result += "���� ����Ʈ: " + String.valueOf(thisRentalPoint) + "\n";
		}
		return result;
	}
}
