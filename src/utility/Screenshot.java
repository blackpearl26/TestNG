package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	public static void getScreenshot(WebDriver driver, String name) throws IOException	{
		String time = DateTime.getTime();
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("D:\\automation notes\\selenium\\Screenshot\\TestNG\\"+name+ time+".jpeg");
		FileHandler.copy(source, destination);
	}

}
