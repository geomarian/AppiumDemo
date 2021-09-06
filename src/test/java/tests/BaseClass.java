package tests;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

//	AppiumDriver<MobileElement>driver;
	AndroidDriver driver;
	
	@BeforeTest
	public void setUp() {

		
		try {
			DesiredCapabilities caps = new DesiredCapabilities();
			
			caps.setCapability("no",true);
			caps.setCapability("newCommandTimeout", 100000);
			caps.setCapability("noReset", true);
//	caps.setCapability("platformName","ANDROID");
			caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
//	caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "OPPO A71k");
			caps.setCapability(MobileCapabilityType.UDID, "d3b49600");
			caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
//	caps.setCapability(MobileCapabilityType.APP,"");
	//		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		
			File file = new File("E:\\GEO\\com.flipkart.android.apk");
			caps.setCapability("app", file.getAbsolutePath());
			
			
//			caps.setCapability("appPackage","u0 com.hmh.api");
//			caps.setCapability("appActivity","com.hmh.api.ApiDemos");
//			caps.setCapability("automationName", "selendroid");
//			caps.setCapability("noRest", true);
	        
			//URL url = new URL("http://127.0.1.1:4723/wd/hub");
		
	//	driver = new AppiumDriver<MobileElement>(url,caps);
		driver = new AndroidDriver(new URL("http://192.168.43.10:4723/wd/hub"), caps);
		
		
		
		} catch (MalformedURLException exp) {
			// TODO Auto-generated catch block
			System.out.println("Cause is: " +exp.getCause());
			System.out.println("Message is " +exp.getMessage());
			exp.printStackTrace();
		}

	}
	
	@Test
	public void sampleTest() {
		System.out.println("I am inside");
	}

	@AfterTest
	public void tearDown() {
		//driver.quit();
	}
}
