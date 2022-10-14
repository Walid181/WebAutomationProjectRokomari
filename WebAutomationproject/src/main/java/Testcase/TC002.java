package Testcase;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.Driversetup;

public class TC002 extends Driversetup{
	String baseUrl="https://www.rokomari.com/login";
	
	@Test
	public void locatorLearning2() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("j_username")).sendKeys("arnobaurthohin3@gmail.com");
		driver.findElement(By.id("j_password")).sendKeys("123456789");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		Thread.sleep(2000);
		
		Actions action=new Actions(driver);
		WebElement element=driver.findElement(By.linkText("লেখক"));
		action.moveToElement(element).build().perform();
		//hover over the element last line
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]")));
		
		WebElement element2=driver.findElement(By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]"));
		action.moveToElement(element2);
		action.click().build().perform();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//label[@for='categoryIds_677']")).click();
		Thread.sleep(2000);
		
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,200)");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//p[@class='book-title']")).click();
		Thread.sleep(3000);

		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTab.get(1));

		driver.findElement(By.xpath("(//div[@class='details-btn']//a)[2]")).click();//add to cart
		//driver.findElement(By.xpath("//*[@id='cart-icon']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[@id='js-cart-menu']")).click();//go to cart
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//a[@id='js-continue-to-shipping']")).click();
	    Thread.sleep(2000);
	    
	    WebElement dropdown=driver.findElement(By.xpath("//select[@id='js--city']"));
	    Select dropdown1=new Select(dropdown);
	    dropdown1.selectByVisibleText("নারায়ণগঞ্জ");
	    
	    
	    driver.findElement(By.cssSelector("#address")).sendKeys("Bangla-Bazar, Bankoloni");
	    Thread.sleep(2000);
	    
		
		
		
		
	
		
	}
}


