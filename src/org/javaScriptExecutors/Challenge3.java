package org.javaScriptExecutors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Challenge3 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver",
                "C:\\Users\\Deepak\\Documents\\javaScriptExecutors\\drivers\\msedgedriver.exe");
        WebDriver d = new EdgeDriver();
        d.get("https://inmakesedu.com/");
        d.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) d;
        WebElement prg = d.findElement(By.xpath("//li[@class='current']"));
        Thread.sleep(3000);
        js.executeScript("arguments[0].scrollIntoView(true);", prg);
    }
}

