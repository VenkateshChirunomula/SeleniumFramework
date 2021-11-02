package drivers;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import constants.PropertiesFileManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	private static WebDriver driver;
	public static WebDriver getDriver()
	{
		if (Objects.isNull(driver)) {


			if(PropertiesFileManager.getProperty("browser").toString().equalsIgnoreCase("chrome")) {

				WebDriverManager.chromedriver().setup();

				driver=new ChromeDriver();
			}

			if(PropertiesFileManager.getProperty("browser").toString().equalsIgnoreCase("firefox")) {

				WebDriverManager.firefoxdriver().setup();

				driver=new FirefoxDriver();
			}



		}
		return driver;
	}

	public static void quitDriver()

	{
		if (Objects.nonNull(driver)) {
			driver.quit();
		}

	}



}
