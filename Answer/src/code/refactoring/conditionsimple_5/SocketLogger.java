package code.refactoring.conditionsimple_5;

public class SocketLogger implements ILogger {
	@Override
	public void log(String log) {
		System.out.println("socket log - " + log);
	}
}
