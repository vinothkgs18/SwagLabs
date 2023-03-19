package POJO;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.Base;

public class saucedemoPOJO extends Base {
	public saucedemoPOJO() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='login_logo']")
	private WebElement pageLogoText;
	
	@FindBy(id="user-name")
	private WebElement userName;
	
	@FindBy(id="password")
	private WebElement password;
	
	
	@FindBy(id="login-button")
	private WebElement loginButton;
	
	@FindBy(xpath="//h3[@data-test='error']")
	private WebElement loginError;
	
	@FindBy(tagName = "h4")
	private List<WebElement> textInHome;
	//-------------------------------------------------------------------------------------------------------
	//public methods


	public WebElement getPageLogoText() {
		return pageLogoText;
	}


	public WebElement getUserName() {
		return userName;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getLoginButton() {
		return loginButton;
	}


	public WebElement getLoginError() {
		return loginError;
	}


	public List<WebElement> getTextInHome() {
		return textInHome;
	}
	
	
	
	
	

	
	

}
