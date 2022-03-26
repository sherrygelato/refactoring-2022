package code.refactoring.classmove_5;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class Log4jWrapper {
    private static Logger logger;
    private static Log4jWrapper logWrapper;

    private Log4jWrapper() {
        logger = Logger.getLogger("logger");
        logger.removeAllAppenders();
        logger.addAppender(new ConsoleAppender(new PatternLayout("%p %t %m%n"), ConsoleAppender.SYSTEM_OUT));
    }
    
    public static void getInstance() {
    	if(logWrapper == null) {
    		logWrapper = new Log4jWrapper();
    	}
    	//return logWrapper;
    }
    
    public static void info(String message) {

		logger.info(message);
    }

}
