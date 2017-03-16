package org.movoto.selenium.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NeiliApplyEffectTest1  {

	private String testUrl;
	private WebDriver driver;

	@Before
	public void prepare() throws InterruptedException {
		// setup chromedriver
		System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver.exe");

		testUrl = "http://www.google.com";

		// Create a new instance of the Chrome driver
		// Notice that the remainder of the code relies on the interface,
		// not the implementation.
		driver = new ChromeDriver();

		// maximize window
		// driver.manage().window().maximize();

		// And now use this to visit myBlog
		// Alternatively the same thing can be done like this
		// driver.navigate().to(testUrl);
		driver.get(testUrl);
	}

//	@Test
//	public void treeExpant() throws IOException, InterruptedException {
//		String enactmentKey = "sg001:s2:(3) ";
//		List<String> treeKeys = formTreeKeys(enactmentKey);
//		WebElement parentElement = findParentElement("root");
//		for (String key : treeKeys) {
//			Thread.sleep(2000);
//			parentElement = findParentElement(key);
//			WebElement element = getClickArrow(parentElement);
//			element.click();
//		}
//
//		Thread.sleep(5000);
//		System.out.println("done");
//	}
//
//	private List<String> formTreeKeys(String enactmentKey) {
//		String[] keys = enactmentKey.split(":");
//		List<String> eKeys = new ArrayList<String>();
//		for (int i = 0; i < keys.length - 1; i++) {
//			List<String> b = new ArrayList<String>();
//			for (int j = 0; j <= i; j++) {
//				b.add(keys[j]);
//			}
//			eKeys.add(String.join(":", b));
//		}
//		return eKeys;
//	}
//
//	private WebElement findParentElement(String string) throws InterruptedException {
//		return findElement(string).findElement(By.xpath("..")).findElement(By.xpath(".."));
//	}
//
//	private WebElement findElement(String href) throws InterruptedException {
//		Thread.sleep(2000);
//		return driver.findElement(By.xpath(String.format(".//span[@data-href='%s']", href)));
//	}
//
//	private WebElement getClickArrow(WebElement webElement) throws InterruptedException {
//		Thread.sleep(3000);
//		return webElement.findElement(By.xpath("..")).findElement(By.xpath(".."))
//				.findElement(By.xpath(".//div[@class='bento-icon-caret-right']"));
//	}
//
//	private void expandRoots() throws InterruptedException {
//		// @ACT-MAIN @ACT-SCHEDULES @END
//		WebElement liElement = findElement("root");
//		getClickArrow(liElement).click();
//		Thread.sleep(3000);
//		List<WebElement> liElements = driver.findElements(By
//				.xpath(".//span[@data-href='@ACT-MAIN' or @data-href='@ACT-SCHEDULES' or @data-href='@END']"));
//		for (WebElement webElement : liElements) {
//			WebElement ele = getClickArrow(webElement);
//			ele.click();
//		}
//	}
//
//	private void login() throws InterruptedException {
//		Thread.sleep(3000);
//		WebElement idElement = driver.findElement(By.xpath("//input[@id='title']"));
//		idElement.sendKeys(getUserName());
//		WebElement passElement = driver.findElement(By.xpath("//input[@type='password']"));
//		passElement.sendKeys(getPassword());
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//	}

	@After
	public void teardown() throws IOException {
		driver.quit();
	}
}
