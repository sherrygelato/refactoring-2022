package code.refactoring.complex_3;

public class Movie {
	public static final int CHILDERNS = 2;
	public static final int REQULAR = 0;
	public static final int NEW_RELEASE = 1;
	private String _title;
	private Price _price;  // 11. priceCode 필드로 price 클래스로 전환
	//private int _priceCode;
	
	public Movie(String title, int priceCode) {
		_title = title;
		// 9 분류부호에 필드 자체캡슐화
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
			throw new IllegalArgumentException("가격 코드에 오류가 있습니다.");
		}
	}
	
	public String getTitle() {
		return _title;
	}
	
	//  1 : switch부분 분리  (대여료계산부분이 영화 분류코드에 의해 변경가능성이 높음)
	//  2 : 변수명 수정  aRental, result
	//  3 : 참조하는 내용이 많은 Rental 클래스로 이동 / 참조부분, 인수내용 수정
	//  8 : getFrequentRenterPoints() 메서드 단순화
	//  10: Price 클래스로 이동
	double getCharge(int daysRented) {
		
		return _price.getCharge(daysRented);
	}
	int getFrequentRentalPoints(int daysRented) {
		
		return _price.getFrequentRenterPoints(daysRented);
	}
}
