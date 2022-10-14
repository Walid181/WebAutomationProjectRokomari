package Testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.Driversetup;

public class TC003 extends Driversetup {
	String baseUrl="https://www.rokomari.com/book";
	@Test
	public void locatorLearning3() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		Actions action=new Actions(driver);
		WebElement element=driver.findElement(By.linkText("লেখক"));
		action.moveToElement(element).click().perform();
		
		//hover over the element last line
		/*
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]")));
		
		WebElement element2=driver.findElement(By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]"));
		action.moveToElement(element2);
		action.click().build().perform();
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		*/
		
		
		
		
		
		

}
}
