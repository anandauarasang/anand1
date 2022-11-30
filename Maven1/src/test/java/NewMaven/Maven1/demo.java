package NewMaven.Maven1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {
	@Test
	   public void browser()
	   {
		   WebDriverManager.firefoxdriver().setup();
		   WebDriver driver = new FirefoxDriver();
		   System.out.println("open the application");
	   }

}
