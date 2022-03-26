package code.refactoring.dataarrange_2;

public class Customer {
    
	private final String _name;	// Order 클래스가 현재 String 속성을 사용하고 있어서 final 로 선언함

	public Customer (String name) {
        _name = name;
    }
    public String getName() {
        return _name;
    }
    
}
