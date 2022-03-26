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
		//최신물을 이틀이상 대여하면 보너스포인트 지급
		if(dayRented > 1)
			frequentRenterPoints ++;
		return frequentRenterPoints;
	}

}
