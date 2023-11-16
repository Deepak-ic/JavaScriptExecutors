package org.javaScriptExecutors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Challenge6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Deepak\\Documents\\mouseActions\\drivers\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		Thread.sleep(3000);
		WebElement x = d.findElement(By.xpath("//span[text()='✕']"));
		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("arguments[0].click()", x);
		WebElement signin = d.findElement(By.className("_1sLnDu"));
		js.executeScript("arguments[0].click()", signin);
	}

}
