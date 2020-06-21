package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Day2_Homework {
    // 1. Yeni bir class oluşturun :Homework
    // 2. ChromeDriver'ı kullanarak facebook'a gidin ve sayfa başlığının(Page Title) "facebook" olup olmadığını doğrulayın,
    //  Değilse, doğru başlığı(Actual title) yazdırın.
    // 3. Sayfa URL'sinin facebook içerip içermediğini(contains),
    // Değilse doğru URL'yi(Actual url) yazdırın.
    // 4. Ardından Navigate to https://www.walmart.com/
    // 5. Walmart sayfa başlığının “Walmart.com” içerip
    // içermediğini(contains) doğrulayın
    // 6. Navigate back to facebook
    // 7. Sayfayı yenileyin(refresh)
    // 8. Maximize the window
    // 9. Close the browser

    public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","/Users/cevdettellioglu/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        String actuelTitle = driver.getTitle();
        String expectedTitle = "facebook";
        if(actuelTitle.equals(expectedTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL, actuel title Facebook is : "+ actuelTitle);
        }
        String actuelURL = driver.getCurrentUrl();
        String expectedURl = "facebook";
        if(actuelURL.contains(expectedURl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL, actuel URL facebook is: "+actuelURL);
        }
        driver.navigate().to("https://www.walmart.com/");
        String walmartTitle = driver.getTitle();
        String expecteWalmartTitle = "Walmart.com";
        if(walmartTitle.contains(expecteWalmartTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL actuel title Walmart is : "+walmartTitle);
        }
        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.close();

    }
}
