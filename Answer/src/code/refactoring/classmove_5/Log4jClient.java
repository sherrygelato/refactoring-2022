package code.refactoring.classmove_5;


public class Log4jClient {

	
	public static void main(String[] args) {
		
		Log4jWrapper.getInstance();
		Log4jWrapper.info("hello");

	}
	
}
