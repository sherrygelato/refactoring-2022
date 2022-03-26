package code.refactoring.methodarrange_1;

import java.util.Enumeration;
import java.util.Vector;

public class Owe {
	
	private String _name ;
	private Vector _orders = new Vector();
	
    public Owe(String _name){
 		   this._name=_name;
    }
   
    public void addOrder(Order arg) {
	   _orders.addElement(arg);
    }
	
	public void printOwing(double previousAmount) {

	    printBanner();
	    double outstanding = getOutstanding(previousAmount*1.2);  	    // 외상액 계산
	    printDetails(outstanding);	    // 세부내역 출력

	}
	// 3번
	private double getOutstanding(double outstanding) {
		// 로컬변수 중 이동하는 메서드 안에서만 사용되는 것은 메서드 안으로 이동
		// 메서드 밖에서 사용되는 변수는 변경값을 리턴한다.
	    Enumeration e = _orders.elements();
	    double result = outstanding;
		while(e.hasMoreElements()) {
	        Order each = (Order)e.nextElement();
	        result += each.getAmount();
	    }
		return result;
	} 
	// 2번
	private void printDetails(double outstanding) {
		// 지역변수를 변경없이 읽기만 하는 경우 그냥 매개변수로 전달
		System.out.println("name: " + _name);
	    System.out.println("amount: " + outstanding);
	}
	// 1번
	private void printBanner() {
		System.out.println("************************");
	    System.out.println("*******고객 외상*******");
	    System.out.println("************************");
	}
	
}
