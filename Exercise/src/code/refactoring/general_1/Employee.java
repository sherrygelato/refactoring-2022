package code.refactoring.general_1;

public class Employee {
	
	protected String _name;
	protected String _id;

	// 생성자 참조
	protected Employee(String name, String id) {
		this._name = name;
		this._id = id;
	}

	protected void initalize() {
		if (isPriviliged()) assignCar();   //  모든 하위클래스의 공통기능
	}
	
	boolean isPriviliged() {
		return false;
		
	}
	
	void assignCar() {
		
	}

}
