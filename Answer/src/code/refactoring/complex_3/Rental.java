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
	//  1 : switch�κ� �޼ҵ�и�  (�뿩����κ��� ��ȭ �з��ڵ忡 ���� ���氡�ɼ��� ����)
	//  2 : ������ ����  each -> aRental, thisamount -> result
	//  3 : �����ϴ� ������ ���� Rental Ŭ������ �̵� / �����κ�, �μ����� ����
	//  3.1 : ���ʿ��� �ӽú��� ��ü thisAmount
	//  6 : getCharge()  Movie Ŭ������ �̵�, �Ķ��Ÿ�߰�, �޼�������
	double getCharge() {
		return _movie.getCharge(_daysRented);
	}
	// 4 : ���氡�ɼ��� ���� ����Ʈ �����κ� �и�, point ���κ�ó������ ����
	// 5 : ���ü��� ���� rental Ŭ������ �̵�
	// 7 : getFrequentRenterPoints()  Movie Ŭ������ �̵�, �Ķ��Ÿ�߰�, �޼�������
	int getFrequentRentalPoints() {
		return _movie.getFrequentRentalPoints(_daysRented);
	}
}
