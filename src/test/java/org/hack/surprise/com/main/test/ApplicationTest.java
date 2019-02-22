package org.hack.surprise.com.main.test;

import static org.junit.Assert.assertEquals;

import org.hack.surprise.com.main.Application;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ApplicationTest {

	//A&e5Wxs7NpI8dvRkGlOeTcMI-mVt?54B
	private static WebDriver driver;

	@BeforeClass
	public static void initData() {
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Akhil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:9092/#!/home");
	}

	@Test
	public void ad_needHelp() throws InterruptedException { 
		WebElement From = driver.findElement(By.xpath("//input[@id = 'from']"));
		From.sendKeys("Pocharam");
		WebElement To = driver.findElement(By.xpath("//input[@id = 'to']"));
		To.sendKeys("Hyderabad");
		WebElement WannaHelp = driver.findElement(By.xpath("//button[@id = 'need_id']"));
		WannaHelp.click();
		Thread.sleep(3000); 
	}
	
	@Test
	public void ac_back() throws InterruptedException {
		driver.navigate().back();
		Thread.sleep(3000); 
	}

	
	@Test
	public void ab_addFromTo() throws InterruptedException {
		Thread.sleep(3000); 
		WebElement WannaHelp = driver.findElement(By.xpath(".//*[@id = 'accept']"));
		WannaHelp.click();
		Thread.sleep(3000); 
	}

	@Test
	public void aa_wannaHelp() {
		WebElement From = driver.findElement(By.xpath("//input[@id = 'from']"));
		From.sendKeys("Pocharam");
		WebElement To = driver.findElement(By.xpath("//input[@id = 'to']"));
		To.sendKeys("Hyderabad");
		WebElement WannaHelp = driver.findElement(By.xpath("//button[@id = 'wanna_id']"));
		WannaHelp.click();
	}

	@AfterClass
	public static void terminateTests() {
		System.out.println("Terminate");
		driver.quit();
	}
}
