package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Practice {
	
	@Test
	@Parameters({"a","b"})
	public void test1(int a, int b)	{
		System.out.println("Test1 passed");
		System.out.println(a+b);
	}
	

	@Test
	@Parameters({"D","M","Y"})
	public void test2(int D, String M,int Y)	{
		System.out.println(D+M+Y);
		System.out.println("Test2 passed");
	}

	@DataProvider (name="TestData")
	public Object[][] data(){
		return new Object[][]{{"Selenium"},{"WebDriver"},{"automation"}};
		
	}

	@Test (dataProvider = "TestData")
	public void test3(String name)	{
		System.out.println(name);
		System.out.println("Test3 passed");
		
	}

	@Test
	public void test4()	{
		System.out.println("Test4 passed");
	}
}
