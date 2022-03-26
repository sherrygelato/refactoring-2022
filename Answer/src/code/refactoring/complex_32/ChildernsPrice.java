package code.refactoring.complex_32;

public class ChildernsPrice extends PriceType {

	@Override
	double getRentalCharge(int dayRented) {
		thisAmount += 1.5;
		if(dayRented > 3)
			thisAmount += (dayRented-3) * 1.5;
		return thisAmount;
	}

}
