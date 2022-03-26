package code.refactoring.methodsimple_2;

public class Employee {

	private double salary=100;
	
	void raise (double factor) {
		salary *= (1+factor);
		System.out.println("salary --> " + salary );
	}
	
	double baseCharge() {
		
		double result = Math.min(lastUsage(), 100) * 0.03;
		result += usageInRange(100, 200) * 0.05;
		result += usageInRange(200, Integer.MAX_VALUE) * 0.07;
		System.out.println("result --> " + result );
		return result;
		
	}
	
	int usageInRange(int start, int end) {
		if (lastUsage() > start) return Math.min(lastUsage(), end) - start;
		else return 0;
	}

	private int lastUsage() {
		return 300;
	}

}
