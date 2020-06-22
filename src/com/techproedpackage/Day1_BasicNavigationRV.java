package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1_BasicNavigationRV {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/cevdettellioglu/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        //1. Aynı class ta, Navigate to amazon home page  https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(3000);
        driver.navigate().back(); // 2.Navigate forward to amazon
        Thread.sleep(3000);
        driver.navigate().forward(); // 3.Navigate forward to amazon
        Thread.sleep(3000);
        driver.navigate().refresh(); // 4.Refresh(yenile) the web page
        Thread.sleep(3000);
        driver.manage().window().maximize(); // 5.Maximize the window
        Thread.sleep(3000);
        driver.quit(); // 5. Close/Quit the browser
        Thread.sleep(3000);
        System.out.println("Github deneme");

    }
}
