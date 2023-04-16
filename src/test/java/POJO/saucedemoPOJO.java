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
	
	@FindBy(xpath="//div[@class='login_logo']")
	private WebElement logo;
	
	@FindBy(id="login_credentials")
	private List<WebElement> userNameList;
	
	@FindBy(xpath="//div[@class='inventory_item_name']")
	private List<WebElement> productList;
	
	@FindBy(xpath="//button[@class='btn btn_primary btn_small btn_inventory']")
	private List<WebElement> cartButtons;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement cartIcon;
	
	@FindBy(xpath="//div[@class='inventory_item_name']")
	private List<WebElement> productListInCart;
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement sortingDropDown;
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


	public WebElement getLogo() {
		return logo;
	}
	
	public List<WebElement> getUserNameList() {
		return userNameList;
	}


	public List<WebElement> getProductList() {
		return productList;
	}


	public List<WebElement> getCartButtons() {
		return cartButtons;
	}


	public WebElement getCartIcon() {
		return cartIcon;
	}


	public List<WebElement> getProductListInCart() {
		return productListInCart;
	}


	public WebElement getSortingDropDown() {
		return sortingDropDown;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	

}
