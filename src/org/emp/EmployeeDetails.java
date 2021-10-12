package org.emp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmployeeDetails {
	
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\V2\\eclipse-workspace\\Employee\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	
		driver.manage().window().maximize();
		
		
		
		WebElement login = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		login.click();
		
		WebElement txtsearch = driver.findElement(By.xpath("//input[@class='_3704LK']"));
	    txtsearch.sendKeys("iphone", Keys.ENTER);
	Thread.sleep(3000);
	WebElement iphone = driver.findElement(By.xpath("//div[@class='_4rR01T']"));
	
	iphone.click();
	
	String handle = driver.getWindowHandle();
	System.out.println(handle);
	
	Set<String> allwindowHandles = driver.getWindowHandles();
	
	System.out.println(allwindowHandles);
	
	for (String x : allwindowHandles) {
		
		if (!handle.equals(x)) {
			driver.switchTo().window(x);
			
		}
		
	}
	
	WebElement addcart = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
	
	addcart.click();
	}
	
	
	
	
	
	

}
