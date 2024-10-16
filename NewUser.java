package com.example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mini_Project {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mkrsp\\eclipse-workspace\\Selenium_ex\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		//		Thread.sleep(1500);
				driver.manage().window().maximize();
		//New User
		WebElement newu = driver.findElement(By.xpath("//a[contains(text(),'New User')]"));
		newu.click();
		Thread.sleep(1500);
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("jojoc475167");
		Thread.sleep(1500);
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("jojoc475167");
		Thread.sleep(1500);
		WebElement repass = driver.findElement(By.id("re_password"));
		repass.sendKeys("jojoc475167");
		Thread.sleep(1500);
		WebElement fulln = driver.findElement(By.id("full_name"));
		fulln.sendKeys("jojocccc");
		Thread.sleep(1500);
		WebElement email = driver.findElement(By.id("email_add"));
		email.sendKeys("kyhiluzi@clip.lat");
		Thread.sleep(10000);
		WebElement tc = driver.findElement(By.xpath("//input[@type='checkbox']"));
		tc.click();
		WebElement sub = driver.findElement(By.id("Submit"));
		sub.click();


	}

}
