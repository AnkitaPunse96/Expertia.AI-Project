package ai.Expertia.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ai.Expertia.TestBase.TestBaseClass;

public class Homepage1 extends TestBaseClass{
	
	public Homepage1(){
		
		PageFactory.initElements(driver,this);
	}

 @FindBy(xpath="//button[@class='ui button GetStartedHeader__StyleButton-sc-fm1kyw-21 iYMvVn']")
 private WebElement AccessForFree_btn;
 
 
 public void ClickonAccessForFree_btn() throws InterruptedException {
	 
	 Thread.sleep(3000);
	 AccessForFree_btn.click();
 }
  
	
	
	
}
