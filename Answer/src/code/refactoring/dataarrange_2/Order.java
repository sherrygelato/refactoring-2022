package code.refactoring.dataarrange_2;

public class Order {
	
	private Customer _customer;
	
	public Order (String customerName) {
	    _customer = new Customer(customerName);
	}
	public String getCustomerName() {
	    return _customer.getName();
	}
	
	public void setCustomer(String customerName) {
	    _customer = new Customer(customerName);
	}
	
	
}
