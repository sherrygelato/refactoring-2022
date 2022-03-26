package code.refactoring.complex_3;

public class Movie {
	public static final int CHILDERNS = 2;
	public static final int REQULAR = 0;
	public static final int NEW_RELEASE = 1;
	private String _title;
	private int _priceCode;
	
	public Movie(String title, int priceCode) {
		_title = title;
		_priceCode = priceCode;
	}
	
	public int getPriceCode() {
		return _priceCode;
	}
	
	public void setPriceCode(int arg) {
		_priceCode = arg;
	}
	
	public String getTitle() {
		return _title;
	}

	double getRentalCharge(int _daysRented) {
		double thisAmount = 0;

		switch(_priceCode) {
		case REQULAR:
			thisAmount += 2;
			if(_daysRented > 2)
				thisAmount += (_daysRented-2) * 1.5;
			break;
		case NEW_RELEASE:
			thisAmount += (_daysRented) * 3;
			break;
		case CHILDERNS:
			thisAmount += 1.5;
			if(_daysRented > 3)
				thisAmount += (_daysRented-3) * 1.5;
			break;
		}
		return thisAmount;
	}

	int getRentalPoint(int _daysRented) {
		int thisRentalPoint = 0;
		thisRentalPoint ++;
		//최신물을 이틀이상 대여하면 보너스포인트 지급
		if((_priceCode == Movie.NEW_RELEASE) && _daysRented > 1)
			thisRentalPoint ++;
		return thisRentalPoint;
	}
}
