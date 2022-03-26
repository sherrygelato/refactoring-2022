package code.refactoring.classmove_5;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class Log4jWrapper {

    private static Log4jWrapper log4jWrapper;
    private static Logger logger;
    
    private Log4jWrapper() {
        logger = Logger.getLogger("MyLogger");
		logger.removeAllAppenders();
		logger.addAppender(new ConsoleAppender(new PatternLayout("%p %t %m%n"), ConsoleAppender.SYSTEM_OUT));
    }

    public static void getInstance() {
        if (log4jWrapper == null) {
            log4jWrapper = new Log4jWrapper();
        }
    }

    public static void info(String logMessage) {
        logger.info(logMessage);
    }

}
