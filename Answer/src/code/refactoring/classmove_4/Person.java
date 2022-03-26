package code.refactoring.classmove_4;

public class Person {
	
	Department _department = new Department();

	public Department getDepartment() {
		return _department;
	}

	public void setDepartment(Department arg) {
		this._department = arg;
	}
	
	// delegate method
	public String getManager() {
		return _department.getManager();
	}
}
