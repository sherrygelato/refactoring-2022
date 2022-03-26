package code.refactoring.dataarrange_9;

public class Engineer extends EmployeeType{

    @Override
    public int payAmount() {
        return _monthlySalary;
    }
    
}
