package TestRunner;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.saucedemoPOJO;
import TestBase.Base;

public class HomePageText extends Base {
public saucedemoPOJO saucedemo;
	
	@BeforeClass
	public void openBrowser() {
		
	}
	
	@BeforeMethod
	public void BM() {
		chromeAcces();
		LaunchUrl("https://www.saucedemo.com/");
		System.out.println("CUrrent Start TIme==");
	}
	
	@AfterMethod
	public void AM() {
		System.out.println("Current End TIme");
		driver.quit();
	}
	
	@AfterClass
	public void closeBrowsers() {
		System.out.println("THis is After Class- Development inprogress");
		
	}
	
	@Test
	public void logoText() {
		saucedemo= new saucedemoPOJO();
		Assert.assertEquals(saucedemo.getPageLogoText().getText(),"Swag Labs");
	}
	
	@Test
	public void textInHome() {
		saucedemo= new saucedemoPOJO();
		Assert.assertEquals(saucedemo.getTextInHome().get(0).getText(),"Accepted usernames are:");
		Assert.assertEquals(saucedemo.getTextInHome().get(1).getText(),"Password for all users:");
	} 	
	
	
}
