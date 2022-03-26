package code.refactoring.classmove_2;

public class AccountType {

    // Account에서 이동, 이동 후 [소스작업]의 getter setter 잊지 말자
    private double _interestRate = 4.53;

    public double get_interestRate() {
        return _interestRate;
    }

    public void set_interestRate(double _interestRate) {
        this._interestRate = _interestRate;
    }
}
