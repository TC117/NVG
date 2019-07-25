package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class NVGLogin {
	
	static WebDriver driver = null;	
	
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
    
}
