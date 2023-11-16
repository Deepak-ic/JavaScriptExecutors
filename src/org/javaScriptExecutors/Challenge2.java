package org.javaScriptExecutors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Challenge2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Deepak\\Documents\\javaScriptExecutors\\drivers\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.get("https://toolsqa.com/");
		d.manage().window().maximize();
		WebElement chk = d.findElement(By.xpath("//div[contains(text(),'Checkout what')]"));
		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("arguments[0].scrollIntoView(true);", chk);
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(false);", chk);
	}

}
