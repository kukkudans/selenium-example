package org.movoto.selenium.example;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	private String testUrl;
	private WebDriver driver;

	@Before
	public void init() {

		// setup chromedriver
		System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver.exe");
		// Create a new instance of the Chrome driver
		// Notice that the remainder of the code relies on the interface,
		// not the implementation.
		driver = new ChromeDriver();
		// maximize window
		// driver.manage().window().maximize();
	}

	@Test
	public void prepare() throws InterruptedException {

		testUrl = "http://rcduniya.com/login";

		// And now use this to visit myBlog
		// Alternatively the same thing can be done like this
		// driver.navigate().to(testUrl);
		driver.get(testUrl);

		WebElement emailElement = driver.findElement(By.name("email"));
		Thread.sleep(2000);
		emailElement.sendKeys("test@gmail.com");
		
		WebElement passwordElement = driver.findElement(By.name("password"));
		Thread.sleep(2000);
		passwordElement.sendKeys("pass");
		
		WebElement submitButtonElement = driver.findElement(By.xpath("//button/@type='submit'"));
		Thread.sleep(2000);
		submitButtonElement.click();
		Thread.sleep(50000);
	}

	

	@After
	public void teardown() throws IOException {
		driver.quit();
	}
}
