package code.refactoring.conditionsimple_5;

public class NullObjectTest {

	private static LoggerHandler handler;
		
	public static void main(String[] args) {
		
		handler = new LoggerHandler(null);
		handler.log("fileloggger");

		handler = new LoggerHandler(new FileLogger());
		handler.log("socketloggger");
		
		handler = new LoggerHandler(new SocketLogger());
		handler.log("socketloggger");
	}

}
