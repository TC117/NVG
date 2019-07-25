package test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo2 {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	@Test
	public void NVG_1() throws InterruptedException{
			
		//goto google.com
		driver.get("https://stage.anibis.ch/fr/default.aspx");
		Thread.sleep(1000);
		//enter text in search textbox
//		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		
		//click on search button
		//driver.findElement(By.name("btnK")).click();
//		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
	}
	
	@Test
	public void googleSearch3() {
			
		//goto google.com
		driver.navigate().to("https://www.google.com.vn");;
		
		//enter text in search textbox
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		
		//click on search button
		//driver.findElement(By.name("btnK")).click();
//		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
	}
	@AfterTest
	public void tearDownTest() {
		
		//close browser
				driver.close();
				driver.quit();
				System.out.println("Test Completed Successfully");
		
	}

}
