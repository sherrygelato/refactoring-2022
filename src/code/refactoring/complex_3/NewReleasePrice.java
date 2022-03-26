package code.refactoring.complex_3;

public class NewReleasePrice extends PriceType {

    @Override
    public double getRentalCharge(int _daysRented) {
        thisAmout += (_daysRented) * 3;
        return thisAmout;
    }

    @Override
    public int getRentalPoint(int _daysRented) {
        thisRentalPoint ++;
        if (_daysRented > 1) thisRentalPoint ++;
        return thisRentalPoint;
    }
}
