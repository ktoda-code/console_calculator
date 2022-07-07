package application.functions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;

/**
 *
 * @apiNote The property file should have:
 *        keys:
 *            logs_absolute_path = ...
 */
class ReadPropertyFile {
    private Properties properties;
    private final LogGenerator lg;

    public ReadPropertyFile(Properties properties, LogGenerator lg) {
        this.properties = properties;
        this.lg = lg;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    /**
     * Gets the content of the specific property key.
     *
     * @param key The key of the desired property.
     * @return The content corresponding to the specified key.
     */
    public String getPropertyContent(String key){
        try {
            FileInputStream fis = new FileInputStream("config.properties");
            properties.load(fis);
            return properties.getProperty(key);
        } catch (FileNotFoundException e) {
            lg.registerLog(Level.SEVERE,"Configuration file not found!" + e);
            return null;
        } catch (IOException e) {
            lg.registerLog(Level.SEVERE,"Couldn't load file!" + e);
            return null;
        }
    }
}
