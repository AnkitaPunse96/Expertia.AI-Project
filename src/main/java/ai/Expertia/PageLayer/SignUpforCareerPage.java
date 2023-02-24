package ai.Expertia.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.Expertia.TestBase.TestBaseClass;

public class SignUpforCareerPage extends TestBaseClass{
	
 public SignUpforCareerPage() {
	 PageFactory.initElements(driver, this);
  }
 
 @FindBy(xpath="//input[@name='firstName']")
 private WebElement FirstName;
 
 @FindBy(xpath="//input[@name='lastName']")
 private WebElement LastName;
 
 @FindBy(xpath="//input[@name='phoneNumber']")
 private WebElement PhoneNumber;
 
 @FindBy(xpath="//input[@name='workEmail']")
 private WebElement workEmail;
 
 @FindBy(xpath="//input[@name='password']")
 private WebElement password;
 
 @FindBy(xpath="//button[@name='Sign Up For Free']")
 private WebElement SignUp_btn;
 
 public void enterFirstName() {
	 FirstName.sendKeys("Ankita");
 }
 
 public void enterLastName() {
	 LastName.sendKeys("Punse");
 }
 
 public void enterPhonenumber() {
	 PhoneNumber.sendKeys("7796218855");
 }
 
 public void enterworkEmail() {
	 workEmail.sendKeys("wipro@company.com");
 }
 
 public void enterpassword() {
	 password.sendKeys("Punse1996");
 }
 
 public void ClickOnSignUp_btn() {
	 SignUp_btn.click();
 }
 
 
 
}
