import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

import java.net.MalformedURLException;
import java.net.URL;

import static java.util.concurrent.TimeUnit.SECONDS;

public class TestEcommerce extends BaseTest {
    private AndroidDriver<MobileElement> driver;
    private HomePage homepage;

    @BeforeMethod
    public void spinUpAndroidDriver() {
        try {
            driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), desiredCapabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(10, SECONDS);
        homepage = new HomePage(driver);
    }

    @AfterMethod
    public void stopAndroidDriver() {
        driver.quit();
    }


    @Test
    public void checkFashionStoreWordingShowing(){
//        homepage.swipeBanner();
        homepage.assertFashionWording();
    }

}
