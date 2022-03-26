package code.refactoring.general_2;

public class JobItem {
	

	private int _unitPrice;
	private int _quantity;

	public JobItem(int unitPrice, int quantity) {
		_unitPrice = unitPrice;
		_quantity = quantity;
	}
	public int getQuantity() {
		return _quantity;
	}
	public int getTotalPrice() {
		return getUnitPrice() * _quantity;
	}
//	protected boolean isLabor() {
//		return false;
//	}
//	
	public int getUnitPrice() {
		return _unitPrice;
	}
	

}
