package ai.Expertia.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.Expertia.TestBase.TestBaseClass;

public class SignUpPageforPostAJob extends TestBaseClass{
	
   public SignUpPageforPostAJob(){
	   PageFactory.initElements(driver, this);
	}
  
   @FindBy(xpath="//input[@name='firstName']")
   private WebElement FirstName;
   
   @FindBy(xpath="//input[@name='lastName']")
   private WebElement LastName;
   
   @FindBy(xpath="//input[@name='phoneNumber']")
   private WebElement PhoneNumber;
   
   @FindBy(xpath="//input[@name='workEmail']")
   private WebElement Workemail;
   
   @FindBy(xpath="//input[@name='password']")
   private WebElement Password;
   
   @FindBy(xpath="//button[text()='Sign Up For Free']")
   private WebElement SignUp_btn;
   
    
   
   public void enterFirstName() {
	   FirstName.sendKeys("Ankita");
   }
   public void enterLastName() {
	   LastName.sendKeys("Punse");
   }
   public void enterPhoneNumber() {
	   PhoneNumber.sendKeys("8585962140");
   }
   public void enterWorkemail() {
	   Workemail.sendKeys("wipro@company.com");
   }
   public void enterPassword() {
	   Password.sendKeys("Punse1996");
   }
   public void clickOnSignUp_btn() {
	   SignUp_btn.click();
   }
   
   
}
