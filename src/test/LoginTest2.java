package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM.ZerodhaLogin;
import utility.Excel;
import utility.OpenBrowser;

public class LoginTest2 {
	WebDriver driver;
	
	@DataProvider	(name = "LoginData")
	public Object[][] data()	{
		return new Object[][] {{"KCK081","sm23730983","261197"}};
	}

	@Test (dataProvider = "LoginData")
	public void login(String userName, String pass, String pinValue) throws InterruptedException{
		ZerodhaLogin zerodha = new ZerodhaLogin(driver);
		driver = OpenBrowser.chrome("https://kite.zerodha.com/");
		zerodha.enterUserid(userName);
		zerodha.enterPassword(pass);
		zerodha.clickLogin();
		Thread.sleep(2000);
		zerodha.enterPin(pinValue);
		zerodha.clickContinue();
		String stockName = "TATAMOTORS";
		zerodha.searchStock(stockName);
	}
	
	

}
