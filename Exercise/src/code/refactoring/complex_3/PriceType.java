package code.refactoring.complex_3;

public abstract class PriceType {

    public static final int CHILDERNS = 2;
	public static final int REQULAR = 0;
	public static final int NEW_RELEASE = 1;
    double thisAmout = 0;
    int thisRentalPoint = 0;

    public static PriceType setPriceCode(int priceCode) {

        switch(priceCode) {
		case REQULAR:
			return new RegularPrice();
		case NEW_RELEASE:
            return new NewReleasePrice();
		case CHILDERNS:
            return new ChildrenPrice();
        default:
            throw new IllegalArgumentException("Incorrect Price Type");
		}
    }

    public abstract double getRentalCharge(int _daysRented);

    public int getRentalPoint(int _daysRented) {
        thisRentalPoint ++;
        return thisRentalPoint;
    }

}
