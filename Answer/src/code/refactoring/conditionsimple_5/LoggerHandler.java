package code.refactoring.conditionsimple_5;

public class LoggerHandler {

	private ILogger logger;

	public LoggerHandler(ILogger logger) {
		this.logger = logger;
	}
	
	public ILogger getLogger() {
		if(this.logger == null)
			return NullLogger.getInstance();
		
		return this.logger;
	}
 
	public void log(String log) {
		this.getLogger().log(log);
	}
	
	public void log(ILogger logger, String log) {
		this.logger = logger;
		this.log(log);
	}
}
