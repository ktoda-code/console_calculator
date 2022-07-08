/*
 * MIT License
 *
 * Copyright (c) 2022 Konstantin Andreev
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package application.functions;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.*;

/**
 * The <b>LogGenerator</b> class provides basic functionality
 * for handling console errors and saving them in a log file.
 *
 * @author Konstantin Andreev
 */
public class LogGenerator {
    /**
     * Constant variable for 1 MB.
     */
    private final static int MB_1 = (int) Math.pow(1024,2); // 1MB = 1_048_676 Bytes
    private final static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    private static LogGenerator lg = null;

    /**
     * This method gets the instance of the {@link LogGenerator}.
     *
     * @return The instance of the {@link LogGenerator}
     */
    public static LogGenerator getInstance(){
        if (lg == null)
            lg = new LogGenerator();
        return lg;
    }

    /**
     * This method is used to register a log message.
     *
     * @param type The type of log level.
     * @param s The string message to be logged.
     * @see Level
     */
    public void registerLog(Level type,String s){
        logger.log(type,s);
    }

    /**
     * Private constructor, initializes the {@link LogGenerator} with its configurations.
     */
    private LogGenerator() {
        setLoggerConfiguration();
    }

    /**
     * This method is used to set the configuration for the {@link LogGenerator}.
     */
    private void setLoggerConfiguration(){
        LogManager.getLogManager().reset(); // Reset the logger configuration.
        logger.setLevel(Level.ALL); // Set the level of the logger/handler.

        ConsoleHandler ch = new ConsoleHandler(); // Create a ConsoleHandler.
        /*
          Change to other log level to be displayed in the console.
          Default is OFF.
         */
        ch.setLevel(Level.OFF);
        logger.addHandler(ch); // Add the console handler to the logger.

        createFileWithoutConfigs();
    }

    /**
     * This method is used to create log files in the logs' folder in the project structure using {@link FileHandler}.
     * The logs' folder must be created before the initialization of the program, otherwise log files won't be created.
     *
     * @see FileHandler
     */
    private void createFileWithoutConfigs(){
        FileHandler fh; // Create a FileHandler
        try {
            fh = new FileHandler("logs/calculator_temp_%g.log", MB_1, 10, true);
            fh.setLevel(Level.ALL);
            logger.addHandler(fh); // Add the file handler to the logger.
        } catch (IOException e) {
            logger.severe("ERROR: File logger not working! " + e);
        } catch (IllegalArgumentException e){
            logger.severe("ERROR: Location pattern is empty! " + e);
        }
    }

    /**
     * This method is used to create log files in the logs' folder in the project structure using {@link FileHandler}.
     * The logs' folder must be created before the initialization of the program, otherwise log files won't be created.
     * <p>
     * The path for the logs' folder is being taken from a {@code config.properties} file using the key value {@code logs_absolute_path}.
     * The {@code config.properties} file must be created for the method to function, otherwise log files won't be created.
     *
     * @see FileHandler
     */
    @Deprecated
    private void createFileUsingConfigs(){
        FileHandler fh; // Create a FileHandler
        ReadPropertyFile rpf = new ReadPropertyFile(new Properties(), lg);
        try {
            String abs_path = rpf.getPropertyContent("logs_absolute_path");
            if(abs_path == null){
                throw new IllegalArgumentException();
            }
            fh = new FileHandler(abs_path + "/calculator_temp_%g.log", MB_1, 10, true);
            fh.setLevel(Level.ALL);
            logger.addHandler(fh); // Add the file handler to the logger.
        } catch (IOException e) {
            logger.severe("ERROR: File logger not working! " + e);
        } catch (IllegalArgumentException e){
            logger.severe("ERROR: Empty string! " + e);
        }
    }
}
