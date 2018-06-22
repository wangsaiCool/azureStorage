package config;

import org.apache.commons.lang.Validate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class Settings {
    private static final Logger LOGGER = LoggerFactory.getLogger(Settings.class);
    private static String accountName = null;
    private static String accountKey = null;
    private static String endpointSuffix = null;

    public static String getAccountName() {
        return accountName;
    }

    public static void setAccountName(String accountName) {
        Settings.accountName = accountName;
    }

    public static void setAccountName() {
        String _accountName = getPropertiesValue("accountName");
        if (_accountName != null) {
            Settings.accountName = _accountName;
        } else {
            LOGGER.error("\"accountName is null.\"");
            throw new IllegalArgumentException("accountName is null.");
        }
    }

    public static String getAccountKey() {
        return accountKey;
    }

    public static void setAccountKey(String accountKey) {
        Settings.accountKey = accountKey;
    }

    public static void setAccountKey() {
        String _accountKey = getPropertiesValue("accountKey");
        if (_accountKey != null) {
            Settings.accountKey = _accountKey;
        } else {
            LOGGER.error("\"accountKey is null.\"");
            throw new IllegalArgumentException("accountKey is null.");
        }
    }

    public static String getEndpointSuffix() {
        return endpointSuffix;
    }

    public static void setEndpointSuffix(String endpointSuffix) {
        Settings.endpointSuffix = endpointSuffix;
    }

    public static void setEndpointSuffix() {
        String _endpointSuffix = getPropertiesValue("endpointSuffix");
        if (_endpointSuffix != null) {
            Settings.endpointSuffix = _endpointSuffix;
        } else {
            LOGGER.error("\"endpointSuffix is null.\"");
            throw new IllegalArgumentException("endpointSuffix is null.");
        }
    }

    private static String getPropertiesValue(String propertiesKey) {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(new File("src/main/resources/settings.properties")));
        } catch (IOException e) {
            LOGGER.error(e.toString());
        }

        Enumeration enum1 = properties.propertyNames();

        while (enum1.hasMoreElements()) {
            String strKey = (String) enum1.nextElement();
            String strValue = properties.getProperty(strKey);
            if (strKey.equalsIgnoreCase(propertiesKey)) {
                return strValue;
            }
        }
        return null;
    }

}
