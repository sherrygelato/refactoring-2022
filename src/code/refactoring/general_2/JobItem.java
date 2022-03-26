package code.refactoring.general_2;

public class JobItem {
	
	// private Employee _employee; // 하향 시키기
	private int _unitPrice;
	private int _quantity;
	// private boolean _isLabor; // 불필요해짐

	public JobItem(int unitPrice, int quantity) {
		_unitPrice = unitPrice;
		_quantity = quantity;
	}
	
	public int getTotalPrice() {
		return getUnitPrice() * _quantity;
	}
	
	// 오버라이딩 처리
	public int getUnitPrice() {
		return _unitPrice; // 상/하위 클래스 구조화로 불필요한 분기 조건 없앨 수 있다. 
	}
	
	public int getQuantity() {
		return _quantity;
	}
	
	// public Employee getEmployee() {
	// 	return _employee;
	// }
}
