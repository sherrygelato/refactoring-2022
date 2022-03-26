package code.refactoring.complex_32;

public class Movie {
	public static final int CHILDERNS = 2;
	public static final int REQULAR = 0;
	public static final int NEW_RELEASE = 1;
	private String _title;
	private int _priceCode;
	private PriceType _priceType;
	
	public Movie(String title, int priceCode) {
		_title = title;
		//_priceCode = priceCode;
		setPriceCode(priceCode);
	}
	
	public int getPriceCode() {
		return _priceCode;
	}
	
//	public void setPriceCode(int arg) {
//		_priceCode = arg;
//	}
	
	public String getTitle() {
		return _title;
	}

	double getRentalCharge(int daysRented) {
		System.out.println("daysRented --> " + daysRented );
		return _priceType.getRentalCharge(daysRented);
	}

	private void setPriceCode(int priceCode) {
		switch(priceCode) {
		case Movie.REQULAR:
			_priceType = new RegularPrice();
			break;
		case Movie.NEW_RELEASE:
			_priceType = new NewReleasePrice();
			break;
		case Movie.CHILDERNS:
			_priceType = new ChildernsPrice();
			break;
		}
	}

	int getRentalPoints(int daysRented) {
		return _priceType.getRentalPoint(daysRented);
	}
}
