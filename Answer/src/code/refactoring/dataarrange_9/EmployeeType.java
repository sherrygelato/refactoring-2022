package code.refactoring.dataarrange_9;

abstract class EmployeeType {

    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;
    int  _monthlySalary=1, _commission=1,  _bonus=1;
	
	abstract int getTypeCode();
	abstract int payAmount();
	
    public static EmployeeType setType(int arg) {
        switch (arg) {
            case ENGINEER:
               return new Engineer();
            case SALESMAN:
              return new Salesman();
            case MANAGER:
               return new Manager();
            default:
               throw new IllegalArgumentException("Incorrect Employee Code");
        }
    }
}
