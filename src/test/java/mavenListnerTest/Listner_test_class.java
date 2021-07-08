package mavenListnerTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(mavenListnerTest.CustomListner.class)
public class Listner_test_class extends Screenshot_class{
	
	@BeforeMethod
	public void browserLaunch() throws InterruptedException  {
	  launchBrowser(); 
	}
	@Test
	public void googleTest() {
		//WebDriver d=super.driver;
		driver.getTitle();
		//Assert.fail();
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}

}
