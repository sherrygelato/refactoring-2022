package code.refactoring.dataarrange_1;

public class IntRange {

    private int _low, _high;

    IntRange (int low, int high) {
        _low = low;
        _high = high;
    }

    boolean includes (int arg) {
        return arg >= getLow() && arg <= getHigh();
    }

    void grow(int factor) {
        setHigh (getHigh() * factor);
    }

    int getLow() {
        return _low;
    }

    int getHigh() {
        return _high;
    }

    void setLow(int arg) {
        _low = arg;
    }

    void setHigh(int arg) {
        _high = arg;
    }

}