package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


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
       // 7) Sayfadaki toplam link sayısını bulun.
       // 8) Sayfadaki bütün Web Elements sayısını bulun. (KENDİM EKLEDİM)
       // 9) Sayfadan Sign Out (çıkış) yapın


    }
}
