package org.javaScriptExecutors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Challenge4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"C:\\\\Users\\\\Deepak\\\\Documents\\\\javaScriptExecutors\\\\drivers\\\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.get("https://en-gb.facebook.com/");
		d.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor)d;
		WebElement usrid = d.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','deepak@gmail.com')", usrid);
		WebElement pass = d.findElement(By.id("pass"));
		js.executeScript("arguments[0].setAttribute('value','deepak')", pass);
		WebElement login = d.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", login);
		
	}

}
