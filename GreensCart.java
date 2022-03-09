package org.GreensDoubleClick;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensCart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\selenium\\SeleniumPractice\\Driver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenscart.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement txtfirstname = driver.findElement(By.xpath("//input[@id='loginEmailId']"));
		txtfirstname.sendKeys("Ajith.mak2@gmail.com");
		WebElement txtpwd = driver.findElement(By.xpath("//input[@id='loginPassword']"));
		txtpwd.sendKeys("@123Aj");
		WebElement btnlogin = driver.findElement(By.xpath("//div[@class='col-md-6']//input[@type='submit']"));
		btnlogin.click();
		
		Thread.sleep(5000);
		WebElement txtsearch = driver.findElement(By.xpath("//*[@id=\"typeahead-basic\"]"));
		txtsearch.sendKeys("Apple Iphone 12",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"basicExampleNav\"]/ul[2]/li[1]/ngbd-typeahead-basic/div/button")).click();
		
		WebElement btnAddtoCart = driver.findElement(By.xpath("//*[@id=\"products\"]/div/div[2]/div[2]/div/div/button[1]"));
		btnAddtoCart.click();
		Thread.sleep(3000);
		WebElement btnCart = driver.findElement(By.xpath("//*[@id=\"basicExampleNav\"]/ul[2]/li[3]/div/a"));
		btnCart.click();
		WebElement btnAddCart = driver.findElement(By.xpath("//*[@id=\"mainContainer\"]/main/app-cart-products/div[1]/div/div/div/div/div[2]/div/div[2]/div[3]/div/button"));
		btnAddCart.click();
	
		WebElement Dclickprom= driver.findElement(By.xpath("//span[text()='GRNSHIP']"));
		Actions actions =new Actions(driver);
		actions.moveToElement(Dclickprom);
		//Thread.sleep(3000);
		Thread.sleep(2000);
		actions.doubleClick(Dclickprom).perform();
		
		
		WebElement removepromo = driver.findElement(By.xpath("//span[@class='px-1 close']"));
		actions.contextClick(removepromo).perform();
		
		
		WebElement Btnremovepromo = driver.findElement(By.xpath("//div[contains(text(),'Remove Promo Code')]"));
		Btnremovepromo.click();			
	}

}
