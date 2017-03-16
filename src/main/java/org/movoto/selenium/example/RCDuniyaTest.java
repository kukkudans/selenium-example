package org.movoto.selenium.example;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RCDuniyaTest {

	private String testUrl;
	private WebDriver webDriver;

	@Before
	public void init() {

		// setup chromedriver
		System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver.exe");
		// Create a new instance of the Chrome driver
		// Notice that the remainder of the code relies on the interface,
		// not the implementation.
		webDriver = new ChromeDriver();
		// maximize window
		// driver.manage().window().maximize();
	}

	@Test
	public void prepare() throws InterruptedException {

		testUrl = "http://rcduniya.com/login";

		// And now use this to visit myBlog
		// Alternatively the same thing can be done like this
		// driver.navigate().to(testUrl);
		webDriver.get(testUrl);

		WebElement emailElement = webDriver.findElement(By.name("email"));
		
		emailElement.sendKeys("test@gmail.com");
		
		WebElement passwordElement = webDriver.findElement(By.name("password"));
		passwordElement.sendKeys("pass");
		
		WebElement submitButtonElement = webDriver.findElement(By.xpath("//button/@type='submit'"));
		Thread.sleep(2000);
		submitButtonElement.click();
		Thread.sleep(50000);
	}

	

	@After
	public void teardown() throws IOException {
		webDriver.quit();
	}
}
