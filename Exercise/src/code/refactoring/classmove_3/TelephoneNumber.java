package code.refactoring.classmove_3;

public class TelephoneNumber {

	// 역할과 책임 구분
	
	private String officeAreaCode;
	private String officeNumber;

	public String getOfficeAreaCode() {
		return officeAreaCode;
	}
	public void setOfficeAreaCode(String officeAreaCode) {
		this.officeAreaCode = officeAreaCode;
	}
	public String getOfficeNumber() {
		return officeNumber;
	}
	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}
}