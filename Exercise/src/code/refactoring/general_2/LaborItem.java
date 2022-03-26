package code.refactoring.general_2;

public class LaborItem extends JobItem {

    private Employee _employee;

    public LaborItem(int unitPrice, int quantity, Employee employee) {
        super(unitPrice, quantity); // 상위 클래스 생성자
        this._employee = employee;
    }

    public Employee getEmployee() {
		return _employee;
	}

    @Override
    public int getUnitPrice() { // 오버라이딩 처리
		return _employee.getRate();
	}
    
}
