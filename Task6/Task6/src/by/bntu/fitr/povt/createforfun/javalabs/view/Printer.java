package by.bntu.fitr.povt.createforfun.javalabs.view;

import org.apache.log4j.Logger; 

public class Printer {
    private static final Logger LOG;

    static {
        LOG = Logger.getRootLogger();
    }

    public static void printinfo(String msg) {
        LOG.info(msg);
    }
    
    public static void printtrace(String msg) {
        LOG.trace(msg);
    }
    
    public static void printdebug(String msg) {
        LOG.debug(msg);
    }
    
    public static void printwarn(String msg) {
        LOG.warn(msg);
    }
    
    public static void printerror(String msg) {
        LOG.error(msg);
    }
    
    public static void printfatal(String msg) {
        LOG.fatal(msg);
    }
}
