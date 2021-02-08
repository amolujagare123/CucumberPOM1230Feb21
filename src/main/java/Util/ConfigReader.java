package Util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    static Properties getLoadedPropertiesObject() throws IOException {

        FileInputStream fp = new FileInputStream("config\\config.properties");
        Properties prop = new Properties();
        prop.load(fp);

        return prop;
    }

    public static String getUrl() throws IOException {
           return  getLoadedPropertiesObject().getProperty("url");
    }

}
