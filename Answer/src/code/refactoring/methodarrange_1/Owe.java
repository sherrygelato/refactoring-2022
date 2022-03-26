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
	    double outstanding = getOutstanding(previousAmount*1.2);  	    // �ܻ�� ���
	    printDetails(outstanding);	    // ���γ��� ���

	}
	// 3��
	private double getOutstanding(double outstanding) {
		// ���ú��� �� �̵��ϴ� �޼��� �ȿ����� ���Ǵ� ���� �޼��� ������ �̵�
		// �޼��� �ۿ��� ���Ǵ� ������ ���氪�� �����Ѵ�.
	    Enumeration e = _orders.elements();
	    double result = outstanding;
		while(e.hasMoreElements()) {
	        Order each = (Order)e.nextElement();
	        result += each.getAmount();
	    }
		return result;
	} 
	// 2��
	private void printDetails(double outstanding) {
		// ���������� ������� �б⸸ �ϴ� ��� �׳� �Ű������� ����
		System.out.println("name: " + _name);
	    System.out.println("amount: " + outstanding);
	}
	// 1��
	private void printBanner() {
		System.out.println("************************");
	    System.out.println("*******�� �ܻ�*******");
	    System.out.println("************************");
	}
	
}
