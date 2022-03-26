package code.refactoring.general_4;

public class MemberInfoTest {

	public static void main(String[] args) {
		//InterClassFunction interFunction = new InterClassFunctionImpl();
		IMemberInfo memberInfo = new MemberInfoImpl();
		memberInfo.searchInform("È«»ç¿ø", "010-1234-5678");
		memberInfo.runService(11, 100);		
	}
}
