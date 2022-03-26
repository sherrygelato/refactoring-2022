package code.refactoring.dataarrange_9;

public class Manager extends EmployeeType {
    int getTypeCode () {
        return MANAGER;
    }

	@Override
	int payAmount() {
		return _monthlySalary + _bonus;
	}
	
}
