import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.annotations.Test;

public class App_Search extends AppBase {
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



    }
}