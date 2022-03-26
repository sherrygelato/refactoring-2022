package code.refactoring.conditionsimple_5;

public class NullLogger implements ILogger {

	private static final NullLogger instance = new NullLogger();

	private NullLogger() { 
	
	}

	public static NullLogger getInstance() {
		return NullLogger.instance; 
	}
	
	@Override
	public void log(String log) {
		System.out.println("null log - " + log);
	}
}
