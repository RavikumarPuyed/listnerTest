package singleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonPage {
	
	private static SingletonPage instance=null;
	private WebDriver driver;
	private SingletonPage(){}
	
	public WebDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\eclipse_workspace\\seleniium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		return driver;
		
	}
	
	public SingletonPage getInstance() {
		if(instance==null) {
			instance=new SingletonPage();
		}
		return instance;
	}
	
	
	
}
