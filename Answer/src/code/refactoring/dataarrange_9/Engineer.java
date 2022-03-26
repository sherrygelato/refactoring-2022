package code.refactoring.dataarrange_9;

public class Engineer extends EmployeeType {
    int getTypeCode () {
        return ENGINEER;
    }

	@Override
	int payAmount() {
		return _monthlySalary;
	}
	
}
