package code.refactoring.methodsimple_2;

public class EmployeeTest {
	
	public static void main(String[] args) { 
		Employee kim=new Employee();
		kim.percentRaise(0.1);
		kim.percentRaise(0.05);
//		kim.tenPercentRaise();
//		kim.fivePercentRaise();
		kim.baseCharge();
		
	}
}
