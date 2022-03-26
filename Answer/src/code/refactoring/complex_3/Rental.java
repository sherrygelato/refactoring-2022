package code.refactoring.complex_3;

public class Rental {
	private Movie _movie;
	private int _daysRented;
	
	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}
	
	public int getDaysRented() {
		return _daysRented;
	}
	
	public Movie getMovie() {
		return _movie;
	}
	//  1 : switch부분 메소드분리  (대여료계산부분이 영화 분류코드에 의해 변경가능성이 높음)
	//  2 : 변수명 수정  each -> aRental, thisamount -> result
	//  3 : 참조하는 내용이 많은 Rental 클래스로 이동 / 참조부분, 인수내용 수정
	//  3.1 : 불필요한 임시변수 대체 thisAmount
	//  6 : getCharge()  Movie 클래스로 이동, 파라메타추가, 메서드위임
	double getCharge() {
		return _movie.getCharge(_daysRented);
	}
	// 4 : 변경가능성이 높은 포인트 적립부분 분리, point 계산부분처리로직 수정
	// 5 : 관련성이 높은 rental 클래스로 이동
	// 7 : getFrequentRenterPoints()  Movie 클래스로 이동, 파라메타추가, 메서드위임
	int getFrequentRentalPoints() {
		return _movie.getFrequentRentalPoints(_daysRented);
	}
}
