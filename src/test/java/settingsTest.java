import org.junit.Test;

public class settingsTest {

    @Test
    public void getAccountName() {
    }

    public static void main(String[] args) {
        settings.setAccountKey();
        settings.setAccountName();
        settings.setEndpointSuffix();
        System.out.println(settings.getAccountKey());
        System.out.println(settings.getAccountName());
        System.out.println(settings.getEndpointSuffix());
    }

}