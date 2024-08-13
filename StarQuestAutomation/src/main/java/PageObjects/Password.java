package PageObjects;

import org.openqa.selenium.WebDriver;

public class Password {
	WebDriver driver;
	public Password(WebDriver driver) {
		this.driver=driver;
	
	}
	public static void EnterPassword(WebPage webpage,String password)
	{
		webpage.getPassword().sendKeys(password);
	}
	
	public static void RetypePassword(SignUpPage signpage,String password)
	{
		signpage.getRetype_Password().sendKeys(password);
	}
	public static void PasswordTests(WebPage webpage) {
		EnterPassword(webpage,"As123456");// 1 enter correct password
//		EnterPassword(webpage,"as123456");// 2 dont enter capital letters
//		EnterPassword(webpage,"Asש1456");// 3 enter a letter in hebrew
//		EnterPassword(webpage,"As1");// 4 enter short password
//		EnterPassword(webpage,"As123456789");// 5 enter too long password
//		EnterPassword(webpage,"");// 6 enter empty password

	}
	


	
	
	
	
	
	
	
}
