package org.emp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {
	
	private static boolean displayed;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\V2\\eclipse-workspace\\Employee\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://adactinhotelapp.com/");
		
		WebElement btnRegister = driver.findElement(By.xpath("//a[@href='Register.php']"));	
	
	btnRegister.click();
	
	WebElement agree = driver.findElement(By.id("tnc_box"));
	
	boolean b = agree.isSelected();
	System.out.println(b);
	agree.click();
	boolean b1 = agree.isSelected();
	System.out.println(b1);
	
	driver.quit();
	
	}

}
