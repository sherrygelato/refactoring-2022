package code.refactoring.general_6;

import java.util.Vector;

public class MyStack {
	
	private Vector _vector = new Vector();  // 1
	
	public void push(Object element) {
		_vector.insertElementAt(element,0);  // 2
	}
	
	public Object pop() {
		Object result = _vector.firstElement();
		_vector.removeElementAt(0);
		return result;
	}
	
    public int size() {		// 3
        return _vector.size();
    }
    public boolean isEmpty() {    // 3
        return _vector.isEmpty();
    }

}
