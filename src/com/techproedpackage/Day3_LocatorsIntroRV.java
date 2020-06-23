package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Day3_LocatorsIntroRV {
    public static void main(String[] args) {
//Bir class oluşturun: LocatorsIntro
        //Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //        http://a.testaddressbook.com/sign_in  adresine gidiniz.
        //email textbox,password textbox, and signin button elementlerini locate ediniz..
        //Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //Username :  testtechproed@gmail.com
        // Password : Test1234!

        System.setProperty("webdriver.chrome.driver","/Users/cevdettellioglu/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://a.testaddressbook.com/sign_in");
        // email textbox locate
        WebElement emailTextBox = driver.findElement(By.id("session_email"));
        emailTextBox.sendKeys("testtechproed@gmail.com");
        //password textbox locate
        WebElement passwordTextBox = driver.findElement(By.id("session_password"));
        passwordTextBox.sendKeys("Test1234!");
        //signin button elementlerini locate
        WebElement singInButton = driver.findElement(By.name("commit"));
        singInButton.click();

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
    }
}
