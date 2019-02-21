package org.hack.surprise.com.main.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {
	
	@BeforeClass
	public static void initData() {
		System.out.println("Init data");
		System.setProperty("webdriver.chrome.driver", "Path of Chrome driver a exe file"); 
		WebDriver driver = new ChromeDriver();
		driver.get("URL");
	}
	
	
	
	@Test
	public void runTest() {
		System.out.println("Sample test");
		}
	
	public void WannaHelp(){
	 WebElement From = driver.findElement(By.xpath("//input[@class = 'form form-control input-md ng-pristine ng-valid ui-autocomplete-input ng-empty ng-touched']"));
	From.SendKeys("Hyderabad");	
	 WebElement To = driver.findElement(By.xpath("//input[@class = 'form form-control input-md ng-pristine ng-untouched ng-valid ui-autocomplete-input ng-empty']"));
	To.SendKeys("Pocharam");				       
	WebElement NeedHelp = driver.findElement(By.xpath("//button[contains(text(), 'Need' )]"));
	NeedHelp.click();
	WebElement validate = driver.findElement(By.xpath("//div[@class = 'form-inline']/h4"));
	String validationText = validate.gettext();
		
	assertEquals("Would like to send Gift/Parcel ?    ", validationText);
	}
	
	public void NeedHelp()
	{
	 WebElement From = driver.findElement(By.xpath("//input[@class = 'form form-control input-md ng-pristine ng-valid ui-autocomplete-input ng-empty ng-touched']"));
	From.SendKeys("Pocharam");	
	 WebElement To = driver.findElement(By.xpath("//input[@class = 'form form-control input-md ng-pristine ng-untouched ng-valid ui-autocomplete-input ng-empty']"));
	 To.SendKeys("Hyderabad");						       	
	WebElement WannaHelp = driver.findElement(By.xpath(""//button[contains(text(), 'Wanna' )]"));
	WannaHelp.click();
	WebElement validate = driver.findElement(By.xpath("//div[@class = 'form-inline']/h4"));
	String validationText = validate.gettext();
	assertEquals("Would like to help others by carrying a Gift/Parcel ?
						   ", validationText);
							   }
	@AfterClass
	public static void terminateTests() {
		System.out.println("Terminate");
		driver.quit();
	}
}
