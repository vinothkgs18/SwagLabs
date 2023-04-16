package TestRunner;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import POJO.saucedemoPOJO;
import TestBase.Base;

public class Sorting extends Base {
public saucedemoPOJO saucedemo;
	
	@BeforeClass
	public void openBrowser() {
		System.out.println(Sorting.class);
		
	}
	
	@BeforeMethod
	@Parameters({"userName", "password"})
	public void BM(String a, String b) {
		chromeAcces();
		LaunchUrl("https://www.saucedemo.com/");
		saucedemo= new saucedemoPOJO();
		fill(saucedemo.getUserName(),a);
		fill(saucedemo.getPassword(),b);
		click(saucedemo.getLoginButton());
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
	public void sorting_Name_Z_A(){
		saucedemo= new saucedemoPOJO();
		//click(saucedemo.getSortingDropDown());
		Select sc= new Select(saucedemo.getSortingDropDown());
		sc.selectByIndex(1);
		Assert.assertEquals(saucedemo.getProductList().get(5).getText(),"Sauce Labs Backpack");
	}
	
	@Test
	public void sorting_Name_A_Z(){
		saucedemo= new saucedemoPOJO();
		//click(saucedemo.getSortingDropDown());
		Select sc= new Select(saucedemo.getSortingDropDown());
		sc.selectByIndex(0);
		Assert.assertEquals(saucedemo.getProductList().get(5).getText(),"Test.allTheThings() T-Shirt (Red)");
	}
	
	@Test
	public void sorting_Price_Low_High(){
		saucedemo= new saucedemoPOJO();
		//click(saucedemo.getSortingDropDown());
		Select sc= new Select(saucedemo.getSortingDropDown());
		sc.selectByIndex(2);
		Assert.assertEquals(saucedemo.getProductList().get(5).getText(),"Sauce Labs Fleece Jacket");
	}
	
	@Test
	public void sorting_Price_High_Low(){
		saucedemo= new saucedemoPOJO();
		//click(saucedemo.getSortingDropDown());
		Select sc= new Select(saucedemo.getSortingDropDown());
		sc.selectByIndex(3);
		Assert.assertEquals(saucedemo.getProductList().get(5).getText(),"Sauce Labs Onesie");
	}
	
	

}
