package test;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.ZerodhaLogin;
import utility.Excel;
import utility.OpenBrowser;
import utility.Screenshot;

public class LoginTest {
	WebDriver driver;
	@BeforeMethod
	public void openingBrowser()	{
		driver = OpenBrowser.chrome("https://kite.zerodha.com/");
	}
	
	@AfterMethod
	public void closingBrowser()	{
		driver.close();
	}
	
	@Test(priority=0)
	public void loginWithValidData() throws EncryptedDocumentException, IOException, InterruptedException	{
		ZerodhaLogin zerodha = new ZerodhaLogin(driver);
		String userName = Excel.getData("Zerodha", 1, 0);
		zerodha.enterUserid(userName);
		String pass = Excel.getData("Zerodha", 1, 1);
		zerodha.enterPassword(pass);
		zerodha.clickLogin();
		Thread.sleep(2000);
		Screenshot.getScreenshot(driver, "loginWithValidData1");
		String pinValue = Excel.getData("Zerodha", 1, 2);
		zerodha.enterPin(pinValue);
		zerodha.clickContinue();
		Thread.sleep(1000);
		Screenshot.getScreenshot(driver, "loginWithValidData2");
	}
	
	@Test(priority=1)
	public void signupPage() throws IOException	{
		ZerodhaLogin zerodha = new ZerodhaLogin(driver);
		zerodha.clickSignup();
		ArrayList<String> list = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window(list.get(1));
		Screenshot.getScreenshot(driver,"SignupPage");
		
	}
	
	@Test(priority=2)
	public void forgotIdPass() throws IOException	{
		ZerodhaLogin zerodha = new ZerodhaLogin(driver);
		zerodha.clickforgotUserId();
		Screenshot.getScreenshot(driver,"forgotIdPass");
	}

}
