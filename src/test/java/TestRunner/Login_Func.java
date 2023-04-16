package TestRunner;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import POJO.saucedemoPOJO;
import TestBase.Base;
import TestBase.RetryFailed;

public class Login_Func extends Base {
	public saucedemoPOJO saucedemo;
	
	//<class name="TestRunner.Login_Func"/>
	//<class name="TestRunner.HomePageText"/>
	//<class name="TestRunner.Inventory"/>
	
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
		
	}
	
	@Test
	public void login_Scenario_1() {
		saucedemo=new saucedemoPOJO();
		fill(saucedemo.getUserName(), "standard_user");
		fill(saucedemo.getPassword(), "secret_sauce");
		click(saucedemo.getLoginButton());
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
		
	}
	@Test
	public void login_Scenario_2() {
		saucedemo=new saucedemoPOJO();
		fill(saucedemo.getUserName(), "standard_user");
		fill(saucedemo.getPassword(), "secret");
		click(saucedemo.getLoginButton());
		Assert.assertEquals(saucedemo.getLoginError().getText(), "Epic sadface: Username and password do not match any user in this service");
		
		
	}
	@Test
	public void login_Scenario_3() {
		saucedemo=new saucedemoPOJO();
		fill(saucedemo.getUserName(), "standard");
		fill(saucedemo.getPassword(), "secret_sauce");
		click(saucedemo.getLoginButton());
		Assert.assertEquals(saucedemo.getLoginError().getText(), "Epic sadface: Username and password do not match any user in this service");
		
		
	}
	
	@Test
	public void login_Scenario_4() {
		saucedemo=new saucedemoPOJO();
		fill(saucedemo.getUserName(), "standard");
		fill(saucedemo.getPassword(), "secret");
		click(saucedemo.getLoginButton());
		Assert.assertEquals(saucedemo.getLoginError().getText(), "Epic sadface: Username and password do not match any user in this service");
		
		
	}
	
	




}
