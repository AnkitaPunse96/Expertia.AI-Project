package ai.Expertia.TestLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import ai.Expertia.PageLayer.JobDetailsPageforPostaJob;
import ai.Expertia.PageLayer.PostYourJobPage;
import ai.Expertia.TestBase.TestBaseClass;

public class JobDetailsPostaJobTestClass extends TestBaseClass{
	
	@Test
	public void VerifyJobdetails() throws InterruptedException{
		PostYourJobPage Post=new PostYourJobPage();
		Thread.sleep(3000);
		
		Post.clickOnPostaJob_btn();
		Post.enterComapanyname();
		Post.clickComapanyname1();
		Post.enterHeadquarter();
		Post.enterIndustryType();
		Post.clickOnCompanySize();
		Post.enterCompanyWebsite();
		Post.enterComapnydescription();
		
		JavascriptExecutor js =  (JavascriptExecutor)driver ;
		js.executeScript("scrollBy(0,900)");
		Thread.sleep(3000);
		Post.clickOnConfirmContinue_btn();
		
	JobDetailsPageforPostaJob details=new JobDetailsPageforPostaJob();
	
	Thread.sleep(3000);
	details.enterJobTitle();
	details.enterJobTitle1();
	details.clickOnExpRequired();
	details.clickOnExpRequired1();
	details.enterJoblocation();
	details.enterJoblocation1();
	details.clickOnJobType();
	details.enterJobDescription();
	
	JavascriptExecutor js1 =  (JavascriptExecutor)driver ;
	js1.executeScript("scrollBy(0,900)");
	Thread.sleep(3000);
	details.clickOnConfirmContinue_btn();
	
	Thread.sleep(3000);
	details.enterMinimumSalary();
	details.enterMaximumSalary();
	details.clickOnUnit();
	details.enterIndustryType();
	details.enterSkills();
	details.clickOnPublishType();
	details.clickOnCreateAJob_btn();
}
}