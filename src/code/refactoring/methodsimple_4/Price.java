package code.refactoring.methodsimple_4;

public class Price {
	
	private int _quantity;
	private int _itemPrice;
	
	public Price(int quantity, int itemPrice) {
		this._quantity = quantity;
		this._itemPrice = itemPrice;
	}
	public double getPrice() {
		int basePrice = _quantity * _itemPrice;
//		int discountLevel;
		
//		discountLevel = getDiscountLevel();
		
		double finalPrice = discountedPrice(basePrice);
		
		return finalPrice;
	}

	private double discountedPrice(int basePrice) {
		if (discountLevel == 2) return basePrice * 0.1;
		else return basePrice * 0.05;
	}
	
	private int getDiscountLevel() {
//		int discountLevel;
		if (_quantity > 100) discountLevel = 2;
		else discountLevel = 1;
//		return discountLevel;
	}

}
