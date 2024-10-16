package com.example;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Mini_Login {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mkrsp\\eclipse-workspace\\Selenium_ex\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("jojoc475167");
		Thread.sleep(1000);
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("jojoc475167");
		Thread.sleep(1000);
		WebElement lo = driver.findElement(By.id("login"));
		lo.click();
		Thread.sleep(1000);
		WebElement loc = driver.findElement(By.id("location"));
		Select l=new Select(loc);
		l.selectByIndex(3);
		Thread.sleep(1000);
		WebElement hote = driver.findElement(By.id("hotels"));
		Select h=new Select(hote);
		h.selectByVisibleText("Hotel Sunshine");
		Thread.sleep(1000);
		WebElement rt = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select roomt =new Select(rt);
		roomt.selectByIndex(1);
		Thread.sleep(1000);
		WebElement nr = driver.findElement(By.id("room_nos"));
		Select noroom =new Select (nr);
		noroom.selectByVisibleText("2 - Two");
		Thread.sleep(1000);
		WebElement din = driver.findElement(By.id("datepick_in"));
		din.clear();
		din.sendKeys("01/08/2024");
		Thread.sleep(1000);
		WebElement dout = driver.findElement(By.id("datepick_out"));
		dout.clear();
		dout.sendKeys("04/08/2024");
		Thread.sleep(1000);
		WebElement aroom = driver.findElement(By.id("adult_room"));
		Select ar=new Select(aroom);
		ar.selectByIndex(2);
		Thread.sleep(1000);
		WebElement chr = driver.findElement(By.id("child_room"));
		Select cr=new Select(chr);
		cr.selectByValue("1");
		Thread.sleep(1000);
		WebElement sub = driver.findElement(By.id("Submit"));
		sub.click();
		Thread.sleep(1000);
		//3
		WebElement hbook = driver.findElement(By.id("radiobutton_0"));
		hbook.click();
		Thread.sleep(1000);
		WebElement subm = driver.findElement(By.id("continue"));
		subm.submit();
		Thread.sleep(1000);
		//4
		WebElement f = driver.findElement(By.id("first_name"));
		f.sendKeys("John");
		Thread.sleep(1000);
		WebElement la = driver.findElement(By.id("last_name"));
		la.sendKeys("Marston");
		WebElement addr = driver.findElement(By.id("address"));
		addr.sendKeys("17,qqqqqqqqqqqqqqqqq,wwwwwwwwwwwwwwwwwww,eeeeeee,321132");
		Thread.sleep(1000);
		WebElement cc = driver.findElement(By.id("cc_num"));
		cc.sendKeys("75394974545");
		Thread.sleep(1000);
		WebElement ccty = driver.findElement(By.id("cc_type"));
		Select cct=new Select(ccty);
		cct.selectByVisibleText("VISA");
		Thread.sleep(1000);
		WebElement em = driver.findElement(By.id("cc_exp_month"));
		Select e=new Select(em);
		e.selectByValue("7");
		Thread.sleep(1000);
		WebElement ey = driver.findElement(By.id("cc_exp_year"));
		Select eey=new Select(ey);
		eey.selectByValue("2030");
		Thread.sleep(1000);
		WebElement ccv = driver.findElement(By.id("cc_cvv"));
		ccv.sendKeys("234");
		Thread.sleep(1000);
		WebElement bookn = driver.findElement(By.id("book_now"));
		bookn.submit();
		Thread.sleep(1000);
		WebElement myiti = driver.findElement(By.id("my_itinerary"));
		myiti.click();
		//screenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\mkrsp\\eclipse-workspace\\Selenium_ex\\screenshots\\mini1.png");
		FileHandler.copy(src, des);
		
		
	}

}
