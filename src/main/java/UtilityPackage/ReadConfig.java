package UtilityPackage;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
    public Properties loadconfig() {
        Properties prop=new Properties();
        try {
            FileInputStream fis=new FileInputStream("C:\\Users\\Aysha_Tafheem\\eclipse-workspace\\AutomationTarget\\src\\main\\java\\ConfigPackage\\config.properties");
            prop=new Properties();
            prop.load(fis);
        }
        catch(Exception e)
        {
            e.printStackTrace();

        }
        return prop;

    }
    public String getURL(Properties prop)
    {
        String url=prop.getProperty("");
        return url;
    }

    public String getUsername(Properties prop)
    {
        String username=prop.getProperty("");
        return username;
    }

    public String getPassword(Properties prop)
    {
        String password=prop.getProperty("");
        return password;
    }
}
