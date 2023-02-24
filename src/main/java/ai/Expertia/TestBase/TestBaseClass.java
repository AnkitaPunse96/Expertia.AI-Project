package ai.Expertia.TestBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import ai.Expertia.PageLayer.Homepage1;

public class TestBaseClass {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void VerifyTestBase() throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","D:\\software\\NewChrome\\chromedriver_win32 (1)\\chromedriver.exe");
    driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.expertia.ai/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
    Homepage1 H1= new Homepage1();
    
//	JavascriptExecutor js =(JavascriptExecutor)driver;
//	js.executeScript("scrollBy(0,700)");
	
	Thread.sleep(3000);
//    Homepage1 H1= new Homepage1();
	H1.ClickonAccessForFree_btn();
		
	}
	
	@AfterMethod
	public void CloseBrowser() {

	//	driver.quit();
	}

}
