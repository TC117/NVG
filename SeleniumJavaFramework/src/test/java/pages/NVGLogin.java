package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NVGLogin {
	
	private WebDriver driver;	
	private static long defaultWait = Long.getLong("defaultWait",60);
	 /**
     * ##################################################
     * ### DECLARE
     * ##################################################
     */
    /**
     * General item
     */
	By Username = By.xpath("//input[@type='email']");
	By Password = By.xpath("//input[@type='password']");
	By button = By.xpath("//button[contains(@class, 'aut-button-login')]");
	
	By btnLogin = By.xpath("//a[@id='ctl00_Header1_ctlHeaderMetaBar_ucMainLinks_hypMyAnibis']");
	

	
    /**
     * ##################################################
     * ### INIT
     * ##################################################
     */
    
	/**
	 * Default constructor
	 */
    public NVGLogin() {
    }
    
    /**
     * Constructor with driver
     * 
     * @param driver
     */
    public NVGLogin(WebDriver driver) {
        this();
        this.driver = driver;
    }
    
    
    /**
     * ##################################################
     * ### ACTION SET TEXT
     * ##################################################
     */
    
    public void clickBtnLogin() {
    	System.out.println("1234");
////    	WebDriverWait wait = new WebDriverWait(driver, defaultWait);
//    	System.out.println("12345");
//		wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
//		System.out.println("123456");
		WebElement element = driver.findElement(btnLogin);
		System.out.println("1234567");
    	element.click();
    	System.out.println("12345678");
    }
    
    
}
