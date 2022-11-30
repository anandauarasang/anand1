package opal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCap {
	public static void main(String[]args)
	{
		   WebDriverManager.firefoxdriver().setup();
		   DesiredCapabilities caps = new DesiredCapabilities ();
		   caps.setAcceptInsecureCerts(true);
		   FirefoxOptions options = new FirefoxOptions();
		   options.merge(caps);
		   WebDriver driver = new FirefoxDriver(options);
		   driver.get("https:///cacert.com");
		   System.out.println(driver.getCurrentUrl());
	}

}
