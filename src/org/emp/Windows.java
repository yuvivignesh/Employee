package org.emp;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Windows {
	
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\V2\\eclipse-workspace\\Employee\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		
		List<WebElement> tHeads= driver.findElements(By.tagName("th"));
		
		for (int i = 0; i < tHeads.size(); i++) {
			WebElement head = tHeads.get(i);
			String text = head.getText();
			System.out.println(text);
				
				}
				
				
			}
			
			}
	
	