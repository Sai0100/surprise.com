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
	}
	
	
	
	@Test
	public void runTest() {
		System.out.println("Sample test");
	}
	
	

	
	@AfterClass
	public static void terminateTests() {
		System.out.println("Terminate");
	}
}
