package code.refactoring.general_4;

public class MemberInfoImpl implements IMemberInfo {

	@Override
	public void searchInform(String name, String phoneNum) {
		System.out.println(name + " ������� ������ ã�ҽ��ϴ�.");
		
	}

	@Override
	public void runService(int memberID, int requestID) {
		System.out.println(memberID + " ���� ��û ���񽺸� �����մϴ�.");
		
	}

}
