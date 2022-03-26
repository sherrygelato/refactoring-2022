package code.refactoring.complex_32;

public class RegularPrice extends PriceType {

	@Override
	double getRentalCharge(int dayRented) {
		thisAmount += 2;
		if(dayRented > 2)
			thisAmount += (dayRented-2) * 1.5;
		
		System.out.println("thisAmount --> " + thisAmount );
		return thisAmount;
	}

}
