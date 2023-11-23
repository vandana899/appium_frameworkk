package frame;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.io.IOException;
import java.sql.Driver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.offset.PointOption;

public class test_case extends capabilities {
	
	AndroidDriver<AndroidElement> driver;
		@BeforeTest
		
		public void KillAllProcesses() throws IOException, InterruptedException {
			service = startServer();
		    driver= hybrid_capabilities(appactivity, apppackage, deviceName, chromeexcutable);
			}
			
		
		@Test(enabled=false)
		public void tc1() throws IOException, InterruptedException {
			service = startServer();
			AndroidDriver<AndroidElement> driver= hybrid_capabilities(appactivity, apppackage, deviceName, chromeexcutable);

		
			
			Thread.sleep(5000);
			driver.findElement(MobileBy.id("android:id/text1")).click();
			
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"))").click();
		    Thread.sleep(3000);
			driver.findElement(MobileBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("vandana");
			
		
			driver.findElement(MobileBy.id("com.androidsample.generalstore:id/radioFemale")).click();
			Thread.sleep(3000);
			driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
			Thread.sleep(3000);
			service.stop();
}
		@Test
		public void khanacademy() throws InterruptedException, IOException {
			AndroidDriver<AndroidElement> driver= hybrid_capabilities(appactivity, apppackage, deviceName, chromeexcutable);
			Thread.sleep(8000);
			driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.Button/android.widget.TextView")).click();
			Thread.sleep(3000);
			driver.findElementByAndroidUIAutomator("text(\"Sign up with email\")").click();
			Thread.sleep(3000);
			driver.findElement(MobileBy.AccessibilityId("First name")).sendKeys("Vandana");
			Thread.sleep(3000);
			driver.findElement(MobileBy.AccessibilityId("Last name")).sendKeys("Raheja");
			Thread.sleep(3000);
			driver.findElementByAndroidUIAutomator("text(\"Birthday\")").click();
			Thread.sleep(8000);
//			driver.findElements(MobileBy.id("android:id/numberpicker_input")).get(19).click();
//			Thread.sleep(3000);
		//	driver.findElementByAndroidUIAutomator("text(\"20\")");
		//	driver.findElementByAndroidUIAutomator("text(\"01\")").sendKeys("20");
		//	TouchAction ta= new TouchAction(driver);
		//	ta.longPress(longPressOptions().withElement(element(ele1)).withDuration(ofSeconds(3))).moveTo(element(ele2)).release().perform();
			
			AndroidElement ele1=	driver.findElementByAndroidUIAutomator("text(\"2000\")");
			AndroidElement ele2=	driver.findElementByAndroidUIAutomator("text(\"2001\")");
			Thread.sleep(3000);
			TouchAction ta= new TouchAction(driver);
			ta.longPress(longPressOptions().withElement(element(ele1)).withDuration(ofSeconds(3))).moveTo(element(ele2)).release().perform();
			Thread.sleep(3000);
			driver.findElementByAndroidUIAutomator("text(\"01\")").sendKeys("20");
			Thread.sleep(3000);
			driver.findElement(MobileBy.id("android:id/button1")).click();
			Thread.sleep(3000);
			driver.findElement(MobileBy.AccessibilityId("Email address")).sendKeys("vandanaraheja111@gmail.com");
			Thread.sleep(3000);
			driver.findElement(MobileBy.xpath("//android.widget.EditText[@content-desc=\"Password\"]")).sendKeys("Vandu papa 123");
			Thread.sleep(3000);
			driver.findElementByAndroidUIAutomator("text(\"CREATE\")").click();
			Thread.sleep(3000);
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			Thread.sleep(3000);
			driver.findElementByAndroidUIAutomator("text(\"Sign in\")").click();
			Thread.sleep(3000);
			driver.findElement(MobileBy.AccessibilityId("Enter an e-mail address or username")).sendKeys("vandanaraheja111@gmail.com");
			Thread.sleep(3000);
			driver.findElement(MobileBy.AccessibilityId("Password")).sendKeys("Vandu papa 123");
			Thread.sleep(3000);
			driver.findElement(MobileBy.AccessibilityId("Sign in")).click();
			Thread.sleep(3000);
			
			//driver.findElement(MobileBy.id("android:id/autofill_save_no")).click();
			//Thread.sleep(3000);
			driver.findElement(MobileBy.AccessibilityId("Search tab")).click();
			Thread.sleep(3000);
			int size=driver.findElements(MobileBy.className("android.widget.ScrollView")).size();
			Thread.sleep(3000);
			System.out.println(size);
			Thread.sleep(3000);
			driver.findElementByAndroidUIAutomator("text(\"Math\")").click();
			Thread.sleep(3000);
			driver.findElementByAndroidUIAutomator("text(\"Class 8 (Foundation) - Hindi\")").click();
		    //Thread.sleep(13000);
		    //driver.findElementByAndroidUIAutomator("text(\"Class 12 math (India)\")").click();
			//Thread.sleep(3000);
		    //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().class(\"android.view.ViewGroup\")).scrollIntoView(new UiSelector().text(\"Comparing quantities (Hindi)\"))");
			//Thread.sleep(10000);
			//int size1=driver.findElements(MobileBy.id("android.view.ViewGroup")).size();
			//Thread.sleep(3000);
		    //System.out.println(size1);
		    //Thread.sleep(3000);
			//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Rational numbers (Hindi)\"))").click();
	        Thread.sleep(3000);
//	        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Inverse property of addition (Hindi)\"))").click();
//	        Thread.sleep(5000);
	        TouchAction tee=new TouchAction(driver);
			Thread.sleep(10000);
			//tee.longPress(PointOption.point(1045,621)).moveTo(PointOption.point(25, 612)).release().perform();
			tee.longPress(PointOption.point(504,1974)).moveTo(PointOption.point(532,1420)).release().perform();
			Thread.sleep(7000);
			 driver.findElementByAndroidUIAutomator("text(\"Rational numbers (Hindi)\")").click();
		     Thread.sleep(3000);
				
		     driver.findElementByAndroidUIAutomator("text(\"Intro to rational & irrational numbers (Hindi)\")").click();
		     Thread.sleep(3000);
				
				
	       driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View[2]")).click();
//	        driver.findElement(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Pause\"]/android.widget.ImageView")).click();
//	        Thread.sleep(5000);
	        driver.pressKey(new KeyEvent(AndroidKey.BACK));
			Thread.sleep(3000);
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			Thread.sleep(3000);
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			Thread.sleep(3000);
//			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Rational numbers (Hindi)\"))").click();
//	        Thread.sleep(3000);
//	        driver.findElementByAndroidUIAutomator("text(\"Class 4 math (India)\")").click();
//			Thread.sleep(3000);
			TouchAction tee1=new TouchAction(driver);
			Thread.sleep(10000);
			tee1.longPress(PointOption.point(466,1919)).moveTo(PointOption.point(548,1365)).release().perform();
			Thread.sleep(7000);
	        
			driver.findElementByAndroidUIAutomator("text(\"Class 1 math (India)\")").click();
		    Thread.sleep(3000);
		    TouchAction tee3=new TouchAction(driver);
			Thread.sleep(10000);
			tee3.longPress(PointOption.point(422,2023)).moveTo(PointOption.point(592,280)).release().perform();
			Thread.sleep(7000);
			driver.findElementByAndroidUIAutomator("text(\"Numbers from 1 to 100\")").getText();
		    Thread.sleep(3000);
		    driver.findElement(MobileBy.className("android.widget.TextView")).getText();
		    Thread.sleep(5000);
		    driver.findElementByAndroidUIAutomator("text(\"Numbers from 1 to 100\")").click();
		     Thread.sleep(3000);
//			for (int i =0;i<size;i++)
//			{
//				
//			String van=driver.findElements(MobileBy.className("android.widget.TextView")).get(i).getText();
//			System.out.println(van);
//			Thread.sleep(3000);
//			System.out.println(van);
//			}
				
		    
		    
		    
		    
	        
//		    driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup")).click();
//		    Thread.sleep(5000);
		    driver.findElementByAndroidUIAutomator("text(\"Count tens\")").click();
		     Thread.sleep(3000);
		    
		    driver.pressKey(new KeyEvent(AndroidKey.BACK));
			Thread.sleep(3000);
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			Thread.sleep(3000);
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			Thread.sleep(3000);
	        
			 driver.findElementByAndroidUIAutomator("text(\"Class 7 (Foundation) - Hindi\")").click();
		     Thread.sleep(3000);
		     AndroidElement ele3=	driver.findElementByAndroidUIAutomator("text(\"Whole numbers (Hindi)\")");
				AndroidElement ele4=	driver.findElementByAndroidUIAutomator("text(\"Playing with numbers (Hindi)\")");
				Thread.sleep(3000);
				TouchAction touch= new TouchAction(driver);
				touch.longPress(longPressOptions().withElement(element(ele3)).withDuration(ofSeconds(3))).moveTo(element(ele4)).release().perform();
				Thread.sleep(3000);
		     driver.findElementByAndroidUIAutomator("text(\"Playing with numbers (Hindi)\")").click();
		     Thread.sleep(3000);
	        
		     driver.findElementByAndroidUIAutomator("text(\"Prime factorization exercise (Hindi)\")").click();
		     Thread.sleep(5000);
	        
		     driver.pressKey(new KeyEvent(AndroidKey.BACK));
				Thread.sleep(3000);
				driver.pressKey(new KeyEvent(AndroidKey.BACK));
				Thread.sleep(3000);
				driver.pressKey(new KeyEvent(AndroidKey.BACK));
				Thread.sleep(3000);
				Thread.sleep(3000);
				driver.pressKey(new KeyEvent(AndroidKey.BACK));
				Thread.sleep(3000);
	        
				driver.findElement(MobileBy.AccessibilityId("Explore tab")).click();
				Thread.sleep(3000);
	        
	        driver.findElement(MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Settings\"]")).click();
			
			
	        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Sign out\"))").click();
			
			driver.findElement(MobileBy.id("android:id/button1")).click();
			
			Thread.sleep(3000);
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			Thread.sleep(3000);
			
			
			//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().xpath(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().text(\"Jordan Lift Off\"))");
			//Thread.sleep(10000);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			service.stop();
			
			
			
			
		}
		
		
		
		
		
		
		
		
}