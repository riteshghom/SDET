package com.training.tests;

import org.apache.poi.poifs.crypt.DataSpaceMapUtils.DataSpaceMap;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.training.pages.Logout;
import com.training.pages.MainPage;
import com.training.pages.SignIn;
import com.training.pages.ViewCourse;

import AutoHackathon.Project.AutomationConstants;
import AutoHackathon.Project.DataDriver;
import AutoHackathon.Project.DataDriver.HashMapNew;
import AutoHackathon.Project.MyTestNGBaseClass;

public class ViewCourseTest extends MyTestNGBaseClass {

	static DataDriver obj=new DataDriver();
	static HashMapNew dataMap=null;
	
	public static void getData()
	{
		dataMap=obj.fGetData(AutomationConstants.testDataPath + "Calendar.xlsx","Check Course"); 
	}
	
	@Test
	public void ultimateLoginValidationTest() throws Throwable
	{
		getData();
		oExtentTest = oExtentReport.startTest("View Course");
		SignIn signpage= new SignIn(oDriver, oExtentReport,oExtentTest, dataMap);
		Assert.assertTrue(signpage.isLoginPageDisplayed());
		//Assert.assertTrue(signpage.enterEmailId("saf_testing@test.com"));
		//Assert.assertTrue(signpage.enterPassword("testing123"));
		Assert.assertTrue(signpage.enterEmailId(dataMap.get("EMAIL_ID")));
		Assert.assertTrue(signpage.enterPassword(dataMap.get("PASSWORD")));
		Assert.assertTrue(signpage.clickButton());
		
		
		MainPage mainpageObj=new MainPage(oDriver, oExtentReport,oExtentTest, dataMap);
		Assert.assertTrue(mainpageObj.clickAllCourses());
		Assert.assertTrue(mainpageObj.clickViewCourse());
		
		
		ViewCourse ViewCourseObj=new ViewCourse(oDriver, oExtentReport,oExtentTest, dataMap);
		Assert.assertTrue(ViewCourseObj.isLoginPageDisplayed());
				

		Logout LogoutObj=new Logout(oDriver, oExtentReport,oExtentTest, dataMap);
		Assert.assertTrue(LogoutObj.clickArrow());
		Assert.assertTrue(LogoutObj.clickLogout());
	}
		

	
}
