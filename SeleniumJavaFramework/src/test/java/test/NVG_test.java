package test;

import pages.NVGLogin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NVG_test {
	
	WebDriver driver = null;
	//default page
	By btnLogin = By.xpath("//a[@id='ctl00_Header1_ctlHeaderMetaBar_ucMainLinks_hypMyAnibis']");
	//Login page
	By titlepri = By.xpath("//h1[@class='primary-title']");
	By input_user = By.xpath("//input[@id='ctl00_phlContent_ctlEmailValidationBox_txtEmail']");
	By btnSubmit = By.xpath("//a[@id='ctl00_phlContent_ctlEmailValidationBox_lbtContinue']");
	By input_pass = By.xpath("//input[@id='ctl00_phlContent_txtPassword']");
	By btnLoginSubmit = By.xpath("//span[contains(text(),'Se connecter')]");
	By Logoutbtn = By.xpath("//div[@id='ctl00_Header1_ctlHeaderActionBar_ctlMemberNavigation_divLogout']//a");
	//Search page
	By Searchbtn = By.xpath("//span[@id='ctl00_Header1_ctlHeaderMetaBar_ucMainLinks_spSearchLongText']");
	By Catagorybtn = By.xpath("//a[@class='category-link modal-opener']");
	By Immobiliercat = By.xpath("//span[text()='Immobilier']");
	By CatApllybtn = By.xpath("//a[@id='ctl00_phlContent_ModalDialogCategoryBrowser_lnkBrowserCategoryApply']");
	By PriceFromtext = By.xpath("//input[@id='ctl00_phlContent_Filter_ctlPriceRange_txtFrom']");
	By PriceTotext = By.xpath("//input[@id='ctl00_phlContent_Filter_ctlPriceRange_txtTo']");
	By ApplybtnofPrice = By.xpath("//div[text()='Prix']//following-sibling::a[@id='ctl00_phlContent_Filter_btnSearch']");
	By Locationtext = By.xpath("//div[@id='ctl00_phlContent_Filter_ctlLocation_ctlLocationAutocomplete_divLocation']");
	By DistanceDropdown = By.xpath("//select[@id='ctl00_phlContent_Filter_ctlLocation_ddlDistance']");
	By ApplybtnofLocation = By.xpath("//div[contains(text(),'Où')]//following-sibling::a[@id='ctl00_phlContent_Filter_btnSearch']");
	
	@BeforeTest
	public void setUpTest() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

//	@Test
//	public void NVG_1() throws Exception {
//
//		driver.navigate().to("https://stage.anibis.ch/fr/default.aspx");
//		driver.findElement(btnLogin).click();
//		WebElement title = driver.findElement(titlepri);
//		System.out.println(title.getText());
//		Assert.assertTrue(title.getText().equals("Se connecter / S’inscrire"));
//	}
	
//	@Test
//	public void NVG_2() throws Exception {
//
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
	
//	@Test()
//	public void NVG_3() throws Exception {
//
//		driver.navigate().to("https://stage.anibis.ch/fr/default.aspx");
//		driver.findElement(btnLogin).click();
//		WebElement title = driver.findElement(titlepri);
//		System.out.println(title.getText());
//		WebElement username = driver.findElement(input_user);
//		username.sendKeys("buyer.nvg01@gmail.com");
//		WebElement Submit = driver.findElement(btnSubmit);
//		Submit.click();
//		WebElement password = driver.findElement(input_pass);
//		password.sendKeys("nvg07072012");
//		WebElement Loginbtn = driver.findElement(btnLoginSubmit);
//		Loginbtn.click();
//		WebDriverWait wait = new WebDriverWait(driver, 60);
//		WebElement logout = driver.findElement(Logoutbtn);
//		wait.until(ExpectedConditions.elementToBeClickable(logout));
//		System.out.println(logout.getText());
//		Assert.assertTrue(logout.getText().equals("Se déconnecter"));
//		
//	}
	
//	@Test()
//	public void NVG_4() throws Exception {
//	
//		driver.navigate().to("https://stage.anibis.ch/fr/default.aspx");
//		driver.findElement(btnLogin).click();
//		WebElement username = driver.findElement(input_user);
//		username.sendKeys("buyer.nvg01@gmail.com");
//		WebElement Submit = driver.findElement(btnSubmit);
//		Submit.click();
//		WebElement password = driver.findElement(input_pass);
//		password.sendKeys("nvg07072012");
//		WebElement Loginbtn = driver.findElement(btnLoginSubmit);
//		Loginbtn.click();
//		WebDriverWait wait = new WebDriverWait(driver, 600);
//		WebElement logout = driver.findElement(Logoutbtn);
//		wait.until(ExpectedConditions.elementToBeClickable(logout));
//		WebElement Search = driver.findElement(Searchbtn);
//		Search.click();
//		WebElement Catagory = driver.findElement(Catagorybtn);
//		Catagory.click();
//		WebElement Imo = driver.findElement(Immobiliercat);
//		Imo.click();
//		WebElement CatApply = driver.findElement(CatApllybtn);
//		CatApply.click();
//		WebElement Pricefrom = driver.findElement(PriceFromtext);
//		WebElement Priceto = driver.findElement(PriceTotext);
//		Pricefrom.sendKeys("1000");
//		Priceto.sendKeys("5000");
//		WebElement Applyforprice = driver.findElement(ApplybtnofPrice);
//		Applyforprice.click();
//		WebElement Location = driver.findElement(Locationtext);
//		wait.until(ExpectedConditions.elementToBeClickable(Location));
//		Location.click();
//		Location.sendKeys("Zurich");
//		Select Distance = new Select (driver.findElement(DistanceDropdown));
//		Distance.selectByVisibleText("10 km");
//		WebElement Applyforlocation = driver.findElement(ApplybtnofLocation);
//		Applyforlocation.click();
//	}
	
	@Test()
	public void NVG_5() throws Exception {
	
		driver.navigate().to("https://stage.anibis.ch/fr/default.aspx");
		driver.findElement(btnLogin).click();
		WebElement username = driver.findElement(input_user);
		username.sendKeys("buyer.nvg01@gmail.com");
		WebElement Submit = driver.findElement(btnSubmit);
		Submit.click();
		WebElement password = driver.findElement(input_pass);
		password.sendKeys("nvg07072012");
		WebElement Loginbtn = driver.findElement(btnLoginSubmit);
		Loginbtn.click();
		WebDriverWait wait = new WebDriverWait(driver, 600);
		WebElement logout = driver.findElement(Logoutbtn);
		wait.until(ExpectedConditions.elementToBeClickable(logout));
		WebElement Search = driver.findElement(Searchbtn);
		Search.click();
		WebElement Catagory = driver.findElement(Catagorybtn);
		Catagory.click();
		WebElement Imo = driver.findElement(Immobiliercat);
		Imo.click();
		WebElement CatApply = driver.findElement(CatApllybtn);
		CatApply.click();
		WebElement Pricefrom = driver.findElement(PriceFromtext);
		WebElement Priceto = driver.findElement(PriceTotext);
		Pricefrom.sendKeys("1000");
		Priceto.sendKeys("5000");
		WebElement Applyforprice = driver.findElement(ApplybtnofPrice);
		Applyforprice.click();
		WebElement Location = driver.findElement(Locationtext);
		wait.until(ExpectedConditions.elementToBeClickable(Location));
		Location.click();
		Location.sendKeys("Zurich");
		Select Distance = new Select (driver.findElement(DistanceDropdown));
		Distance.selectByVisibleText("10 km");
		WebElement Applyforlocation = driver.findElement(ApplybtnofLocation);
		Applyforlocation.click();
	}
	
	@AfterTest
	public void tearDownTest() {
		
		//close browser
				driver.close();
				driver.quit();
				System.out.println("Test Completed Successfully");
		
	}

}
