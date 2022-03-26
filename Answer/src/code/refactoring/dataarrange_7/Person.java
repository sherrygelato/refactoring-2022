package code.refactoring.dataarrange_7;

public class Person {
	public static final int O = BloodGroup.O.getCode();
	public static final int A = BloodGroup.A.getCode();
	public static final int B = BloodGroup.B.getCode();
	public static final int AB = BloodGroup.AB.getCode();
	
	private BloodGroup _bloodGroup;
	
	public Person (int bloodGroup) {
		_bloodGroup = BloodGroup.code(bloodGroup);
	}
	
	public void setBloodGroup(int arg) {
		_bloodGroup = BloodGroup.code(arg);
	}
	
	public int getBloodGroup() {
		return _bloodGroup.getCode();
	}

}
