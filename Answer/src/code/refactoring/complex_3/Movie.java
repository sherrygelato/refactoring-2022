package code.refactoring.complex_3;

public class Movie {
	public static final int CHILDERNS = 2;
	public static final int REQULAR = 0;
	public static final int NEW_RELEASE = 1;
	private String _title;
	private Price _price;  // 11. priceCode �ʵ�� price Ŭ������ ��ȯ
	//private int _priceCode;
	
	public Movie(String title, int priceCode) {
		_title = title;
		// 9 �з���ȣ�� �ʵ� ��üĸ��ȭ
		setPriceCode(priceCode);
	}
	
	public int getPriceCode() {
		return _price.getPriceCode();
	}
	
	public void setPriceCode(int arg) {
		switch(arg) {
		case REQULAR:
			_price = new RegularPrice();
			break;
		case CHILDERNS:
			_price = new ChildrensPrice();
			break;
		case NEW_RELEASE:
			_price = new NewReleasePrice();
			break;
		default:
			throw new IllegalArgumentException("���� �ڵ忡 ������ �ֽ��ϴ�.");
		}
	}
	
	public String getTitle() {
		return _title;
	}
	
	//  1 : switch�κ� �и�  (�뿩����κ��� ��ȭ �з��ڵ忡 ���� ���氡�ɼ��� ����)
	//  2 : ������ ����  aRental, result
	//  3 : �����ϴ� ������ ���� Rental Ŭ������ �̵� / �����κ�, �μ����� ����
	//  8 : getFrequentRenterPoints() �޼��� �ܼ�ȭ
	//  10: Price Ŭ������ �̵�
	double getCharge(int daysRented) {
		
		return _price.getCharge(daysRented);
	}
	int getFrequentRentalPoints(int daysRented) {
		
		return _price.getFrequentRenterPoints(daysRented);
	}
}
