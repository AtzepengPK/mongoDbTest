package mongoDbTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpringLogger {
	
	String msx;
	private Logger logger;
	
	public SpringLogger(Class from,String msx) {		
		this.msx = msx;
		logger = LoggerFactory.getLogger(from);
		
	}	
	
	
	public void logOnConsole() {
		
		
	}
	
	public boolean logOnFile() {
		
		
		
		return true;
	}
	  	 
	    public void helpMethod(){
	        logger.debug("debug: " + msx);
	        logger.info("info: " + msx);
	        logger.warn("warn :" + msx);
	        logger.error("error :" + msx);	 
	    }	    
}
