package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import AutoHackathon.Project.DataDriver.HashMapNew;

public class MainPage
{
	
	private WebDriver driver;
	private ExtentReports extentReport;
	private ExtentTest extentTest;
	private HashMapNew dictionary;
	
	
	public MainPage(WebDriver driver, ExtentReports extentReport, ExtentTest extentTest, HashMapNew dictionary) {
		super();
		this.driver = driver;
		this.extentReport = extentReport;
		this.extentTest = extentTest;
		this.dictionary = dictionary;
			}



	//By AllCoursesLinkLocator=By.xpath("//*[text()='All Courses']");  /html/body/div[1]/header/div/div[2]/nav/ul[1]/li/a
	By AllCoursesLink=By.xpath("/html/body/div[1]/header/div/div[2]/nav/ul[1]/li/a"); 
	//By PageLocatorcourse1=By.xpath("//a[@href='/courses/applitools']")
	By ViewCourse=By.xpath("//a[@href='/courses/applitools']");
		
	
	public boolean clickAllCourses() throws Throwable
	{
		WebElement AllCoursesLinkEle=driver.findElement(AllCoursesLink);
	     
	       if(AllCoursesLinkEle.isDisplayed())
			{
				extentTest.log(LogStatus.PASS,"AllCoursesLink is clickedd");
				Thread.sleep(5000);
				AllCoursesLinkEle.click();
				return true;
			}
			extentTest.log(LogStatus.FAIL,"AllCoursesLink is not clicked");
			  return false;
		}
	
	
	
	public boolean clickViewCourse() throws Throwable
	{
		WebElement ViewCourseEle=driver.findElement(ViewCourse);
	     
	       if(ViewCourseEle.isDisplayed())
			{
				extentTest.log(LogStatus.PASS,"ViewCourseLink is clickedd");
				Thread.sleep(5000);
				ViewCourseEle.click();
				return true;
			}
			extentTest.log(LogStatus.FAIL,"ViewCourseLink is not clicked");
			  return false;
		}
	
	
	
	       
	
}
