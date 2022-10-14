package Testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Driversetup;

public class TC001 extends Driversetup {
	String baseUrl="https://www.rokomari.com/book";
	
	
	@Test
	public void locatorLearning() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.xpath("//body[1]/header[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/a[1]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/section[1]/div[2]/div[1]/p[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("nm")).sendKeys("Arnob");
		Thread.sleep(2000);
		 driver.findElement(By.id("js-email")).sendKeys("arnobaurthohin3@gmail.com");
		 Thread.sleep(2000);
		 driver.findElement(By.id("js-phone")).sendKeys("01913939942");
		 Thread.sleep(2000);
		 driver.findElement(By.id("pwd")).sendKeys("123456789");
		 Thread.sleep(2000);
		 //driver.findElement(By.xpath("//body[1]/div[3]/div[1]/section[1]/div[2]/div[3]/form[1]/div[6]/div[1]/div[1]")).click();
		 //Thread.sleep(2000);
		 driver.findElement(By.className("g-recaptcha")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//body[1]/div[3]/div[1]/section[1]/div[2]/div[3]/form[1]/button[1]")).click();
		 Thread.sleep(5000);
		
		
		
	}
	
	
	}
	
	


