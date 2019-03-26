package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import AutoHackathon.Project.DataDriver.HashMapNew;

public class ViewCourse
{
	
	private WebDriver driver;
	private ExtentReports extentReport;
	private ExtentTest extentTest;
	private HashMapNew dictionary;
	
	
	public ViewCourse(WebDriver driver, ExtentReports extentReport, ExtentTest extentTest, HashMapNew dictionary) {
		super();
		this.driver = driver;
		this.extentReport = extentReport;
		this.extentTest = extentTest;
		this.dictionary = dictionary;
			}


	By PageLocatorValidation=By.xpath("//a[contains(text(),'Replay Course')]"); 
		
		
	//view course validation
	public boolean isLoginPageDisplayed()
	{
		WebElement PageLocatorValidationEle=driver.findElement(PageLocatorValidation);
		if(PageLocatorValidationEle.isDisplayed())
		{
			extentTest.log(LogStatus.PASS,"View course successfully displayed");
			return true;
		}
		extentTest.log(LogStatus.FAIL,"View course not displayed");
		  return false;
	}
	
	
}
