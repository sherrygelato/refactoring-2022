package code.refactoring.dataarrange_9;

public class Salesman extends EmployeeType {
    int getTypeCode () {
        return SALESMAN;
    }

	@Override
	int payAmount() {
		return _monthlySalary + _commission;
	}
}
