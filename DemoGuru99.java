package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoGuru99 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\selenium\\SeleniumPractice\\Driver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement source1 = driver.findElement(By.id("credit2"));
		WebElement destiny = driver.findElement(By.id("bank"));
		Actions actions= new Actions(driver);
		actions.dragAndDrop(source1, destiny).perform();
		WebElement source2 = driver.findElement(By.id("fourth"));
		WebElement destiny2 = driver.findElement(By.id("amt7"));
		actions.dragAndDrop(source2, destiny2).perform();
		WebElement source3= driver.findElement(By.id("fourth"));
		WebElement destiny3 = driver.findElement(By.id("amt8"));
		actions.dragAndDrop(source3, destiny3).perform();
		WebElement source4= driver.findElement(By.id("credit1"));
		WebElement destiny4 = driver.findElement(By.id("loan"));
		actions.dragAndDrop(source4, destiny4).perform();
		WebElement txt = driver.findElement(By.xpath("//*[@id=\"equal\"]/a"));
		String output = txt.getText();
		System.out.println(output);
		
		
		
		
		
	}

}
