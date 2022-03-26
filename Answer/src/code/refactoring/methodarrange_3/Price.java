package code.refactoring.methodarrange_3;

public class Price {
	
	private int _quantity;
	private int _itemPrice;
	
	public Price(int quantity, int itemPrice) {
		this._quantity = quantity;
		this._itemPrice = itemPrice;
	}

	public double price() {
		final double basePrice = _quantity * _itemPrice;
		final double quantityDiscount = Math.max(0,  _quantity - 500) * _itemPrice * 0.05;
		final double shipping = Math.min(basePrice * 0.1,  1000.0);
		
		return basePrice - quantityDiscount + shipping;
	}

}
