package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_VerifyURLTestRV {
    public static void main(String[] args) {
        //1. Yeni bir class oluşturun : VerifyURLTest
        //         (URLDoğrulamaTesti)
        //2. Navigate to google homepage
        //3. Google ana sayfa URL'sinin “www.google.com” olduğunu doğrulayın(verify)
        System.setProperty("webdriver.chrome.driver","/Users/cevdettellioglu/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com");
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "www.google.com";
        if(actualURL.equals(expectedURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL "+ "\n Actuel url : "+actualURL);
        }
    }
}
