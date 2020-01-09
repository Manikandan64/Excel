package org.maersk.Maven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseExcel extends ExcelCopy{
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mani\\eclipse-workspace\\Ticketech\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement login = driver.findElement(By.id("email"));
		login.sendKeys(getdata(1, 0));
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(getdata(1, 1));

	}

}
