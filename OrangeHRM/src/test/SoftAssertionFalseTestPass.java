package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftAssertionFalseTestPass {
	
	@Test
	public void testNGAsserts() throws Exception{
		System.setProperty("webdriver.gecko.driver", "D:\\testing\\Selenium\\geckodriver-v0.23.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//Test Condition 1: If Page title matches with actualTitle then it finds email title and enters the value which we pass
		
		String actualTitle = "Gmail";
		Assert.assertEquals(driver.getTitle(), actualTitle);
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("Selenium");
	}
	
	@Test
	public void failTestDemo()
	{
		//Test Condition 2: If page title did not match with actualTitle then script throws an exception
		System.setProperty("webdriver.gecko.driver", "D:\\testing\\Selenium\\geckodriver-v0.23.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		String actualTitle = "GoogleMail";
		//Assert.assertEquals(driver.getTitle(), actualTitle, "Title not matched");
		Assert.assertEquals(driver.getTitle(), actualTitle);
	}
}
