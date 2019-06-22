import java.util.logging.Logger;

public class LoggerClass {
	private static LoggerClass instance = null;
	Logger logger ;
    public String name;

    private LoggerClass(String name) {
        logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        this.name = name;
    }

    //Creates a singleton object if not already initialized
    public static LoggerClass getInstance(String name) {
    	
        if (instance == null) {
            instance = new LoggerClass(name);
        }
    	
        return instance;
    }
}
