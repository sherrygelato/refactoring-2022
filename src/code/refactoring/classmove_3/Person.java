package code.refactoring.classmove_3;

public class Person {
	
	private TelephoneNumber telNumber = new TelephoneNumber();
	private String name;

	public String getOfficeAreaCode() {
		return telNumber.getOfficeAreaCode();
	}
	public void setOfficeAreaCode(String officeAreaCode) {
		telNumber.setOfficeAreaCode(officeAreaCode);
	}
	public String getOfficeNumber() {
		return telNumber.getOfficeNumber();
	}
	public void setOfficeNumber(String officeNumber) {
		telNumber.setOfficeNumber(officeNumber);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelephoneNumber() {
		return ("(" + telNumber.getOfficeAreaCode() + ")" + telNumber.getOfficeNumber());
	}
}
