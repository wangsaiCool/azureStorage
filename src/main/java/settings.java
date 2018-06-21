import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class settings {
    private static String accountName = null;
    private static String accountKey = null;
    private static String endpointSuffix = null;

    public static String getAccountName() {
        return accountName;
    }

    public static void setAccountName(String accountName) {
        settings.accountName = accountName;
    }

    public static void setAccountName() {
        String _accountName = getPropertiesValue("accountName");
        if (_accountName != null) {
            settings.accountName = _accountName;
        } else {
            throw new IllegalArgumentException("accountName is null.");
        }
    }

    public static String getAccountKey() {
        return accountKey;
    }

    public static void setAccountKey(String accountKey) {
        settings.accountKey = accountKey;
    }

    public static void setAccountKey() {
        String _accountKey = getPropertiesValue("accountKey");
        if (_accountKey != null) {
            settings.accountKey = _accountKey;
        } else {
            throw new IllegalArgumentException("accountKey is null.");
        }
    }

    public static String getEndpointSuffix() {
        return endpointSuffix;
    }

    public static void setEndpointSuffix(String endpointSuffix) {
        settings.endpointSuffix = endpointSuffix;
    }

    public static void setEndpointSuffix() {
        String _endpointSuffix = getPropertiesValue("endpointSuffix");
        if (_endpointSuffix != null) {
            settings.endpointSuffix = _endpointSuffix;
        } else {
            throw new IllegalArgumentException("endpointSuffix is null.");
        }
    }

    private static String getPropertiesValue(String propertiesKey) {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(new File("src/main/resources/settings.properties")));
        } catch (IOException e) {
            //TODO log
            e.printStackTrace();
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
