package PracticeSelenium;

import java.net.MalformedURLException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class test1 {
	
	@Test(description = "Chrome Test")
	public void google_test() throws MalformedURLException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\DockerSelenium\\Demo\\chromedriver-win64\\chromedriver.exe");			   
		RemoteWebDriver driver =  new ChromeDriver();
		driver.get("https://faceboook.com");
		driver.quit();
	}

}