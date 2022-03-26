package code.refactoring.general_1;

public class Manager extends Employee {
	
	private int _grade;
	
	public Manager (String name, String id, int grade) {
		super(name, id);
		_grade = grade;
		
		initialize();
	}
	
	boolean isPriviliged() {
		return _grade > 4;
	}

}
