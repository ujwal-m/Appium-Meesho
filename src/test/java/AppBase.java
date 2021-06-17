import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppBase {
    public static URL url;
    public static DesiredCapabilities capabilities;
    public static AndroidDriver<MobileElement> driver;

    //1
    @BeforeSuite
    public void setupAppium() throws MalformedURLException {
        //2
        final String URL_STRING = "http://127.0.0.1:4723/wd/hub";
        url = new URL(URL_STRING);
        //3
        capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        capabilities.setCapability(MobileCapabilityType.APP, "/Users/ujwalm/Downloads/app-india-debug.apk");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        //4
        driver = new AndroidDriver<MobileElement>(url, capabilities);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.resetApp();
    }

//    @Test(enabled=true)
//    public void Text_Test() throws InterruptedException {
//        Thread.sleep(8000);
//        MobileElement setup = driver.findElementById("com.meesho.supply.debug:id/set_up_later_button");
//        //Thread.sleep(3000);
//        System.out.println(setup.getText());
//        Assert.assertEquals(setup.getText(), "SET UP LATER");
//        Thread.sleep(2000);
//    }
//5
@AfterSuite
public void TestDone() throws InterruptedException {
    System.out.println(".......Workflow Succeded......");
}

    @AfterSuite
    public void uninstallApp() throws InterruptedException {
        driver.removeApp("com.example.android.contactmanager");
    }
//6
//    @Test (enabled=true)
//    public void myFirstTest() throws InterruptedException {
//        driver.resetApp();
//    }

//    @AfterSuite
//    public void teardown() {
//        //close the app
//        driver.quit();
//    }

}