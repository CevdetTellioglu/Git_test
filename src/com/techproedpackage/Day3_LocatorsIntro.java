package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class Day3_LocatorsIntro {
    //Bir class oluşturun: LocatorsIntro
    //Main method oluşturun ve aşağıdaki görevi tamamlayın.
    //        http://a.testaddressbook.com/sign_in  adresine gidiniz.
    //email textbox,password textbox, and signin button elementlerini locate ediniz..
    //Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
    //Username :  testtechproed@gmail.com
   // Password : Test1234!
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/cevdettellioglu/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");

        //email textbox,password textbox, and signin button elementlerini locate ediniz..
       WebElement emailTextBox = driver.findElement(By.id("session_email"));
       emailTextBox.sendKeys("testtechproed@gmail.com");
        //password textbox locate
        WebElement passwordTextBox = driver.findElement(By.id("session_password"));
        passwordTextBox.sendKeys("Test1234!");

       //sing in Button locate
       WebElement singinButton = driver.findElement(By.name("commit"));
        singinButton.click();

       //Expected user id nin testtechproed@gmail.com  oldugunu dogrulayin(verify).
        WebElement userId = driver.findElement(By.className("navbar-text"));
        System.out.println("USER ID WEBELEMENT ==>"+userId);
        System.out.println("USER ID TEXT => "+userId.getText());
        String actualUserId = userId.getText();
        String expectedUserId = "testtechproed@gmail.com";
        if(actualUserId.equals(expectedUserId)) {
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
        //“Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement addressLink = driver.findElement(By.linkText("Addresses"));
        String actualAddressText = addressLink.getText();
        String expectedAddressesText = "Addresses";
        if(actualAddressText.equals(expectedAddressesText)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
        WebElement signOutLink = driver.findElement(By.linkText("Sign out"));
        String actualSignOutLink = signOutLink.getText();
        String expectedSignOutLink = "Sign Out";
        if(actualSignOutLink.equals(expectedSignOutLink)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
        //By.partialLinkText
        //ADDRESSES Link
        WebElement addressPartialLink = driver.findElement(By.partialLinkText("esse"));
        String actualAddressPartialLinkText = addressPartialLink.getText();
        System.out.println("ADRESSES PARTIAL LINK TEST :"+actualAddressPartialLinkText);
        // Sign out link
        WebElement signOutPartialLink = driver.findElement(By.partialLinkText("out"));
        String signOutPartialLinkText = signOutPartialLink.getText();
        System.out.println(signOutPartialLinkText);

        //Sayfadaki toplam link sayisini bulun ve bu linkleri konsolda yazdirin
        //findElement(); methodu yalnizca tek bir elementi locate icin kullanilir. String return eder
        //findElement(); methodu birden fazla element return eder. List<WebElement>

        List<WebElement> listOfWebElement = driver.findElements(By.tagName("a"));
        System.out.println("Bu web sayfasinda "+listOfWebElement.size()+" tane link vardir.");

        //Linkleri tek tek yazdirin
        // 3 tane link elementi var. 1. elelementin indexini 0 aliriz
        System.out.println("1. WEB ELEMENT : "+listOfWebElement.get(0)); // reference verir

        System.out.println("1. LINK TEXT : "+ listOfWebElement.get(0).getText()); // link adini verir
        System.out.println("2. LINK TEXT : "+ listOfWebElement.get(1).getText()); // 2.link adini verir
        System.out.println("3. LINK TEXT : "+ listOfWebElement.get(2).getText()); // 3.link (text) adini verir

         // hepsini tek seferde yazdirma

        for (WebElement w: listOfWebElement) {
            System.out.println(w.getText());
        }
        int i =0;
        for (WebElement w: listOfWebElement) {
            System.out.println(++i + ". link  : " + w.getText());
        }
        }
}
