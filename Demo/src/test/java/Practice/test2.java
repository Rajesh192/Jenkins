package Practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class test2 {
	@Test(description = "Chrome Test for Docker")
	public void firefox_test() throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setBrowserName("firefox");
		RemoteWebDriver driver = new RemoteWebDriver(new URL
				("http://localhost:4444/wd/hub"),capability);
		driver.get("https://google.com");
		driver.quit();
	}

}
