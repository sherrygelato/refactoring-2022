package code.refactoring.dataarrange_2;

public class Customer {
    
	private final String _name;	// Order Ŭ������ ���� String �Ӽ��� ����ϰ� �־ final �� ������

	public Customer (String name) {
        _name = name;
    }
    public String getName() {
        return _name;
    }
    
}
