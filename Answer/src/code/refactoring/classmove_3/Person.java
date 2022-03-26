 package code.refactoring.classmove_3;


public class Person {
	
	private TelephoneNumber telephoneNumber = new TelephoneNumber();
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelephoneNumber() {
		return telephoneNumber.getTelephoneNumber();
	}	

	public String getOfficeAreaCode() {
		return telephoneNumber.getAreaCode();
	}
	public void setOfficeAreaCode(String officeAreaCode) {
		telephoneNumber.setAreaCode(officeAreaCode);
	}
	public String getOfficeNumber() {
		return telephoneNumber.getNumber();
	}
	public void setOfficeNumber(String officeNumber) {
		telephoneNumber.setNumber(officeNumber);
	}
}
