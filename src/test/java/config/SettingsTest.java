package config;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SettingsTest {

    @Test
    public void getAccountName() {
    }

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(SettingsTest.class);

        Settings.setAccountKey();
        Settings.setAccountName();
        Settings.setEndpointSuffix();
        System.out.println(Settings.getAccountKey());
        System.out.println(Settings.getAccountName());
        System.out.println(Settings.getEndpointSuffix());

        logger.debug("run done.");
    }

}