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
		int frequentRenterPoints = 0;
		Enumeration rentals = _rentals.elements();
		String result = getName() + " ������ �뿩���\n";
		
		while (rentals.hasMoreElements()) {
			double thisAmount = 0;
			Rental each = (Rental)rentals.nextElement();
			
			// ���� ������ �뿩�� ����Լ� ȣ��
			//thisAmount = each.getCharge();	//Refactoring 01
			frequentRenterPoints += each.getFrequentRentalPoints();
			
			//�̹��� �뿩�ϴ� ���������� �뿩�Ḧ ���
			result += "\t" + each.getMovie().getTitle()+ "\t" + String.valueOf(each.getCharge()) + "\n";
			//������� ������ �� �뿩��
			totalAmount += each.getCharge();
		}
		//Ǫ���� �߰�
		result += "���� �뿩��: " + String.valueOf(totalAmount) + "\n";
		result += "���� ����Ʈ: " + String.valueOf(frequentRenterPoints) + "\n";
		return result;
	}
	
	public String htmlStatement() {
		return new HtmlStatement().value(this);
	}
	
	public String textStatement() {
		return new TextStatement().value(this);
	}

}
