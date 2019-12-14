package org.amazon.base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.amazon.utils.LearnExcel;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class ProjectSpecificMethods {
	
	public static ChromeDriver driver;
	public String excelFileName;
	
	
	@BeforeMethod
	public void login() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
	}
	
	
	@AfterMethod
	public void closeApp() {
		driver.quit();
	}
	
	@DataProvider(name = "fetchData")
	public String[][] getData() throws IOException {
		LearnExcel readData = new LearnExcel();
		return readData.readExcel(excelFileName);
				
	}
	
	
	

}
