package ai.Expertia.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.Expertia.TestBase.TestBaseClass;

public class PostYourJobPage extends TestBaseClass{
	
	public PostYourJobPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='Post a Job!']")
	private WebElement PostaJob_btn;
	
	@FindBy(xpath="//input[@id='Company-name']")
	private WebElement Comapanyname;
	
	@FindBy(xpath="(//p[@class='text-sm'])[2]")
	private WebElement Comapanyname1;
	
	@FindBy(xpath="//input[@name='headquarters']")
	private WebElement Headquarter;
	
	@FindBy(xpath="//input[@name='industryType']")
	private WebElement IndustryType;
	
	@FindBy(xpath="//div[@class=' css-1dimb5e-singleValue']")
	private WebElement CompanySize;
	
	@FindBy(xpath="//input[@name='companyWebsite']")
	private WebElement CompanyWebsite;
	
	@FindBy(xpath="//textarea[@name='companyDescription']")
	private WebElement Comapnydescription;
	
	@FindBy(xpath="//button[@name='Confirm & Continue']")
	private WebElement ConfirmContinue_btn;
	
	public void clickOnPostaJob_btn() {
		PostaJob_btn.click();
	}
	public void enterComapanyname() {
		Comapanyname.sendKeys("Wipro");;
	}
	public void clickComapanyname1() {
		Comapanyname1.click();
	}
	public void enterHeadquarter() {
		Headquarter.sendKeys("New Delhi");
	}
	public void enterIndustryType() {
		IndustryType.sendKeys("IT Services and IT Consulting");
	}
	public void clickOnCompanySize() {
		CompanySize.click();
	}
	public void enterCompanyWebsite() {
		CompanyWebsite.sendKeys("http://www.wipro.com");
	}
	public void enterComapnydescription() {
		Comapnydescription.sendKeys("A company recognized globally for its comprehensive portfolio of services, strong commitment to sustainability and good corporate citizenship, we have over 250,000 dedicated employees serving clients across 66 countries.");
	}
	public void clickOnConfirmContinue_btn() {
		ConfirmContinue_btn.click();
	}
}
