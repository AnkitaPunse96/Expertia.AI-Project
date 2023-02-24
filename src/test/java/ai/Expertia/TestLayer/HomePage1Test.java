package ai.Expertia.TestLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import ai.Expertia.PageLayer.Homepage1;
import ai.Expertia.TestBase.TestBaseClass;

public class HomePage1Test extends TestBaseClass{
	
	@Test
	public void verifyHomepage1() throws InterruptedException {

	    Homepage1 H1= new Homepage1();
	    
	//	JavascriptExecutor js =(JavascriptExecutor)driver;
	//	js.executeScript("scrollBy(0,700)");
		
		Thread.sleep(3000);
	//    Homepage1 H1= new Homepage1();
		H1.ClickonAccessForFree_btn();
	}

}
