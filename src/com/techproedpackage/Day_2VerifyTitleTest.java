package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.SortedMap;

public class Day_2VerifyTitleTest {
    // 1.Yeni bir class oluşturun : VerifyTitleTest
    // 2. Navigate to google homepage(ana sayfa)
    // 3. Google başlığının(title) "Google" olup olmadığını doğrulayın(verify).

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/cevdettellioglu/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("ACTUEL TITLE : " + actualTitle);
            System.out.println("EXPECTED TITLE : " + expectedTitle);
        }


    }

}
