package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;

	public void launchBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public void launchUrl(String url) {
		driver.get(url);
	}

	public void insert(WebElement element, String data) {
		element.sendKeys(data);
	}

	public void btnClick(WebElement element) {
		element.click();

	}
	public void selectt(WebElement element , String txt) {
		Select s = new Select(element);
		s.selectByVisibleText(txt);

	}
	public String verify() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
		
	}
	public void Closee() {
		driver.quit();
	}
}
