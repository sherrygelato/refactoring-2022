package code.refactoring.complex_32;

public abstract class PriceType {
	double thisAmount = 0;
	int frequentRenterPoints = 0;
	
	abstract double getRentalCharge(int dayRented);
	int getRentalPoint(int dayRented) {
		return frequentRenterPoints++;
	}

}
