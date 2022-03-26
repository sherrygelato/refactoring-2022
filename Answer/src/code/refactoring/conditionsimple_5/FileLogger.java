package code.refactoring.conditionsimple_5;

public class FileLogger implements ILogger {

	@Override
	public void log(String log) {
		System.out.println("file log - " + log);
	}
}
