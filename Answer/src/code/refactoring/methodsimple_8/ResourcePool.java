package code.refactoring.methodsimple_8;

import java.util.Stack;

public class ResourcePool {

	Stack _available;
	Stack _allocated;
	
	ResourcePool(){
		  _available=new Stack();
		  _allocated=new Stack();
	}
	
   Resource getResource() {
       Resource result;
       if (_available.isEmpty())
           result = new Resource();
       else
           result = (Resource) _available.pop();
       	   _allocated.push(result);
       return result;
   }
}
