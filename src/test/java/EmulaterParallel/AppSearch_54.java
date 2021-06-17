package EmulaterParallel;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppSearch_54 {
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
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        //4
        driver = new AndroidDriver<MobileElement>(url, capabilities);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.resetApp();
    }

    @AfterSuite
    public void uninstallApp() throws InterruptedException {
        driver.removeApp("com.example.android.contactmanager");
    }

    @Test(enabled = true)
    public void search_Test() throws InterruptedException {
        Thread.sleep(5000);
        MobileElement female = driver.findElementById("com.meesho.supply.debug:id/img_female");
        female.click();
        MobileElement searchBox = driver.findElementById("com.meesho.supply.debug:id/query_edit_text");
        searchBox.click();
        Thread.sleep(2000);

        MobileElement searchBox2 = driver.findElementById("com.meesho.supply.debug:id/query_edit_text");
        searchBox2.click();
        searchBox2.sendKeys("Sari");

        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(PointOption.point(999, 2000)).perform();
        Thread.sleep(3000);

//        MobileElement pic = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ImageView");

        MobileElement viewProd = driver.findElementById("com.meesho.supply.debug:id/btn_view_product");
        viewProd.click();
        Thread.sleep(3000);
        MobileElement viewDetails = driver.findElementById("com.meesho.supply.debug:id/view_details");
        viewDetails.click();
        Thread.sleep(3000);
        MobileElement buyNow = driver.findElementById("com.meesho.supply.debug:id/buy_now");
        buyNow.click();
        Thread.sleep(53000);
        MobileElement cont = driver.findElementById("com.meesho.supply.debug:id/primary_cta");
        cont.click();
        Thread.sleep(2000);
        MobileElement close = driver.findElementById("com.meesho.supply.debug:id/close");
        close.click();
        Thread.sleep(2000);

    }
}