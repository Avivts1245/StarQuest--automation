package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboard {
	WebDriver driver;

	public Dashboard(WebDriver driver) {
		this.driver = driver;
	}

	By Toolbar = By.cssSelector(
			"[class='css-7o7auk'] [tabindex]");
	By DashboardPage = By.cssSelector("[href='\\/']");
	By Reports = By.cssSelector("[href='\\/daily-reports']");
	By Quest = By.cssSelector("[href='\\/user-quest']");
	By Roadmap = By.cssSelector(
			"[href='\\/user-quest']");
	By LeaderBoard = By.cssSelector(
			"[href='\\/leaderboard']");
	By Settings = By.cssSelector(
			"ul:nth-of-type(2) > li:nth-of-type(1) > div[role='button']  .MuiListItemText-primary.MuiTypography-body1.MuiTypography-root.css-yb0lig");
	By Logout = By.cssSelector(
			"ul:nth-of-type(2) > li:nth-of-type(2)");

	
	public WebElement getToolbar() {
		return driver.findElement(Toolbar);
	}
	public WebElement getDashboardPage() {
		return driver.findElement(DashboardPage);
	}
	public WebElement getReports() {
		return driver.findElement(Reports);
	}
	public WebElement getQuest() {
		return driver.findElement(Quest);
	}
	public WebElement getRoadmap() {
		return driver.findElement(Roadmap);
	}
	public WebElement getLeaderBoard() {
		return driver.findElement(LeaderBoard);
	}
	public WebElement getSettings() {
		return driver.findElement(Settings);
	}
	public WebElement getLogout() {
		return driver.findElement(Logout);
	}
	
	
	
	
	
}
