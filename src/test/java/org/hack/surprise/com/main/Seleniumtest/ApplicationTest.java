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

	@BeforeClass
	public static void initData() {
		System.out.println("Init");
	}

	@Test
	public void ad_needHelp() throws InterruptedException { 
		System.out.println("NeedHelp");
	}
	
	@Test
	public void ac_back() throws InterruptedException {
		System.out.println("Back");
	}

	
	@Test
	public void ab_addFromTo() throws InterruptedException {
		System.out.println("AddFromTo");
	}

	@Test
	public void aa_wannaHelp() {
		System.out.println("Wanna help");
	}

	@AfterClass
	public static void terminateTests() {
		System.out.println("Exit");
	}
}
