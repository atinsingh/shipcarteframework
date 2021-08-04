package io.pragra.testing.framework.conf;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Properties;

public class FrameWorkConfig {
    private String propertyFile = "framework.properties";
    private static FrameWorkConfig instance;
    private Properties properties;

    public FrameWorkConfig(){
        properties = new Properties();
        try {
            properties.load(new FileInputStream(Paths.get("src","test","resources",propertyFile).toFile()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        if(instance == null){
            instance = new FrameWorkConfig();
        }
        return instance.properties.getProperty(key);
    }
}
