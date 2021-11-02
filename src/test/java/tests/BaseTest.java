package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import constants.PropertiesFileManager;
import drivers.Driver;

public class BaseTest {


	
	@BeforeTest	
	public void init()
	{
		Driver.getDriver().get(PropertiesFileManager.getProperty("url"));
	}

	@AfterTest
	public void tearDown()
	{
		Driver.quitDriver();
	}


}
