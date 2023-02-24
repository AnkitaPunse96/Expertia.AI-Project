package ai.Expertia.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import ai.Expertia.TestBase.TestBaseClass;

public class JobDetailsPageforPostaJob extends TestBaseClass{

	public JobDetailsPageforPostaJob() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='jobTitle']")
	private WebElement JobTitle;
	
	@FindBy(xpath="(//p[@class='text-sm'])[1]")
	private WebElement JobTitle1;
	
	@FindBy(xpath="//div[@class=' css-1xc3v61-indicatorContainer']")
	private WebElement ExpRequired;
	
	@FindBy(xpath="//div[@class=' css-1dimb5e-singleValue']")
	private WebElement ExpRequired1;
	
	@FindBy(xpath="//input[@name='jobLocation']")
	private WebElement Joblocation;

	@FindBy(xpath="//p[@class='text-sm']")
	private WebElement Joblocation1;
	
	@FindBy(xpath="//p[@class='text-sm pt-0.5']")
	private WebElement JobType;
	
	@FindBy(xpath="//div[@class='ql-editor ql-blank']")
	private WebElement JobDescription;
	
	@FindBy(xpath="//button[text()='Confirm & Continue']")
	private WebElement ConfirmContinue_btn;
	
	@FindBy(xpath="//input[@name='minimumSalary']")
	private WebElement MinimumSalary;
	
	@FindBy(xpath="//input[@name='maximumSalary']")
	private WebElement MaximumSalary;
	
	@FindBy(xpath="//div[@class=' css-1xc3v61-indicatorContainer']")
	private WebElement Unit;
	
	@FindBy(xpath="//input[@class='w-3/5 border-solid sm:w-full placeholder-[#A1A1A1] font-inter text-base font-semibold text-[#4E4E4E] h-12 border border-gray-300 rounded-[12px] py-2 px-4 mt-2 outline-none']")
	private WebElement IndustryType;
	
	@FindBy(xpath="//input[@class='w-3/5 sm:w-full placeholder-[#A1A1A1] font-inter text-base font-semibold text-[#4E4E4E] h-12 border border-gray-300 rounded-[12px] py-2 px-4 mt-2 outline-none border-solid']")
	private WebElement Skills;
	
	@FindBy(xpath="//div[@id='react-select-7-placeholder']")
	private WebElement PublishType;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement CreateAJob_btn;
	
	
	
	public void enterJobTitle() {
		JobTitle.sendKeys("Software Quality Assurance Engineer");
	}
	public void enterJobTitle1() {
      	JobTitle1.click();
	}
	
	public void clickOnExpRequired() {
     	//Select s= new Select(ExpRequired);
		//s.selectByIndex(2);
		ExpRequired.click();
	}
	public void clickOnExpRequired1() {
		ExpRequired1.click();
	}
	
	public void enterJoblocation() {
		Joblocation.sendKeys("Pune");
	}
	public void enterJoblocation1() {
		Joblocation1.click();
	}
	public void clickOnJobType() {
		JobType.click();
	}
	public void enterJobDescription() {
		JobDescription.sendKeys("Manual testing, Automation Testing-Java with Selenium,QA Automation and the basic knowledge of Functional testing ,Regression testing, API testing ,DB testing, JAVA with Selenium-For automation testing with Test Data Driven Framework.\r\n"
				+ "Also I am familiar with Jira, Unix, Postman, SQL, Git, Github.Manual testing, Automation Testing-Java with Selenium,QA Automation and the basic knowledge of Functional testing ,Regression testing, API testing ,DB testing, JAVA with Selenium-For automation testing with Test Data Driven Framework.\r\n"
				+ "\r\n"+ "Also I am familiar with Jira, Unix, Postman, SQL, Git, Github.Database Testing using SQL, API Testing Using Postman, Jira, Unix, Maven, TestNG, Git, Github."
				+ "Database Testing using SQL, API Testing Using Postman, Jira, Unix, Maven, TestNG, Git, Github.");
	}
	public void clickOnConfirmContinue_btn() {
		ConfirmContinue_btn.click();
	}
	public void enterMinimumSalary() {
		MinimumSalary.sendKeys("500000");
	}
	public void enterMaximumSalary() {
		MaximumSalary.sendKeys("600000");
	}
	public void clickOnUnit() {
	    Unit.click();
	}
	public void enterIndustryType() {
		IndustryType.sendKeys("IT Consulting");
	}
	public void enterSkills() {
		Skills.sendKeys("Java, Python, Selenium, Maven");
	}
	public void clickOnPublishType() {
		PublishType.click();
	}
	public void clickOnCreateAJob_btn() {
		CreateAJob_btn.click();
	}
}
