package code.refactoring.dataarrange_3;

public class Order {
	
	private Customer _customer;
	
	// �ϳ��� Cusomer ��ü�� ����ϰԲ� ����  (����� ������ ���� �ֹ��� ������ ���� ���) 
	public Order (String customerName) {
		_customer = Customer.create(customerName);
	}
	public String getCustomerName() {
	    return _customer.getName();
	}
	
}
