package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebPage {
	
	WebDriver driver;

	public WebPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By email = By.cssSelector("input#email");
	By password = By.cssSelector("input[name='password']");
	
	
	
	
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	public WebElement getPassword() {
		return driver.findElement(password);
	}

	
}
