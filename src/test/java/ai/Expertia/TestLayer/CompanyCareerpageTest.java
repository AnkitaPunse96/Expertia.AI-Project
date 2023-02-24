package ai.Expertia.TestLayer;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import ai.Expertia.PageLayer.CompanyCarrerPage;
import ai.Expertia.TestBase.TestBaseClass;

public class CompanyCareerpageTest extends TestBaseClass {
	@Test
	public void verifyCreateCareerpage() throws InterruptedException {
		
	CompanyCarrerPage Career= new CompanyCarrerPage();
	Thread.sleep(3000);
	Career.ClickonCreateCarrerpage_btn();
	
	Thread.sleep(3000);
	Career.enterCompanyname();
	Career.SelectCompanyname1();
	Career.enterHeadquarter();
	Career.enterIndustryType();
	Career.selectCompanysize();
	Career.enterCompanyWebsite();
	Career.enterCompanyDescription();
	
	JavascriptExecutor js =  (JavascriptExecutor)driver ;
	js.executeScript("scrollBy(0,900)");
	Thread.sleep(3000);
	Career.clickOnConfirmContinue_btn();

}
		
	
}
