package code.refactoring.dataarrange_9;

public class Employee {

    private EmployeeType _type;

    public Employee(int arg) {
    	 _type = EmployeeType.setType(arg);
	}
	// 1. 분류부호 자체 캡슐화  getType(), setType()
    // 2. 상태클래스를 선언하고 분류부호를 반환하는 abstract 메서드  getTypeCode(), payAmount() 작성, 
    // 3. 각 분류부호별 하위클래스 작성, getTypeCode 각각 구현, 선언된 상수사용
    // 4. Employee 클래스 type변수를 type 객체화 getType(), setType() 메서드에 EmployeeType 클래스 연결
    // 5. setType() 메서드 내의 switch 문을 하위클래스 EmployeeType으로 이동
    int getType() {
        return _type.getTypeCode();
    }
//    void setType(int arg) {
//       _type = new EmployeeType(arg);
//    }
    
    int payAmount() {
       return _type.payAmount();
    }
}
