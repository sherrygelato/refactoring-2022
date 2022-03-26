package code.refactoring.complex_32;

public class NewReleasePrice extends PriceType {

	@Override
	double getRentalCharge(int dayRented) {
		thisAmount += (dayRented) * 3;
		return thisAmount;
	}
	
	@Override
	int getRentalPoint(int dayRented) {
		frequentRenterPoints ++;
		//�ֽŹ��� ��Ʋ�̻� �뿩�ϸ� ���ʽ�����Ʈ ����
		if(dayRented > 1)
			frequentRenterPoints ++;
		return frequentRenterPoints;
	}

}
