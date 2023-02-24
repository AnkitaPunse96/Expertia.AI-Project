package ai.Expertia.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import ai.Expertia.TestBase.TestBaseClass;

public class CompanyCarrerPage extends TestBaseClass {
	
	public CompanyCarrerPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='Create your Career Page!']")
	private WebElement CreateCarrerpage_btn;
	
	@FindBy(xpath="//input[@id='Company-name']")
	private WebElement Companyname;
	
	@FindBy(xpath="//p[@class='text-sm']")
	private WebElement Companyname1;
	
	@FindBy(xpath="//input[@name='headquarters']")
	private WebElement Headquarter;
	
	@FindBy(xpath="//input[@name='industryType']")
	private WebElement IndustryType;
	
	@FindBy(xpath="//div[@class=' css-1xc3v61-indicatorContainer']")
	private WebElement Companysize;
	
	@FindBy(xpath="//input[@name='companyWebsite']")
	private WebElement CompanyWebsite;
	
	@FindBy(xpath="//textarea[@name='companyDescription']")
	private WebElement CompanyDescription;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement ConfirmContinue_btn;
	
	public void ClickonCreateCarrerpage_btn() {
		CreateCarrerpage_btn.click();
	}
	
	public void enterCompanyname() {
		 Companyname.sendKeys("Wipro");
	}
	
	public void SelectCompanyname1() {
		Companyname1.click();
	}
	
	public void enterHeadquarter() {
		Headquarter.sendKeys("Bangalore");
	}
	
	public void enterIndustryType() {
		IndustryType.sendKeys("IT Services and It Consulting");
	}
	
	public void selectCompanysize() {
		//Select s = new Select(Companysize);
		//s.selectByIndex(3);
		Companysize.click();
	}
	
	public void enterCompanyWebsite() {
		CompanyWebsite.sendKeys("http://www.wipro.com");	
	}
	
	public void enterCompanyDescription(){
		CompanyDescription.sendKeys("Wipro Limited (NYSE: WIT, BSE: 507685, NSE: WIPRO) is a leading technology services and consulting company focused on building innovative solutions that address clients most complex digital transformation needs.  ");
	}
	
	public void clickOnConfirmContinue_btn() {
		ConfirmContinue_btn.click();
	}
	
	
	
	
}






