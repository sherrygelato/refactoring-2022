package code.refactoring.dataarrange_3;

import java.util.Dictionary;
import java.util.Hashtable;

public class Customer {
    
	private final String _name;	// Order Ŭ������ ���� String �Ӽ��� ����ϰ� �־ final �� ������
	private static Dictionary _instances = new Hashtable();	// ������Ʈ�� ��ü�� ����  (Customer �ν�õ���� �����ϴ� ���)
    
	private Customer (String name) {
        _name = name;
    }
    public String getName() {
        return _name;
    }
    
    public static Customer create (String name) {
    	//return new Customer(name);
    	loadCustomers();
    	return (Customer)_instances.get(name);
    }
    
    // Customer �ν��Ͻ� ��û�� ������ �����ڵ� �ۼ�
    static void loadCustomers() {
        new Customer ("����ȣ").store();
        new Customer ("����ȣ").store();
        new Customer ("�߽ż�").store();
    }
    private void store() {
        _instances.put(this.getName(), this);
    }
    
}
