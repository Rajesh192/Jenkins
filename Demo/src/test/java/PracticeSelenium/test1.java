package PracticeSelenium;

import java.net.MalformedURLException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test1 {
	@Parameters("Browser")
	@Test(description = "Chrome Test")
	public void google_test(String browserName) throws MalformedURLException {
		// TODO Auto-generated method stub
		RemoteWebDriver driver = null;
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\DockerSelenium\\Demo\\chromedriver-win64\\chromedriver.exe");			   
			driver =  new ChromeDriver();			
		}
		else {
			System.setProperty("webdriver.gecko.driver", "E:\\DockerSelenium\\Demo\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get("https://faceboook.com");
		driver.quit();
	}

}
