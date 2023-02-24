package ai.Expertia.TestLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import ai.Expertia.PageLayer.PostYourJobPage;
import ai.Expertia.TestBase.TestBaseClass;

public class PostYourJobTestClass extends TestBaseClass{
	
	@Test
	public void VerifyPostYourJob() throws InterruptedException {
		
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
	}

}
