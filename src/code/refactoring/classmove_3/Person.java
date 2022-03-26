package code.refactoring.classmove_3;

public class Person {
	
	// 서브 클래스 만들어서 역할과 책임 이동, 위임
	// - 클라이언트 코드 변화 최소화
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
		// Delegate Method (위임)
		// 역할 책임 조정에 맞게 
		return telNumber.getOfficeNumber();
	}
}
