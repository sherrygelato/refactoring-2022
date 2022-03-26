package code.refactoring.dataarrange_8;

public class Employee {
	private int _type;
	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;
	
 
    int getType() {  // step 1
        return _type;
    }
    
    static Employee create(int type) {
        switch (type) {
            case ENGINEER:
               return new Engineer();
            case SALESMAN:
               return new Salesman();
            case MANAGER:
               return new Manager();
            default:
               throw new IllegalArgumentException("Incorrect type code value");
        }
    }
    
    Employee() {}

    private Employee (int type) {
        _type = type;
    }
}
