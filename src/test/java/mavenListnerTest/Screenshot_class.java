package mavenListnerTest;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.TakesScreenshot;

public class Screenshot_class {
	
	public static WebDriver driver;

	public static void launchBrowser() throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\eclipse_workspace\\seleniium\\driver\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("https://www.google.co.in");
	   System.out.println(driver);
	   Thread.sleep(2000);
	}
	
	public static void ScreenshotMethod() throws IOException {
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("E:\\eclipse\\eclipse_workspace\\TestNG\\Screenshot\\test.png"));
	}

}
