package config;

import org.junit.Test;

public class SettingsTest {

    @Test
    public void getAccountName() {
    }

    public static void main(String[] args) {
        Settings.setAccountKey();
        Settings.setAccountName();
        Settings.setEndpointSuffix();
        System.out.println(Settings.getAccountKey());
        System.out.println(Settings.getAccountName());
        System.out.println(Settings.getEndpointSuffix());
    }

}