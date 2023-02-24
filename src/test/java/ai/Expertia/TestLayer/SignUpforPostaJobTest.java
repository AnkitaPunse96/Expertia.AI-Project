package ai.Expertia.TestLayer;

import org.openqa.selenium.JavascriptExecutor;

import ai.Expertia.PageLayer.JobDetailsPageforPostaJob;
import ai.Expertia.PageLayer.PostYourJobPage;
import ai.Expertia.PageLayer.SignUpPageforPostAJob;
import ai.Expertia.TestBase.TestBaseClass;

public class SignUpforPostaJobTest extends TestBaseClass{
	
	public void verifySignUpforPostaJob() throws InterruptedException {
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
		
		JavascriptExecutor js =(JavascriptExecutor)driver ;
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
	
	Thread.sleep(3000);
	
	SignUpPageforPostAJob SignUp= new SignUpPageforPostAJob();
	SignUp.enterFirstName();
	SignUp.enterLastName();
	SignUp.enterPhoneNumber();
	SignUp.enterWorkemail();
	SignUp.enterPassword();
	SignUp.clickOnSignUp_btn();
	
	
	
	
	

	
	}

}
