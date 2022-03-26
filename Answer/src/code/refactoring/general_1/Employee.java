package code.refactoring.general_1;

public class Employee {
	
	protected String _name;
	protected String _id;
	
	protected Employee (String name, String id) {
		_name = name;
		_id = id;
	}
	
	protected void initialize() {
		if (isPriviliged()) assignCar();
	}
	
	boolean isPriviliged() {
		return false;
		
	}
	
	void assignCar() {
		
	}

}
