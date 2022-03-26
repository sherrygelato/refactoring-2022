package code.refactoring.dataarrange_9;

public class SalesMan extends EmployeeType {

    @Override
    public int payAmount() {
        return _monthlySalary + _commission;
    }
    
}
