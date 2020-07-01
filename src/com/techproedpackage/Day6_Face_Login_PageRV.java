package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6_Face_Login_PageRV {
    //Bir class oluşturun : Face_Login_Page
    //	1. https://www.facebook.com/ facebook sayfasina gidin.
    //2. username ve password gecerli mi test edin.
    //	Username = "testusername"
    //	Password  =  "testpassword"
    //	Step 1. locate username box
    //	Step 2. locate password box
    //	Step 3. locate signin button
    //	Step 4. click sign in button
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/cevdettellioglu/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        //input[@id='email']

        //	Step 1. locate username box
        driver.manage().window().maximize();
        WebElement userTextBox = driver.findElement(By.id("email"));
        userTextBox.sendKeys("testusername");
        //	Step 2. locate password box
        WebElement passwordTextBox = driver.findElement(By.id("pass"));
        passwordTextBox.sendKeys("testpassword");
        //	Step 3. locate signin button
        WebElement signUp = driver.findElement(By.id("u_0_b"));
        //	Step 4. click sign in button
        signUp.click();

        // ====Prof Solutions====
        //         driver.manage().window().maximize();
        //        //2. username ve password gecerli mi test edin.
        //        //Username = "testusername"
        //        //Password  =  "testpassword"
        //        //Step 1. locate username box
        //        WebElement emailTextBox = driver.findElement(By.xpath("//input[@type='email']"));
        //        emailTextBox.sendKeys("testusername");
        //        //Step 2. locate password box
        //        WebElement passwordTextBox = driver.findElement(By.xpath("//input[@name='pass']"));
        //        passwordTextBox.sendKeys("testpassword");
        //        //Step 3. locate signin button
        //        WebElement logInButton = driver.findElement(By.xpath("//input[@type='submit']"));
        //        //Step 4. click sign in button
        //        logInButton.click();

        driver.navigate().to("https://www.facebook.com");
        //Aynı classi kullanarak;
        //1.Asagidaki web elementlerini locate edin ve textlerini konsolda yazdirin.
        //"Sign Up"
        //"Connect with friends and the world around you on Facebook."

        //2.First name , Last name, Mobile number or email, New password text boxlarini locate edin ve verilen test datalarini text boxlara gonderin.
        //First name = testfirstname
        //Last name = testlastname
        //Mobile number or email = test@gmail.com
        //New Password = testpassword
        WebElement createAccountText = driver.findElement(By.xpath("//span[.='Create an account']"));
        System.out.println("CREATE ACCOUNT TEXT " + createAccountText.getText());
        WebElement message = driver.findElement(By.xpath("//div[@class='_5iyx']"));
        System.out.println("FACEBOOK LOGIN PAGE MESSAGE: " + message.getText());
        WebElement firstNameTextBox = driver.findElement(By.xpath("//input[@type='text']"));
        firstNameTextBox.sendKeys("testfirstname");
        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("testlastname");
        WebElement eMail = driver.findElement(By.xpath("//input[@name='reg_email__']"));
        eMail.sendKeys("test@gmail.com");
        WebElement newPassword = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
        newPassword.sendKeys("testpassword");




    }

}
