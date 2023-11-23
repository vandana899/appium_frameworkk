package frame;
import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
public class appium_case extends capabilities{
	AndroidDriver<AndroidElement> driver;
	@BeforeTest
	public void bt() throws IOException, InterruptedException {
    service=startServer();
    driver= hybrid_capabilities(appactivity, apppackage, deviceName, chromeexcutable);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
	}
	
	@Test(enabled=true)
	public void tc1() throws IOException, InterruptedException  {
    AndroidDriver<AndroidElement> driver=hybrid_capabilities(appactivity, apppackage, deviceName, chromeexcutable);
    Thread.sleep(3000);
    int size=driver.findElements(MobileBy.className("android.widget.ScrollView")).size();
    Thread.sleep(3000);
    System.out.println(size);
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@text=‘Science’]")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//*[@text=‘Class 9 Physics (India)’]")).click();
    Thread.sleep(6000);
    AndroidElement rr= driver.findElement(By.xpath("//*[@text=‘Average speed and average velocity’]"));
    rr.click();
    		
    Thread.sleep(5000);
    AndroidElement rr1= driver.findElement(By.xpath("//*[@text=‘Average speed & velocity (with examples)’]"));
    rr1.click();
    Thread.sleep(10000);
    driver.pressKey(new KeyEvent(AndroidKey.BACK));
    Thread.sleep(3000);
    driver.pressKey(new KeyEvent(AndroidKey.BACK));
    Thread.sleep(3000);
    driver.pressKey(new KeyEvent(AndroidKey.BACK));
    Thread.sleep(3000);
    System.out.println("operation complete");
    service.stop();		
}
}