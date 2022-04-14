package project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Blaze_Demo_Project 
{
	WebDriver driver;
	Select s;
	@BeforeTest
	public void beforeTest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\OneDrive\\Documents\\Automation Testing\\Browser Extension\\chromedriver.exe");
	    driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		  
	}
  
	@Test
    public void BlazeDemo() throws InterruptedException, Exception 
    {
		 driver.get("https://blazedemo.com/");
		 Thread.sleep(2000);
		 s = new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[1]")));
		 s.selectByIndex(4);
	     Thread.sleep(2000);
	     s=new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[2]")));
		 s.selectByVisibleText("Rome");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[3]/td[1]/input")).sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[2]/form/div[1]/div/input")).sendKeys("Vrushali");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[2]/form/div[2]/div/input")).sendKeys("Ahmednagr");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[2]/form/div[3]/div/input")).sendKeys("Ahmednagar");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[2]/form/div[4]/div/input")).sendKeys("Maharashtra");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[2]/form/div[5]/div/input")).sendKeys("635653");
		 Thread.sleep(2000);
		 s=new Select(driver.findElement(By.xpath("//*[@id=\"cardType\"]")));
		 s.selectByIndex(1);
		 Thread.sleep(2000);
		 
		 WebElement aa = driver.findElement(By.xpath("/html/body/div[2]/form/div[7]/div/input")); //Enter number
		 String a = Keys.chord(Keys.CONTROL, "a");
		 aa.sendKeys(a);
		 aa.sendKeys("3435");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("/html/body/div[2]/form/div[8]/div/input")).sendKeys("01");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[2]/form/div[9]/div/input")).sendKeys("2022");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[2]/form/div[10]/div/input")).sendKeys("Vrushali");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/label/input")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
		 Thread.sleep(2000);
		 
		//How to Take Screenshort
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src,new File(".\\bank_DropAndDrop.java_HomeTab.png"));
			Thread.sleep(2000);
			
			//How to Scroll Down
			  JavascriptExecutor js=(JavascriptExecutor)driver;//Type cast
			  Thread.sleep(2000);
			  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			  Thread.sleep(2000);
	}
 
    @AfterTest
    public void afterTest() 
    {
    	driver.close();
    }

}
