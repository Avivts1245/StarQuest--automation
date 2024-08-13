package app.netlify.star_quest.StarQuestAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.Dashboard;
import PageObjects.Dashboard_Tests;
import PageObjects.Email;
import PageObjects.Forgot_Password_Page;
import PageObjects.LogInCliksTests;
import PageObjects.LoginPage;
import PageObjects.Name;
import PageObjects.Open_Page_Runs;
import PageObjects.Password;
import PageObjects.Report_Tests;
import PageObjects.SignUpPage;

public class Main {

	public static void OpenSystem(WebDriver driver, String Url) {
		driver.manage().window().maximize();
		driver.get(Url);
//		open the website
	}

	public static void TimeOut(WebDriver driver, int time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Email mail = new Email(driver);
		Password password = new Password(driver);
		Name name =new Name (driver); 
		
		Open_Page_Runs runs = new Open_Page_Runs(driver);
		
		
		
		
		
		
		//		tests for LoginPage
		OpenSystem(driver, "https://starquest-five.vercel.app/");

		LoginPage logpage = new LoginPage(driver);
		LogInCliksTests logtests = new LogInCliksTests(driver);
	
		runs.LoginTests(mail, password, logpage, logtests);
																// Log in to system
		
		
		
		
		
		Forgot_Password_Page fpp= new Forgot_Password_Page(driver);
//		runs.Forgot_Password_Tests(mail, logpage, logtests, fpp);
															// reset password tests

		
//		TimeOut(driver, 2);
//		tests.ClickVerification(logpage);
//		TimeOut(driver, 2);
//		tests.ClickSignUp_btn(logpage);
//		TimeOut(driver, 2);

		
		
		
												
		SignUpPage signpage = new SignUpPage(driver);
//		runs.SignUp_Tests(mail, password, logpage, logtests, signpage, name);
																	//		tests for SignupPage

		
		
		Dashboard dashboard = new Dashboard(driver);
		boolean flag=false;
		Dashboard_Tests dashtests= new Dashboard_Tests(flag,driver);
		
		dashtests.Open_Close_Toolbar(dashboard);
		TimeOut(driver, 2);
		TimeOut(driver, 2);
		TimeOut(driver, 2);
//		dashtests.Open_Close_Toolbar(dashboard);
//		dashtests.Go_To_LeaderBoard(dashboard);
//		dashtests.Go_To_Quest(dashboard);
		dashtests.Go_To_Reports(dashboard);
//		dashtests.Go_To_Roadmap(dashboard);
//		dashtests.Go_To_Settings(dashboard);
//		dashtests.Loagout(dashboard);
		dashtests.Open_Close_Toolbar(dashboard);
//		Report_Tests Rtests= new Report_Tests(driver);
//		Rtests.Create_and_fill_daily_report();
//		


	}

}
