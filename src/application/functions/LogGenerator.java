package application.functions;

import java.io.IOException;
import java.util.logging.*;

public class LogGenerator {
    private final static int MB_1 = (int) Math.pow(1024,2); // 1MB = 1_048_676 Bytes
    private final static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    private static LogGenerator lg = null;

    public static LogGenerator getInstance(){
        if (lg == null)
            lg = new LogGenerator();
        return lg;
    }

    public void registerLog(Level type,String s){
        logger.log(type,s);
    }

    private LogGenerator() {
        setLoggerConfiguration();
    }

    private void setLoggerConfiguration(){
        LogManager.getLogManager().reset(); // Reset the logger configuration.
        logger.setLevel(Level.ALL); // Set the level of the logger/handler.

        ConsoleHandler ch = new ConsoleHandler(); // Create a ConsoleHandler.
        ch.setLevel(Level.OFF);
        logger.addHandler(ch); // Add the console handler to the logger.

        createFile();
    }

    private void createFile(){
        FileHandler fh; // Create a FileHandler
        try {
            // Create a limit of 1 MB per file.
            String abs_path = "G:\\Personal Folder\\Development\\Java\\Fundamentals\\Console_Applications\\Simple_Calculator_Console\\logs";
            fh = new FileHandler(abs_path + "/calculator_temp_%g.log", MB_1, 10, true);
            fh.setLevel(Level.ALL);
            logger.addHandler(fh); // Add the file handler to the logger.
        } catch (IOException e) {
            logger.severe("ERROR: File logger not working! " + e);
        }
    }
}
