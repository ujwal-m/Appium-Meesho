package EmulaterParallel;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppDownload_56 {
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
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5556");
        //4
        driver = new AndroidDriver<MobileElement>(url, capabilities);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.resetApp();
    }

    @AfterSuite
    public void uninstallApp() throws InterruptedException {
        driver.removeApp("com.example.android.contactmanager");
    }


    @Test
    public void DownloadTest() throws  InterruptedException {
        Thread.sleep(5000);
        MobileElement female = driver.findElementById("com.meesho.supply.debug:id/img_female");
        female.click();
        Thread.sleep(2000);
        MobileElement vid = driver.findElementById("com.meesho.supply.debug:id/img_video_full_thumbnail");
        vid.click();
        Thread.sleep(53000);
        MobileElement addCart = driver.findElementById("com.meesho.supply.debug:id/primary_cta");
        addCart.click();
        Thread.sleep(5000);

        MobileElement sari_icon = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/androidx.viewpager.widget.ViewPager[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView[2]");
        sari_icon.click();
        Thread.sleep(5000);
        MobileElement icon = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.ImageView");
        icon.click();
        Thread.sleep(5000);
        MobileElement dwn = driver.findElementById("com.meesho.supply.debug:id/download");
        dwn.click();
        Thread.sleep(5000);
        MobileElement allow = driver.findElementById("com.android.permissioncontroller:id/permission_allow_button");
        allow.click();
        Thread.sleep(6000);
        MobileElement ok = driver.findElementById("com.meesho.supply.debug:id/download_status_okay");
        ok.click();
        Thread.sleep(5000);

    }

}
