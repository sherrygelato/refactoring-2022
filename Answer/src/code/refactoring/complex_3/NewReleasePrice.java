package code.refactoring.complex_3;

public class NewReleasePrice extends Price {
	int getPriceCode() {
		return Movie.NEW_RELEASE;
	}
	
	double getCharge(int daysRented) {
		
		return (daysRented) * 3;
	}
	
	int getFrequentRentalPoints(int daysRented) {
		
		//�ֽŹ��� ��Ʋ�̻� �뿩�ϸ� ���ʽ�����Ʈ ����
		if(daysRented > 1)
			return 2;
		else
			return 1;
	}

}
