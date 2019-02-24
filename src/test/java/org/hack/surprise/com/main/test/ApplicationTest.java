package org.hack.surprise.com.main.test;

import org.hack.surprise.com.main.Application;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ApplicationTest {

	// A&e5Wxs7NpI8dvRkGlOeTcMI-mVt?54B

	@BeforeClass
	public static void initData() {
		System.out.println("Init");
	}

	@Test
	public void ad_needHelp() throws InterruptedException {
		System.out.println("Need Help");
	}

	@Test
	public void ab_addFromTo() throws InterruptedException {
		System.out.println("Add From To");
	}

	@Test
	public void aa_wannaHelp() throws InterruptedException {
		System.out.println("wanna help");

	}

	@AfterClass
	public static void terminateTests() {
		System.out.println("Terminate");
	}
}
