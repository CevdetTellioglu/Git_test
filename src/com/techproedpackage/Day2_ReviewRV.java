package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Day2_ReviewRV {
    public static void main(String[] args) {
         /*
            1. Create a class : Day2Review
            2. ChromeDriver kullanarak, youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın(verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
            3. Sayfa URL'sinin “youtube” içerip içermediğini(contains) doğrulayın, içermiyorsa doğru URL'yi yazdırın.
            4. Daha sonra Navigate to https://www.amazon.com/
            5. Navigate back to youtube
            6. Refresh the page
            7. Navigate forward to amazon
            8. Maximize the window
            9. Ardından sayfa başlığının "Amazon" içerip içermediğini(contains) doğrulayın, Yoksa doğru başlığı(Actual Title) yazdırın.
            10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın
            11.Quit the browser
        */
        System.setProperty("webdriver.chrome.driver","/Users/cevdettellioglu/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com");
        String actualTitle = driver.getTitle();
        String expectedTitle = "youtube";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUEL TITLE : " + actualTitle);
            System.out.println("EXPECTED TITLE : " + expectedTitle);
        }

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "youtube";
        if(actualTitle.contains(expectedURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUEL URL : "+ actualURL);
            System.out.println("EXPECTED URL : "+ expectedURL);
        }
        driver.navigate().to("https://www.amazon.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.manage().window().maximize();
        String actualPageTitle= driver.getTitle();
        String expectedPageTitle = "Amazon";
        if(actualPageTitle.contains(expectedPageTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Actuel Title : "+actualPageTitle);
        }
        String actuelPageURL = driver.getCurrentUrl();
        String expectedPageURl = "https://www.amazon.com/";
        if(actuelPageURL.equals(expectedPageURl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
    driver.quit();


    }
}
