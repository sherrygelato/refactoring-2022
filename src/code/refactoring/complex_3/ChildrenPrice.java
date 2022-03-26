package code.refactoring.complex_3;

public class ChildrenPrice extends PriceType {

    @Override
    public double getRentalCharge(int _daysRented) {
        thisAmout += 1.5;
        return thisAmout;
    }
}
