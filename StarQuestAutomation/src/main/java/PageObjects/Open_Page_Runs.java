package PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class Open_Page_Runs {
	static WebDriver driver;
	public Open_Page_Runs(WebDriver driver) {
		this.driver = driver;

	}
	
	public static void TimeOut(WebDriver driver, int time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	

	
	
	
	public static void LoginTests(Email mail,Password password,LoginPage logpage,LogInCliksTests logtests) {

		TimeOut(driver, 2);
		mail.MailTests(logpage);
		TimeOut(driver, 2);
		password.PasswordTests(logpage);
		TimeOut(driver, 2);
		logtests.ClickRemember_me_btn(logpage);
		TimeOut(driver, 2);
		logtests.ClickLogInBnt(logpage);
	}
	
	public static void Forgot_Password_Tests(Email mail,LoginPage logpage,LogInCliksTests logtests,Forgot_Password_Page fpp) {
		TimeOut(driver, 25);
		logtests.ClickForgot_password(logpage);
		TimeOut(driver, 5);
		mail.MailTests(fpp);
//		fpp.getBackToLogin_btn().click();
		fpp.getReset_btn().click();
	}
	
	
	public static void SignUp_Tests(Email mail,Password password,LoginPage logpage,LogInCliksTests logtests,SignUpPage signpage,Name name) {
		TimeOut(driver, 25);
		logtests.ClickSignUp_btn(logpage);
		mail.MailTests(signpage);
		password.PasswordTests(signpage);
		password.RetypePassword(signpage,"As123456");
		name.FirstNameTests(signpage);
		name.LastNameTests(signpage);
		TimeOut(driver, 25);
		signpage.getSignIn_btn().click();
//		signpage.getLogIn_btn().click();
	}
	


	
	
	
	
	
	
	
	
	
	
	

}
