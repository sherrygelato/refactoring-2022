package code.refactoring.methodsimple_6;

public class Employee {

	   private int _type;
	   static final int ENGINEER = 0;
	   static final int SALESMAN = 1;
	   static final int MANAGER = 2;
	   
	   protected Employee (int type) {
	       _type = type;
       }

	   public static Employee create(int type) {
	       switch (type) {
	           case ENGINEER:
	        	  return (Employee)new Engineer(type);
	           case SALESMAN:
	              return (Employee)new Salesman(type);
	           case MANAGER:
	        	  return (Employee)new Manager(type);
	           default:
	              throw new IllegalArgumentException("Incorrect type code value");
        	}
       }
}
