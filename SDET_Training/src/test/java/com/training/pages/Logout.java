package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import AutoHackathon.Project.DataDriver.HashMapNew;

public class Logout
{
	
	private WebDriver driver;
	private ExtentReports extentReport;
	private ExtentTest extentTest;
	private HashMapNew dictionary;
	
	
	public Logout(WebDriver driver, ExtentReports extentReport, ExtentTest extentTest, HashMapNew dictionary) {
		super();
		this.driver = driver;
		this.extentReport = extentReport;
		this.extentTest = extentTest;
		this.dictionary = dictionary;
			}



	//By AllCoursesLinkLocator=By.xpath("//*[text()='All Courses']");  /html/body/div[1]/header/div/div[2]/nav/ul[1]/li/a
		
	By PageLocatorArrow=By.xpath("//b[@class='caret']");
	By PageLocatorLogout=By.xpath("//a[contains(text(),'Sign Out')]"); 
	
		
	public boolean clickArrow() throws Throwable
	{
		WebElement PageLocatorArrowEle=driver.findElement(PageLocatorArrow);
	     
	       if(PageLocatorArrowEle.isDisplayed())
			{
				extentTest.log(LogStatus.PASS,"Sign out option menus displayed");
				Thread.sleep(5000);
				PageLocatorArrowEle.click();
				return true;
			}
			extentTest.log(LogStatus.FAIL,"Sign out option menus not displayed");
			  return false;
		}
	
	      
	public boolean clickLogout() throws Throwable
	{
		WebElement LogOutEle=driver.findElement(PageLocatorLogout);
	     
	       if(LogOutEle.isDisplayed())
			{
				extentTest.log(LogStatus.PASS,"Logout option displayed");
				Thread.sleep(5000);
				LogOutEle.click();
				return true;
			}
			extentTest.log(LogStatus.FAIL,"Logout option not displayed");
			  return false;
		}
	
}
