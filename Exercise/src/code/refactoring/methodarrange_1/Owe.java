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

	    
	    double outstanding = previousAmount*1.2;
	    printBanner();

	    // 각각의 인수값 필요한 것인지, 적절한지 조정 
	    outstanding = getOutstanding(outstanding);

	    printDetail(outstanding);

	}
	
	private void printBanner() {
		System.out.println("************************");
		System.out.println("*******고객 외상*******");
		System.out.println("************************");
	}

	private double getOutstanding(double outstanding) {
		// 외상액 계산 
		Enumeration e = _orders.elements();
		
	    while(e.hasMoreElements()) {
	        Order each = (Order)e.nextElement();
	        outstanding += each.getAmount();
	    }
		return outstanding;
	}

	private void printDetail(double outstanding) {
		// 세부내역 출력 
		System.out.println("name: " + _name);
		System.out.println("amount: " + outstanding);
	}
	
}
