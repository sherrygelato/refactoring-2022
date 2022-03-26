package code.refactoring.dataarrange_3;

import java.util.Dictionary;
import java.util.Hashtable;

public class Customer {
    
	private final String _name;	// Order 클래스가 현재 String 속성을 사용하고 있어서 final 로 선언함
	private static Dictionary _instances = new Hashtable();	// 레지스트리 객체를 생성  (Customer 인스천스에 접근하는 방법)
    
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
    
    // Customer 인스턴스 요청이 있을때 시작코드 작성
    static void loadCustomers() {
        new Customer ("박찬호").store();
        new Customer ("강정호").store();
        new Customer ("추신수").store();
    }
    private void store() {
        _instances.put(this.getName(), this);
    }
    
}
