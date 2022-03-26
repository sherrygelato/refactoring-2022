package code.refactoring.dataarrange_3;

public class Order {
	
	private Customer _customer;
	
	// 하나의 Cusomer 객체만 사용하게끔 수정  (개념상 동일한 고객에 주문이 여러개 있을 경우) 
	public Order (String customerName) {
		_customer = Customer.create(customerName);
	}
	public String getCustomerName() {
	    return _customer.getName();
	}
	
}
