package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Day2Review {
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

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/cevdettellioglu/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com");
        String actualTitle = driver.getTitle();
        String expectedTitle = "youtube";
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("ACTUEL TITLE : " + actualTitle);
            System.out.println("EXPECTED TITLE : " + expectedTitle);
        }
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "youtube";

        if (actualURL.contains(expectedURL)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("ACTUEL URL : " + actualURL);
            System.out.println("EXPECTED URL : " + expectedURL);

        }
        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.manage().window().maximize();

        String actualTitle1 = driver.getTitle();
        String expectedTitle1 ="Amazon";
        if (actualTitle1.contains(expectedTitle1)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("ACTUEL TITLE : " + actualTitle1);
            System.out.println("EXPECTED TITLE : " + expectedTitle1);
        }
        String actualURL1 = driver.getCurrentUrl();
        String expectedURL1 = "https://www.amazon.com/";

        if (actualURL1.contains(expectedURL1)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("ACTUEL URL : " + actualURL1);
            System.out.println("EXPECTED URL : " + expectedURL1);

        }
        driver.quit();


    }
}
