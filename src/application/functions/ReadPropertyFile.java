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

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;

/**
 * The <b>ReadPropertyFile</b> class provides with functionality to read the content of the {@code config.properties} file.
 *
 * @apiNote The property file should have:
 * <p>
 *        keys: <b>logs_absolute_path</b>
 * @author Konstantin Andreev
 */
class ReadPropertyFile {
    private Properties properties;
    private final LogGenerator lg;

    /**
     * Creates an object of {@link ReadPropertyFile} with a set of {@link Properties} and a {@link LogGenerator}
     *
     * @param properties A specific set of properties.
     * @param lg A log object to register log messages.
     * @see Properties
     * @see LogGenerator
     */
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
     * Gets the content of the specific property key from the {@code config.properties} file.
     *
     * @param key The key of the desired property.
     * @return The content corresponding to the specified key. Null if there is an exception caught.
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
