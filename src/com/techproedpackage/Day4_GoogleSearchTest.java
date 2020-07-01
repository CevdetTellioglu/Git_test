package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4_GoogleSearchTest {
    public static void main(String[] args) {
        //  1. Bir class oluşturun : GoogleSearchTest
        //  2. Main method oluşturun ve aşağıdaki görevi  tamamlayın.
        //         A.google web sayfasına gidin. https://www.google.com/
        // b. Search(ara) “city bike”
        // c. Google'da görüntülenen ilgili sonuçların sayısını yazdırın
        //  d. “Shopping” e tıklayın.
        //  e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        System.setProperty("webdriver.chrome.driver","/Users/cevdettellioglu/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver =  new ChromeDriver();
        driver.get("https://www.google.com/");

        WebElement googleSearchBox =  driver.findElement(By.name("q"));
        googleSearchBox.click();
        googleSearchBox.sendKeys("city bike");
        googleSearchBox.submit();

        WebElement googleFindResult = driver.findElement(By.id("result-stats"));
        String allResult = googleFindResult.getText();
        System.out.println(allResult);

        driver.findElement(By.linkText("Shopping")).click();
        driver.findElement(By.className("TL92Hc")).click();

    }
}
