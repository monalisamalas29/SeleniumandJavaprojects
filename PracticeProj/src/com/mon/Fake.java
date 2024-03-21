package com.mon;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91959\\Downloads\\chromedriver-win64\\chromedriver-win64\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//driver.findElements(By.xpath("//input[@name = 'email']")).sendKeys("This@gmail.com");
		//driver.findElement(((WebElement) By.name("login")).click();
		//driver.findElement(By.id("email")).sendKeys("monalisamalas@gmail.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		List<WebElement> birthname = driver.findElements(By.xpath("//select[@id = 'month']/option"));
		
		System.out.println(birthname.size());
		
		driver.close();
	



	}

}
