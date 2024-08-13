package PageObjects;

import org.openqa.selenium.WebDriver;

public class Email {
	WebDriver driver;
	public Email(WebDriver driver) {
		this.driver=driver;
	
	}
	public static void EnterMail(WebPage webpage,String mail)
	{
		webpage.getEmail().sendKeys(mail);
	}
	public static void MailTests(WebPage WebPage) {
		EnterMail(WebPage,"shaibatonya6@gmail.com");// 1 enter valid mail
//		EnterMail(WebPage,"shאibatonya6@gmail.com");// 2 hebrew char
//		EnterMail(WebPage,"shaiba@onya6@gmail.com");// 3 enter @ more than once
//		EnterMail(WebPage,"shaibatonya6@gmailcom");// 4 enter com without .
//		EnterMail(WebPage,"shaibato.nya6@gmail.com");// 5 enter . more then once
//		EnterMail(WebPage,"@shaibatonya6@gmail.com");// 6 enter @ as the first char
//		EnterMail(WebPage,"shaibatonya6@.com");// 7 enter .com next to @
//		EnterMail(WebPage,"aviv1994tsoref@gmail.com");// 8 enter mail that is not in the system
//		EnterMail(WebPage,"shaibatonya6@kuku.com");// 9 enter invalid domain
//		EnterMail(WebPage,"");// 10 dont send keys to this field
	}
	


	
	
	
	
	
	
	
}
