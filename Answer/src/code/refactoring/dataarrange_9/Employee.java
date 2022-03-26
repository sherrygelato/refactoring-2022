package code.refactoring.dataarrange_9;

public class Employee {

    private EmployeeType _type;

    public Employee(int arg) {
    	 _type = EmployeeType.setType(arg);
	}
	// 1. �з���ȣ ��ü ĸ��ȭ  getType(), setType()
    // 2. ����Ŭ������ �����ϰ� �з���ȣ�� ��ȯ�ϴ� abstract �޼���  getTypeCode(), payAmount() �ۼ�, 
    // 3. �� �з���ȣ�� ����Ŭ���� �ۼ�, getTypeCode ���� ����, ����� ������
    // 4. Employee Ŭ���� type������ type ��üȭ getType(), setType() �޼��忡 EmployeeType Ŭ���� ����
    // 5. setType() �޼��� ���� switch ���� ����Ŭ���� EmployeeType���� �̵�
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
