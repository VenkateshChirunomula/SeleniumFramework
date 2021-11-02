package tests;

import org.testng.annotations.Test;

import drivers.Driver;

public class TC001 extends BaseTest {

	
	@Test
	public void getTitle()
	{
		System.out.println(Driver.getDriver().getTitle());
		System.out.println(Driver.getDriver().getCurrentUrl());
	}
}
