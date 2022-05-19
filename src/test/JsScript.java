package test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JsScript {

	@Test
	
	public void login() {
				System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				JavascriptExecutor js = (JavascriptExecutor)driver;
				driver.manage().window().maximize();
				driver.get("https://www.browserstack.com/users/sign_in");
				js.executeScript("document.getElementById('user_email_login').value='rbc@xyz.com';");
				js.executeScript("document.getElementById('user_password').value='password';");
				js.executeScript("document.getElementById('user_submit').click();");
				js.executeScript("alert('enter correct login credentials to continue');");
				sleep(10000);
				}
	
	@Test
	public void login2() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pictures\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	driver.manage().window().maximize();
	driver.get("https://www.browserstack.com");
	js.executeAsyncScript("window.scrollBy(0,document.body.200)");
	}

				public static void sleep(int ms)
				{
				try

				{
				Thread.sleep(ms); 
				}
				catch(InterruptedException e)

				{
				e.printStackTrace();
				}
	}
}
