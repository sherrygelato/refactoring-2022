package code.refactoring.methodarrange_2;

public class Price {
	
	private int _quantity;
	private int _itemPrice;
	
	public Price(int quantity, int itemPrice) {
		this._quantity = quantity;
		this._itemPrice = itemPrice;
	}

	public double getPrice() {
		return basePrice() * discountFactor();
	}

	// 2��
	private double discountFactor() {
		if(basePrice() > 1000) 
			return 0.95;
		else 
			return 0.98;
	}
    //  1���۾�
	private int basePrice() {
		return _quantity * _itemPrice;
	}

}
