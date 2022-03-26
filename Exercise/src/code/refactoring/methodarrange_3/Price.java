package code.refactoring.methodarrange_3;

public class Price {
	
	private int _quantity;
	private int _itemPrice;
	
	public Price(int quantity, int itemPrice) {
		this._quantity = quantity;
		this._itemPrice = itemPrice;
	}

	public double price() {
		//결제액 (price) = 총구매�ѱ��ž�(base price) - 대량구매할인 �뷮��������(discount) + 배송비 ��ۺ�(shipping)
		int basePrice = _quantity * _itemPrice;
		double quantityDiscount = Math.max(0,  _quantity - 500) * _itemPrice * 0.05;
		double shippingFee = Math.min(basePrice * 0.1,  1000.0);
		
		return basePrice - quantityDiscount + shippingFee;
	}

}
