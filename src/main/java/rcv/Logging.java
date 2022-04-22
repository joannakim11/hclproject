package rcv;
import org.apache.logging.log4j.*;

public class Logging {
	
	private static Logger logger = LogManager.getLogger(Logging.class.getName());
	public static void main(String[] args) {
		
		logger.info("Successful");
		logger.error("Failed");
		logger.debug("Debug");
		logger.fatal("Fatal");
	}
	

}
