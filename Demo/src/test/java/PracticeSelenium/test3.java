package PracticeSelenium;

import java.net.MalformedURLException;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class test3 {
	@Test(description = "Firefox Test")
	public void firefox_test() throws MalformedURLException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\DockerSelenium\\Demo\\geckodriver.exe");
		RemoteWebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
		driver.quit();
	}

}
