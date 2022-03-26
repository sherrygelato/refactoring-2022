package code.refactoring.complex_32;

public class Rental {
	private Movie _movie;
	private int _daysRented;
	
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
		return _movie.getRentalCharge(_daysRented);
	}

	int getRentalPoints() {
		return _movie.getRentalPoints(_daysRented);
	}
}
