package code.refactoring.dataarrange_2;

public class Order {
	
	// private String _customer;
	private Customor _customor;
	
	public Order (String customer) {
		_customor = new Customor(_customor);
	}
	
	public String getCustomerName() {
		return _customor.get_customer();
	}

	public void setCustomer(String arg) {
		_customor = new Customor(_customor);
	}
	
}
