package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import testbase.TestBase;
import util.ConfigurationReader;

public class LoginTest extends TestBase {
	
	LoginPage loginPage = new LoginPage();
	
	@Test(priority =1, groups = {"smoke"})
	public void login() {
		extentLogger = report.createTest("Positive login test 1");
		LoginPage loginPage = new LoginPage();
		
		loginPage.userID.sendKeys(ConfigurationReader.getProperty("username"));
		loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
		loginPage.submit.click();
		
		
	}

}
