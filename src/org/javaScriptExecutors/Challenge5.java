package org.javaScriptExecutors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Challenge5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"C:\\\\Users\\\\Deepak\\\\Documents\\\\javaScriptExecutors\\\\drivers\\\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.get("http://adactinhotelapp.com/");
		d.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor)d;
		WebElement usrid = d.findElement(By.id("username"));
		js.executeScript("arguments[0].setAttribute('value','deepak@gmail.com')", usrid);
		WebElement pass = d.findElement(By.id("password"));
		js.executeScript("arguments[0].setAttribute('value','deepak')", pass);
		WebElement log = d.findElement(By.id("login"));
		js.executeScript("arguments[0].click()", log);
		
	}

}
