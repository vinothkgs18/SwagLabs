package TestRunner;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import POJO.saucedemoPOJO;
import TestBase.Base;

public class Inventory extends Base{
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
		
	}
	
	@Test
	@Parameters({"userName","password"})
	public void productAddToCart(String a, String b) {
		saucedemo= new saucedemoPOJO();
		fill(saucedemo.getUserName(),a);
		fill(saucedemo.getPassword(),b);
		click(saucedemo.getLoginButton());
		String exp = saucedemo.getProductList().get(5).getText();
		click(saucedemo.getCartButtons().get(5));
		click(saucedemo.getCartIcon());
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/cart.html");
		Assert.assertEquals(saucedemo.getProductListInCart().get(0).getText(), exp);
		
		
	}
	
	
	
	

}
