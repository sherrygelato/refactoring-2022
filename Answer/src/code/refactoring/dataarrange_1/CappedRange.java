package code.refactoring.dataarrange_1;

public class CappedRange extends IntRange {

    private int _cap;

	CappedRange (int low, int high, int cap) {
        super (low, high);
        _cap = cap;
    }

    int getCap() {
        return _cap;
    }

    @Override
    int getHigh() {
        return Math.min(super.getHigh(), getCap());
    }
}
