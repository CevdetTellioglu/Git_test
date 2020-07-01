package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Day5_Locators_CssRv {
    /*Bir class oluşturun : Locators_css
    Main method oluşturun ve aşağıdaki görevi  tamamlayın.
    Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
    Locate email textbox
    Locate password textbox ve
    Locate signin button
    Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
    Username :  testtechproed@gmail.com
    Password : Test1234!
    */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/cevdettellioglu/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");
        // Locate email textbox
        WebElement emailTextBox = driver.findElement(By.cssSelector("input[type='email']"));
        emailTextBox.sendKeys("testtechproed@gmail.com");
        //Locate password textbox

        WebElement passwordTextBox = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        passwordTextBox.sendKeys("Test1234!");
        //Locate signin button
        WebElement signinButton = driver.findElement(By.cssSelector("input[value='Sign in']"));
        signinButton.click();




    }
}
