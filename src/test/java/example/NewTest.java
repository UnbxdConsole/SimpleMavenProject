package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	//Test Method  
	@Test
	public void testEasy() {

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/selenium/guru99home/");
		System.out.println("hisureeeee");

	}
}
