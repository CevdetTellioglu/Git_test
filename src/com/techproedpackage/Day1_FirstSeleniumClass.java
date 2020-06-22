package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Day1_FirstSeleniumClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/cevdettellioglu/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        Thread.sleep(5000);
        // close() ve quit() her iki method da tarayiciyi kapatir
        // close() ==>>  mevcut sayfayi kapatir
        // quit() ==>> acilan tum sayfalari kapatir. daha guclu
        driver.close();
    }
}
