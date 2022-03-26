package code.refactoring.complex_3;

public class NewReleasePrice extends Price {
	int getPriceCode() {
		return Movie.NEW_RELEASE;
	}
	
	double getCharge(int daysRented) {
		
		return (daysRented) * 3;
	}
	
	int getFrequentRentalPoints(int daysRented) {
		
		//최신물을 이틀이상 대여하면 보너스포인트 지급
		if(daysRented > 1)
			return 2;
		else
			return 1;
	}

}
