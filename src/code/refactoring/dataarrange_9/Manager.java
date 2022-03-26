package code.refactoring.dataarrange_9;

public class Manager extends EmployeeType {

    @Override
    public int payAmount() {
        return _monthlySalary + _bonus;
    }
    
}
