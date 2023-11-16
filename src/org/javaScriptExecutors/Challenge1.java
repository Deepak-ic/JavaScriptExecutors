package org.javaScriptExecutors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Challenge1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Deepak\\Documents\\javaScriptExecutors\\drivers\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.get("https://inmakesedu.com/");
		d.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)d;
		WebElement inmakes = d.findElement(By.xpath("//p[contains(text(),'Inmakes offer various kinds')]"));
		js.executeScript("arguments[0].scrollIntoView(true)", inmakes);
		Object pera = js.executeScript("return arguments[0].getAttribute('value')", inmakes);
		System.out.println(pera);
	}

}
