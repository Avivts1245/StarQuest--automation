package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Reports {
	WebDriver driver;
	public Reports (WebDriver driver) {
		this.driver=driver;
	}
	
	By TextBox ;
	By Button;
	
	
	public WebElement getTextBox(String css) {
		return driver.findElement(TextBox);
	}
	public WebElement getButton() {
		return driver.findElement(Button);
	}
	
//	public static void EnterText(String css, String Text) {
//		
//		driver.findElement(css);
//	}
	
	

}
