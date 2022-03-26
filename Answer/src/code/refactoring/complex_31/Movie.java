package code.refactoring.complex_31;

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
	
	public double getRentalCharge(int daysRented) {
		double thisAmount = 0;
		
		switch(getPriceCode()) {
		case REQULAR:
			thisAmount += 2;
			if(daysRented > 2)
				thisAmount += (daysRented-2) * 1.5;
			break;
		case NEW_RELEASE:
			thisAmount += (daysRented) * 3;
			break;
		case CHILDERNS:
			thisAmount += 1.5;
			if(daysRented > 3)
				thisAmount += (daysRented-3) * 1.5;
			break;
		}
		return thisAmount;
	}
	
	public int getFrequentRentalPoints(int daysRented) {
		int frequentRenterPoints = 0;
		// 적립 포인트를 1 포인트 증가
		frequentRenterPoints ++;
		//최신물을 이틀이상 대여하면 보너스포인트 지급
		if((getPriceCode() == NEW_RELEASE) && daysRented > 1)
			frequentRenterPoints ++;
		return frequentRenterPoints;
	}
}
