package test;

import pages.NVGLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NVG_test {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

//	@Test
//	public void NVG_1() throws Exception {
//		By btnLogin = By.xpath("//a[@id='ctl00_Header1_ctlHeaderMetaBar_ucMainLinks_hypMyAnibis']");
//		By titlepri = By.xpath("//h1[@class='primary-title']");
//		driver.navigate().to("https://stage.anibis.ch/fr/default.aspx");
//		driver.findElement(btnLogin).click();
//		WebElement title = driver.findElement(titlepri);
//		System.out.println(title.getText());
//		Assert.assertTrue(title.getText().equals("Se connecter / S�inscrire"));
//	}
	
//	@Test
//	public void NVG_2() throws Exception {
//		By btnLogin = By.xpath("//a[@id='ctl00_Header1_ctlHeaderMetaBar_ucMainLinks_hypMyAnibis']");
//		By titlepri = By.xpath("//h1[@class='primary-title']");
//		By input_user = By.xpath("//input[@id='ctl00_phlContent_ctlEmailValidationBox_txtEmail']");
//		By btnSubmit = By.xpath("//a[@id='ctl00_phlContent_ctlEmailValidationBox_lbtContinue']");
//		By errText = By.xpath("//span[@id='ctl00_phlContent_ctlEmailValidationBox_txtEmail-error']");
//		driver.navigate().to("https://stage.anibis.ch/fr/default.aspx");
//		driver.findElement(btnLogin).click();
//		WebElement title = driver.findElement(titlepri);
//		System.out.println(title.getText());
//		WebElement username = driver.findElement(input_user);
//		username.sendKeys("Some random username");
//		WebElement Submit = driver.findElement(btnSubmit);
//		Submit.click();
//		WebElement error = driver.findElement(errText);
//		System.out.println(username.getCssValue("border-bottom-color"));
//		Assert.assertTrue(username.getCssValue("border-bottom-color").equals("rgba(208, 29, 0, 1)"));
//		Assert.assertTrue(error.getText().equals("Indiquez votre adresse e-mail"));
//	}
	
	@Test()
	public void NVG_3() throws Exception {
		By btnLogin = By.xpath("//a[@id='ctl00_Header1_ctlHeaderMetaBar_ucMainLinks_hypMyAnibis']");
		By titlepri = By.xpath("//h1[@class='primary-title']");
		driver.navigate().to("https://stage.anibis.ch/fr/default.aspx");
		By input_user = By.xpath("//input[@id='ctl00_phlContent_ctlEmailValidationBox_txtEmail']");
		By btnSubmit = By.xpath("//a[@id='ctl00_phlContent_ctlEmailValidationBox_lbtContinue']");
		By input_pass = By.xpath("//input[@id='ctl00_phlContent_txtPassword']");
		By btnLoginSubmit = By.xpath("//span[contains(text(),'Se connecter')]");
		By Logoutbtn = By.xpath("//div[@id='ctl00_Header1_ctlHeaderActionBar_ctlMemberNavigation_divLogout']//a");
		
		driver.findElement(btnLogin).click();
		WebElement title = driver.findElement(titlepri);
		System.out.println(title.getText());
		WebElement username = driver.findElement(input_user);
		username.sendKeys("buyer.nvg01@gmail.com");
		WebElement Submit = driver.findElement(btnSubmit);
		Submit.click();
		WebElement password = driver.findElement(input_pass);
		password.sendKeys("nvg07072012");
		WebElement Loginbtn = driver.findElement(btnLoginSubmit);
		Loginbtn.click();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement logout = driver.findElement(Logoutbtn);
		wait.until(ExpectedConditions.elementToBeClickable(logout));
		System.out.println(logout.getText());
		Assert.assertTrue(logout.getText().equals("Se d�connecter"));
		
	}
	
	@AfterTest
	public void tearDownTest() {
		
		//close browser
				driver.close();
				driver.quit();
				System.out.println("Test Completed Successfully");
		
	}

}