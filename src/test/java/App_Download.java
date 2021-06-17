import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.annotations.Test;

public class App_Download extends AppBase{
    @Test
    public void DownloadTest() throws  InterruptedException{
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

        MobileElement sari_icon =driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/androidx.viewpager.widget.ViewPager[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView[2]");
        sari_icon.click();
        Thread.sleep(5000);
        MobileElement icon =driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.ImageView");
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
