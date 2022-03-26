package code.refactoring.complex_3;

public class Movie {
	private String _title;
	private PriceType _priceType;
	
	public Movie(String title, int priceCode) {
		_title = title;
		this._priceType = PriceType.setPriceCode(priceCode);
	}
	
	public String getTitle() {
		return _title;
	}

	double getRentalCharge(int _daysRented) {
		return _priceType.getRentalCharge(_daysRented);
	}

	int getRentalPoint(int _daysRented) {
		return _priceType.getRentalPoint(_daysRented);
	}
}
