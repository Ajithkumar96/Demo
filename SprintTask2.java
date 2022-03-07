package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SprintTask2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\selenium\\SeleniumPractice\\Driver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://sprint.com");
		driver.manage().window().maximize();		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id='tntButtonToClose']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"phx-cookie-modal\"]/div[2]/div/div[2]/div/div[2]/button")).click();
		
		WebElement lnkphonedevice = driver.findElement(By.xpath("//*[text()='Phones & devices']"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(lnkphonedevice).perform();
		
		driver.findElement(By.xpath("//a[contains(text(),'5G phones')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'5G phones')]")).click();
		
		String text = driver.findElement(By.xpath("//a[@id='digital-footer-bottom-link-bottom-9']")).getText();
		
		System.out.println(text);	
		driver.quit();
		
	}

}
