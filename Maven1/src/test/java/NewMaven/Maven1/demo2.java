package NewMaven.Maven1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo2 {
	@Test
	   public void browser()
	   {
		   WebDriverManager.chromedriver().setup();
		   WebDriver driver = new ChromeDriver();
		   System.out.println("close the application");

}
}
