package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLogin {
	
	@FindBy(xpath = "//input[@id='userid']") private WebElement userid;
	@FindBy(xpath = "//input[@id='password']") private WebElement password;
	@FindBy(xpath = "//button[@type='submit']") private WebElement login;
	@FindBy(xpath = "//a[text()='Forgot user ID or password?']") private WebElement forgotID;
	@FindBy(xpath = "//a[text()=\"Don't have an account? Signup now!\"]") private WebElement signup;
	@FindBy(xpath = "//input[@id='pin']") private WebElement pin;
	@FindBy(xpath = "//button[@type='submit']") private WebElement open;
	@FindBy(xpath = "//input[@type='text']") private WebElement searchbar;
	
	
	public ZerodhaLogin(WebDriver driver)	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserid(String userName)	{
		userid.sendKeys(userName);
	}
	
	public void  enterPassword(String pass)	{
		password.sendKeys(pass);
	}
	
	public void clickLogin()	{
		login.click();
	}
	
	public void clickforgotUserId()	{
		forgotID.click();
	}
	
	public void clickSignup()	{
		signup.click();
	}
	
	public void enterPin(String pinValue)	{
		pin.sendKeys(pinValue);
	}
	
	public void clickContinue()	{
		open.click();
	}
	
	public void searchStock(String stockName)	{
		searchbar.sendKeys(stockName);
	}
	
	
	
	
	

}
