package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4_GoogleSearchTestRv {
    //  1. Bir class oluşturun : GoogleSearchTest
    //  2. Main method oluşturun ve aşağıdaki görevi  tamamlayın.
    //         A.google web sayfasına gidin. https://www.google.com/
    // b. Search(ara) “city bike”
    // c. Google'da görüntülenen ilgili sonuçların sayısını yazdırın
    //  d. “Shopping” e tıklayın.
    //  e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/cevdettellioglu/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        WebElement googleSearchBox = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
        googleSearchBox.click();
        googleSearchBox.sendKeys("city bike");
        googleSearchBox.submit();

        WebElement googleFindResult = driver.findElement(By.xpath("//*[@id=\"result-stats\"]"));
        String allResult = googleFindResult.getText();
        System.out.println(allResult);

        driver.findElement(By.xpath("//*[@id=\"hdtb-msb-vis\"]/div[4]/a")).click(); // Shopping kismi xpath i

        driver.findElement(By.className("TL92Hc")).click();       // gorunen ilk fotograf xpath i



    }
}

