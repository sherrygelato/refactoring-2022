package code.refactoring.dataarrange_10;

public class Person {
	
	//abstract boolean isMale();
	//abstract char getCode();
	private final boolean _isMale; // 3
	private final char _code;
	
    protected Person (boolean isMale, char code) { // 4
        _isMale = isMale;
        _code = code;
    }
	
	static Person CreateMale() {
		return new Person(true, 'M');
	}
	
	static Person CreateFemale() {
		return new Person(false,'F');
	}
	

}
