package code.refactoring.complex_3;

public class Rental {
	private Movie _movie;
	private int _daysRented;
	private Rental aRental;
	
	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}
	
	public int getDaysRented() {
		return _daysRented;
	}
	
	public Movie getMovie() {
		return _movie;
	}

	double getRentalCharge() {
		double thisAmount = 0;

		switch(aRental.getMovie().getPriceCode()) {
		case Movie.REQULAR:
			thisAmount += 2;
			if(aRental.getDaysRented() > 2)
				thisAmount += (aRental.getDaysRented()-2) * 1.5;
			break;
		case Movie.NEW_RELEASE:
			thisAmount += (aRental.getDaysRented()) * 3;
			break;
		case Movie.CHILDERNS:
			thisAmount += 1.5;
			if(aRental.getDaysRented() > 3)
				thisAmount += (aRental.getDaysRented()-3) * 1.5;
			break;
		}
		return thisAmount;
	}
}
