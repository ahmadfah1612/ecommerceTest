import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;

import java.io.File;

public class BaseTest {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

    @BeforeSuite
    public void setCapabilities(){
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, new File(System.getProperty("user.dir")
                + "/app/ecommerce-test.apk").getAbsolutePath());
        desiredCapabilities.setCapability(MobileCapabilityType.APPLICATION_NAME, "io.flutter.demo.gallery");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability("appWaitDuration", 20000);
        desiredCapabilities.setCapability("newCommandTimeout", 50);
    }
}
