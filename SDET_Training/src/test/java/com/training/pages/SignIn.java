package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import AutoHackathon.Project.DataDriver.HashMapNew;

public class SignIn {


	private WebDriver driver;
	private ExtentReports extentReport;
	private ExtentTest extentTest;
	private HashMapNew dictionary;
	
	public SignIn(WebDriver driver, ExtentReports extentReport, ExtentTest extentTest, HashMapNew dictionary) {
		super();
		this.driver = driver;
		this.extentReport = extentReport;
		this.extentTest = extentTest;
		this.dictionary = dictionary;
	}

	 // --user_email   user_password   user_remember_me   btn-signin
	
	
	//h4[contains(text(),"Welcome Back!")] 

	By pageLocatorElement= By.xpath("//h4[contains(text(),\"Welcome Back!\")]");
	By emailTextField= By.id("user_email");
	By passwordTextField= By.id("user_password");
	By SigninBtn= By.id("btn-signin");
	
	
	public boolean isLoginPageDisplayed()
	{
		WebElement pageLocatorEle=driver.findElement(pageLocatorElement);
		if(pageLocatorEle.isDisplayed())
		{
			extentTest.log(LogStatus.PASS,"login page successfully displayed");
			return true;
		}
		extentTest.log(LogStatus.FAIL,"login page not displayed");
		  return false;
	}
	
	

	public boolean enterEmailId(String emailId)
	{
		WebElement emailField=driver.findElement(emailTextField);
		if(emailField.isDisplayed())
		{
			extentTest.log(LogStatus.PASS,"Value sent to email field");
			//emailField.sendKeys(dictionary.get("EMAIL_ID"));
			  emailField.sendKeys(emailId);
			return true;
		}
		extentTest.log(LogStatus.FAIL,"Value not sent to email field");
		  return false;
	}
	
	
	
	public boolean enterPassword(String password)
	{
		WebElement pwdField=driver.findElement(passwordTextField);
		if(pwdField.isDisplayed())
		{
			extentTest.log(LogStatus.PASS,"Value sent to password field");
			pwdField.sendKeys(password);
			//extentTest
			
			return true;
		}
		extentTest.log(LogStatus.FAIL,"Value not sent to password field");
		return  false;
		
	}
	
	public boolean clickButton()
	{
		WebElement signBtnField=driver.findElement(SigninBtn);
		if(signBtnField.isDisplayed())
		{
			extentTest.log(LogStatus.PASS,"Click button cliked");
			signBtnField.click();
			//extentTest
			
			return true;
		}
		extentTest.log(LogStatus.PASS,"Click button not cliked");
		return  false;
		
	}
	
}
